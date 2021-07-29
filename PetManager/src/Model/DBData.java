/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author maria
 */
public class DBData {
   private final String driver = "com.mysql.jdbc.Driver";
   private final String user = "root";
   private final String password = "";
   private final String url = "jdbc:mysql://localhost:3306/petmanagerdb";

   private Connection connection;

    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public Connection getConnection() {
        return connection;
    }
    
    
}
