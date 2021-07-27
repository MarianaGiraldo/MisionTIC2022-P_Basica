/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author maria
 */
public class DB {
    private String user = "root";
    private String password = "";
    private String url="jdbc:mysql://localhost:3306/covid";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public DB() {
        try {
            Class.forName( driver );
            
            
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("No se puede conectar a la base de datos");
        }
    }
    
    
    public Connection createConnection(){
        Connection conn = null;
        
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.err.println("Error al obtener el conector");
        }
        
        
        return conn;
    }
    
    
}
