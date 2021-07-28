/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                throw new Exception("No se encontro el registro.");
            
        }catch(Exception e){
            System.err.println("No se puedo obtener la información del objeto id=" + id + " en la tabla municipio.");
        }
        
        return mun;
    }
    
    
    @Override
    public Object get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
