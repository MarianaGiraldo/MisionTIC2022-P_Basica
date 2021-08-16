/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import utils.db.Perseverance;

/**
 *
 * @author maria
 */
public class Departamento extends Perseverance {
    private Integer id;
    private String nombre;
    private Integer codigo;
    

    public Departamento() {
    }
    
    public Object getByCode(Integer code) {
        Departamento dep = null;
        
        try(Connection conn = super.createConnection()){
            String query = "SELECT dep.id, dep.nombre, dep.codigo FROM departamento dep WHERE dep.codigo = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, code);
            ResultSet result = statement.executeQuery();
            
            int row_count = 0;
            while( result.next() ){
                row_count++;
                
                if( row_count > 1)
                    throw new Exception("Se encontro más de un registro con el codigo="+code);
                            
                this.id = result.getInt("id");
                this.nombre = result.getString("nombre");
                this.codigo = result.getInt("codigo");
                dep = this;
            }
            
            if( row_count == 0)
                throw new Exception("No se encontro el registro con el codigo="+code+" en la tabla departamento");
            
        } catch(Exception e){
            System.out.println("No se puede encontrar el elemento codigo=" + code + " de la tabla Departamento");
        }
        
        return dep;
    }
    
    @Override
    public Departamento get(Integer id){
        Departamento dep = null;
        
        try( Connection conn =  createConnection() ){
            String query = "SELECT dep.id, dep.nombre, dep.codigo "
                    + "     FROM departamento dep WHERE dep.id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            int row_count = 0;
            while( result.next() ){
                row_count++;
                
                if( row_count > 1)
                    throw new Exception("Se encontro mas de un resultado.");
                
                this.id = result.getInt(1);
                this.nombre = result.getString(2);
                this.codigo = result.getInt(3);
                
                dep = this;
            }
            
            if( row_count == 0)
                throw new Exception("No se encontro el registro.");
            
        }catch(Exception e){
            System.err.println(e.getMessage());
            System.err.println("No se puedo obtener la informacion del objeto id=" + id + " en la tabla departamento.");
        }
        
        return dep;
    }
    
    
    @Override
    public Integer save(){
        String query;
        
        try(Connection conn = createConnection()){
            if( this.id == null )
                query = "INSERT INTO departamento (nombre, codigo) VALUES (?, ?)";
            else
                query = "UPDATE departamento SET nombre=?, codigo=? WHERE id=? ";
            System.out.println("Query: "+query);
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, this.nombre);
            statement.setInt(2, this.codigo);
            
            if( this.id != null ){
                statement.setInt(3, this.id);
            }
            
            int rows = statement.executeUpdate();
            System.out.println("Statement Save Dept executed");
            
            if( rows > 0 ){
                ResultSet generateKeys = statement.getGeneratedKeys();
                if( generateKeys.next() )
                    this.id = generateKeys.getInt(1);
            }
                    
        } catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }
        
        return this.id;
    }
    
    
    
    @Override
    public Integer delete(){
        Integer id = null;
        
        try(Connection conn = createConnection() ){
            String queryMun = "DELETE FROM municipio WHERE departamento_id=? ";
            PreparedStatement statementMun = conn.prepareStatement(queryMun, Statement.RETURN_GENERATED_KEYS);
            statementMun.setInt(1, this.id);
            statementMun.executeUpdate();
            System.out.println("Municipios con id="+this.id+" de departamento eliminados");
            
            String query = "DELETE FROM departamento WHERE id=? ";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, this.id);
            int rows = statement.executeUpdate();
            System.out.println("Departamento eliminado");
            
            if( rows > 0 ){
                return this.id;
            }
                    
        } catch(Exception e){
            System.err.println(e);
            System.err.println("Error al editar el registro en la tabla departamento");
        }
        
        return id;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    
}
