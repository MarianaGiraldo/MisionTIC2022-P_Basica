/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.clsDog;
import Classes.clsPet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author maria
 */
public class modelDog {
    DBData dbData;
    public modelDog() {
        this.dbData = new DBData();
    }
    
    public boolean CreatePet(clsDog dog) throws SQLException{
       // System.out.println("Entró a la función Create");
       try(Connection conn = (Connection) DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
           //System.out.println("Entró a la conexión");
           String query = "INSERT INTO tb_pet (code, name,born_year,color, healthStatus) VALUES (?, ?, ?, ?, ?)";
           PreparedStatement statementPet = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           statementPet.setString(1, dog.getCode());
           statementPet.setString(2, dog.getName());
           statementPet.setInt(3, dog.getBorn_year());
           statementPet.setString(4, dog.getColor());
           statementPet.setString(5, dog.getHealth_Status());
           
           int rowsInserted = statementPet.executeUpdate();
           if (rowsInserted > 0){
               //System.out.println("Statement Pet ejecutado");
               ResultSet generatedKeys= statementPet.getGeneratedKeys();
               if(generatedKeys.next()){
                   int idPet = generatedKeys.getInt(1);
                   query = "Insert into tb_dog (breed, pedigree, id_pet) "
                           + " VALUES (?, ?, ?)";
                   PreparedStatement statementDog = conn.prepareStatement(query);
                   statementDog.setString(1, dog.getBreed());
                   statementDog.setBoolean(2, dog.isPedigree());
                   statementDog.setInt(3, idPet);
                   rowsInserted = statementDog.executeUpdate();
                   if (rowsInserted > 0){
                       System.out.println("Statement Dog ejecutado");
                        System.out.println("Queries ejecutadas");
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
    
    
    public boolean UpdatePet(clsDog dog){
       try{
           
           return true;
       }catch (Exception e) {
           return false;
       }
        
    }
    
    public boolean DeletePet(clsDog dog){
       try{
           return true;
       }catch (Exception e) {
           return false;
       }
        
    }
    
    public clsPet SearchPet(String code) throws SQLException{
        clsDog dog = null;
        // System.out.println("Entró a la función Search");
       try(Connection conn = (Connection) DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
           //System.out.println("Entró a la conexión");
           String query = "SELECT * from tb_pet p INNER JOIN tb_dog d ON "
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
               int dogId = result.getInt(7);
               String petBreed = result.getString(8);
               Boolean petPedigree = result.getBoolean(9);
               dog = new clsDog(dogId, petBreed, true, petId, petCode, petName, petBornYear, petColor, petHealthStatus);
               
           }
           return dog;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return dog;
       }
       
    }
        
}
