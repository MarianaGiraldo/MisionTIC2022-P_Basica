/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maria
 */
public class modelCat {
    private final DBData dbData;
    public modelCat() {
        this.dbData = new DBData();
    }
    
    public boolean CreatePet(clsCat cat){
        //System.out.println("Entró a la función Create");
       try(Connection conn = (Connection) DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
           //System.out.println("Entró a la conexión");
           String query = "INSERT INTO tb_pet (code, name,born_year,color, healthStatus) VALUES (?, ?, ?, ?, ?)";
           PreparedStatement statementPet = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           statementPet.setString(1, cat.getCode());
           statementPet.setString(2, cat.getName());
           statementPet.setInt(3, cat.getBorn_year());
           statementPet.setString(4, cat.getColor());
           statementPet.setString(5, cat.getHealth_Status());
           int rowsInserted = statementPet.executeUpdate();
           
           if (rowsInserted > 0){
               //System.out.println("Statement Pet ejecutado");
               ResultSet generatedKeys= statementPet.getGeneratedKeys();
               if(generatedKeys.next()){
                   int idPet = generatedKeys.getInt(1);
                   query = "Insert into tb_cat (breed, id_pet) VALUES (?, ?)";
                   PreparedStatement statementCat = conn.prepareStatement(query);
                   statementCat.setString(1, cat.getBreed());
                   statementCat.setInt(2, idPet);
                   rowsInserted = statementCat.executeUpdate();
                   if (rowsInserted > 0){
                       //System.out.println("Statement Cat ejecutado");
                       return true;
                   }
               }
           }
           
           return false;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return false;
       }
       
        
    }
    
    
    public boolean UpdatePet(clsCat cat){
       try{
           
           return true;
       }catch (Exception e) {
           return false;
       }
        
    }
    
    public boolean DeletePet(clsCat cat){
       try{
           return true;
       }catch (Exception e) {
           return false;
       }
        
    }
    
    public clsPet SearchPet(String code){
        clsCat cat = null;
        try(Connection conn = (Connection) DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
           //System.out.println("Entró a la conexión");
           String query = "SELECT * from tb_pet p INNER JOIN tb_cat d ON "
                   + " p.id = d.id_pet WHERE p.code="+code;
           PreparedStatement statementPet = conn.prepareStatement(query);
           //statementPet.setString(1, code);
           ResultSet result = statementPet.executeQuery(query);
           System.out.println("Statement SELECT ejecutado");
           while (result.next()){
               System.out.println("Entra al while");
               int petId = result.getInt(1);
               String petCode = result.getString(2);
               String petName = result.getString(3);
               int petBornYear = result.getInt(4);
               String petColor = result.getString(5);
               String petHealthStatus = result.getString(6);
               int catId = result.getInt(7);
               String petBreed = result.getString(8);
               cat = new clsCat(catId, petBreed, petId, petCode, petName, petBornYear, petColor, petHealthStatus);
               
           }
           return cat;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return cat;
       }
       

        
    }
    
}
