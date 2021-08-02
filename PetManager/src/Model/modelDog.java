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
import java.util.LinkedList;

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
    
    
    public boolean EditPet(clsDog dog){
        try(Connection conn = (Connection) DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
           //System.out.println("Entró a la conexión");
           String query = "UPDATE tb_pet SET code=? , name=? ,born_year=? ,color=? , healthStatus=?  "
                   + "WHERE id= ?";
           PreparedStatement statementPet = conn.prepareStatement(query);
           statementPet.setString(1, dog.getCode());
           statementPet.setString(2, dog.getName());
           statementPet.setInt(3, dog.getBorn_year());
           statementPet.setString(4, dog.getColor());
           statementPet.setString(5, dog.getHealth_Status());
           statementPet.setInt(6, dog.getPetId());
            
           query = "UPDATE tb_dog SET breed= ?, pedigree= ?"
                   + "WHERE id=? ";
           PreparedStatement statementDog = conn.prepareStatement(query);
           statementDog.setString(1, dog.getBreed());
           statementDog.setBoolean(2, dog.isPedigree());
           statementDog.setInt(3, dog.getDogId());
           
           int rowsUpdatedPet = statementPet.executeUpdate();
           int rowsUpdatedDog = statementDog.executeUpdate();
           
           return rowsUpdatedPet > 0 && rowsUpdatedDog > 0;
           
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return false;
       }
       
        
    }
    
    public boolean DeletePet(clsDog dog){
      try(Connection conn = (Connection) DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
           String query = "DELETE FROM tb_dog WHERE id=?";
           PreparedStatement statementDog = conn.prepareStatement(query);
           statementDog.setInt(1, dog.getDogId());
           int rowsDeletedDog = statementDog.executeUpdate();
           
           query = "DELETE FROM tb_pet WHERE id=?";
           PreparedStatement statementPet = conn.prepareStatement(query);
           statementPet.setInt(1, dog.getPetId());
           int rowsDeletedPet = statementPet.executeUpdate();
           return rowsDeletedPet > 0 && rowsDeletedDog > 0;
           
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
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
           //System.out.println("Statement SELECT ejecutado");
           while (result.next()){
               //System.out.println("Entra al while del result del Select");
               int petId = result.getInt(1);
               String petCode = result.getString(2);
               String petName = result.getString(3);
               int petBornYear = result.getInt(4);
               String petColor = result.getString(5);
               String petHealthStatus = result.getString(6);
               int dogId = result.getInt(7);
               String petBreed = result.getString(8);
               Boolean petPedigree = result.getBoolean(9);
               dog = new clsDog(dogId, petBreed, petPedigree, petId, petCode, petName, petBornYear, petColor, petHealthStatus);
               
           }
           return dog;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return dog;
       }
       
    }
    
public LinkedList<clsPet> ListPet(){
        LinkedList<clsPet> dogList = new LinkedList<>();
        try(Connection conn = (Connection) DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            //System.out.println("Entró a la conexión");
            String query = "SELECT * from tb_pet p INNER JOIN tb_dog d ON "
                    + " p.id = d.id_pet";
            PreparedStatement statementPet = conn.prepareStatement(query);
           //statementPet.setString(1, code);
           ResultSet result = statementPet.executeQuery(query);
           while (result.next()){
               int petId = result.getInt(1);
               String petCode = result.getString(2);
               String petName = result.getString(3);
               int petBornYear = result.getInt(4);
               String petColor = result.getString(5);
               String petHealthStatus = result.getString(6);
               int dogId = result.getInt(7);
               String petBreed = result.getString(8);
               Boolean petPedigree = result.getBoolean(9);
               clsDog dog = new clsDog(dogId, petBreed, petPedigree, petId, petCode, petName, petBornYear, petColor, petHealthStatus);
               dogList.add(dog);
               
           }
           return dogList;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return dogList;
       }
       
    }
        
}
