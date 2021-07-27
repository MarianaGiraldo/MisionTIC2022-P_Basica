/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.jdbc.result.ResultSetFactory;
import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import utils.db.DB;

/**
 *
 * @author maria
 */
public class Departamento {
    private DB db;
    
    private Integer id;
    private String nombre;
    private Integer codigo;

    public Departamento() {
        db = new DB();
    }
    
    public Departamento getDepartamentoById(Integer id){
        Departamento dep =null;
        try(Connection conn = db.createConnection()) {
            String query = "SELECT * FROM departamento dep WHERE dep.id= ?";
            PreparedStatementWrapper statement = (PreparedStatementWrapper) conn.prepareStatement(query);
            statement.setInt(1,id);
            ResultSetImpl result =  (ResultSetImpl) statement.executeQuery();
            
            int row_count = 0;
            while( result.next()){
                row_count++;
                if(row_count>1){
                    
                }
            }
            
            
        } catch (Exception e) {
            System.err.println("No se pudo obtener la infomcion del objeto id= "+id+" en la tabla departamento");
            
            
        }
        
        
        return dep;
        
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
