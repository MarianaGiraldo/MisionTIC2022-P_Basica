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
import java.util.LinkedList;

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
    
    
    public boolean EditPet(clsCat cat){
         try(Connection conn = (Connection) DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
           //System.out.println("Entró a la conexión");
           String query = "UPDATE tb_pet SET code=? , name=? ,born_year=? ,color=? , healthStatus=?  "
                   + "WHERE id= ?";
           PreparedStatement statementPet = conn.prepareStatement(query);
           statementPet.setString(1, cat.getCode());
           statementPet.setString(2, cat.getName());
           statementPet.setInt(3, cat.getBorn_year());
           statementPet.setString(4, cat.getColor());
           statementPet.setString(5, cat.getHealth_Status());
           statementPet.setInt(6, cat.getPetId());
           
            
            query = "UPDATE tb_cat SET breed=? WHERE id=? ";
           PreparedStatement statementCat = conn.prepareStatement(query);
           statementCat.setString(1, cat.getBreed());
           statementCat.setInt(2, cat.getCatId());
           int rowsUpdatedPet = statementPet.executeUpdate();
           int rowsUpdatedCat = statementCat.executeUpdate();
           
           return rowsUpdatedPet > 0 && rowsUpdatedCat > 0;
           
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return false;
       }
       
      
        
    }
    
    public boolean DeletePet(clsCat cat){
       try(Connection conn = (Connection) DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
           String query = "DELETE FROM tb_cat WHERE id=?";
           PreparedStatement statementCat = conn.prepareStatement(query);
           statementCat.setInt(1, cat.getCatId());
           int rowsDeletedCat = statementCat.executeUpdate();
           
           query = "DELETE FROM tb_pet WHERE id=?";
           PreparedStatement statementPet = conn.prepareStatement(query);
           statementPet.setInt(1, cat.getPetId());
           int rowsDeletedPet = statementPet.executeUpdate();
           
           return rowsDeletedPet > 0 && rowsDeletedCat > 0;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
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
           while (result.next()){
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
    
    
    public LinkedList<clsPet> ListPet(){
        LinkedList<clsPet> catList = new LinkedList<>();
        try(Connection conn = (Connection) DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
           //System.out.println("Entró a la conexión");
           String query = "SELECT * from tb_pet p INNER JOIN tb_cat d ON "
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
               int catId = result.getInt(7);
               String petBreed = result.getString(8);
               clsCat cat = new clsCat(catId, petBreed, petId, petCode, petName, petBornYear, petColor, petHealthStatus);
               catList.add(cat);
           }
           return catList;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return catList;
       }
       

        
    }
    
}
