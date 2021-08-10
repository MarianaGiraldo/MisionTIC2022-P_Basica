/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author maria
 */
public class DB {
    private String user = "root";
    private String password = "";
    private String url="jdbc:mysql://localhost:3306/covid";
    private String driver = "com.mysql.cj.jdbc.Driver";
    
    private String userTest = "root";
    private String passwordTest = "";
    private String urlTestInit = "jdbc:h2:mem:test;MODE=MYSQL;INIT=RUNSCRIPT FROM 'C:/NetBeansProjects/S6-RetoCovidPruebas/covid-test-1.sql';DB_CLOSE_DELAY=-1";
    private String urlTest = "jdbc:h2:mem:test;MODE=MYSQL;";
    private String driverTest = "org.h2.Driver";
    
    public DB(){
        try{
            if( DBConf.testMode )
                Class.forName( driverTest );
            else
                Class.forName( driver );
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.err.println("No se puede conectar a la base de datos.");
        }
    }
    
    
    public Connection createConnection(){
        Connection conn = null;
        
        if( DBConf.testMode ){
            try{
//                System.out.println("Entra a la base de datos de prueba");
                conn = DriverManager.getConnection(this.urlTest, this.userTest, this.passwordTest);
            }catch(SQLException e){
                e.printStackTrace();
                System.err.println("Error al obtener el conector de la base de datos de prueba");
            }
        } else {
            try{
                conn = (Connection) DriverManager.getConnection(url, user, password);
//                System.out.println("Entra a la base de datos real");
            } catch( SQLException e){
                e.printStackTrace();
                System.err.println("Error al obtener el conector");
            }
        }
        
        return conn;
    }
    
    
    public Connection startTestDB(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(this.urlTestInit, this.userTest, this.passwordTest);
        } catch( SQLException e){
            e.printStackTrace();
            System.err.println("Error al obtener el conector");
        }
        return conn;
    }
    
}
