/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import utils.db.DB;
import utils.db.Perseverance;

/**
 *
 * @author maria
 */
public class Municipio extends Perseverance {
    private Integer id;
    private String nombre;
    private Integer codigo;
    private Departamento departamento;

    public Municipio() {
    }
    
    
    public Municipio getMunicipioById(Integer id){
        Municipio mun = null;
        
        try(Connection conn = createConnection()){
            String query = "SELECT mun.id, mun.departamento_id, mun.nombre, mun.codigo "
                    + "     FROM municipio mun WHERE mun.id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            int row_count = 0;
            while( result.next() ){
                row_count++;
                
                if( row_count > 1)
                    throw new Exception("Se encontro más de un resultado.");
                
                this.id = result.getInt(1);
                this.nombre = result.getString(3);
                this.codigo = result.getInt(4);
                this.departamento = new Departamento().get( result.getInt(2) );
                
                mun = this;
            }
            
            if( row_count == 0)
                throw new Exception("No se encontro el registro. ");
            
        }catch(Exception e){
            System.err.println(e);
            System.err.println("No se puedo obtener la información del objeto id=" + id + " en la tabla municipio.");
        }
        
        return mun;
    }
    
    
    @Override
    public Object get(Integer id) throws Exception {
        Municipio municipio = null;
        
        try( Connection conn =  createConnection() ){
            String query = "SELECT m.id, m.nombre, m.codigo, m.departamento_id"
                    + "     FROM municipio m WHERE m.id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            int row_count = 0;
            while( result.next() ){
                row_count++;
                
                if( row_count > 1)
                    throw new Exception("Se encontro más de un resultado.");
                
                this.id = result.getInt(1);
                this.nombre = result.getString(2);
                this.codigo = result.getInt(3);
                this.departamento = new Departamento().get( result.getInt(4) );
                
                municipio = this;
            }
            
            if( row_count == 0)
                throw new Exception("No se encontro el registro.");
            
        }catch(Exception e){
            System.err.println(e);
            throw new Exception("No se puedo obtener la información del objeto id=" + id + " en la tabla municipio.");
        }
        
        return municipio;
    }

    @Override
    public Integer save() throws Exception {
        String query;
        
        try(Connection conn = createConnection()){
            if( this.id == null )
                query = "INSERT INTO municipio (nombre, codigo, departamento_id) VALUES (?, ?, ?)";
            else
                query = "UPDATE municipio SET nombre=?, codigo=?, departamento_id=? WHERE id=? ";
           
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, this.nombre);
            statement.setInt(2, this.codigo);
            statement.setInt(3, this.departamento.getId() );
            
            if( this.id != null ){
                statement.setInt(4, this.id);
            }
            
            int rows = statement.executeUpdate();
            
            if( rows > 0 ){
                ResultSet generateKeys = statement.getGeneratedKeys();
                if( generateKeys.next() )
                    this.id = generateKeys.getInt(1);
            }
                    
        } catch(Exception e){
            e.printStackTrace();
            throw new Exception("Error al crear/editar el registro en la tabla municipio");
        }
        
        return this.id;
    }

    @Override
    public Integer delete() throws Exception {
        Integer id = null;
        
        try(Connection conn = createConnection() ){
            String query = "DELETE FROM municipio WHERE id=? ";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, this.id);
            int rows = statement.executeUpdate();
            
            if( rows > 0 ){
                ResultSet generateKeys = statement.getGeneratedKeys();
                if( generateKeys.next() )
                    id = generateKeys.getInt(1);
            }
                    
        } catch(Exception e){
            System.err.println(e);
            throw new Exception("Error al editar el registro en la tabla departamento");
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
}
