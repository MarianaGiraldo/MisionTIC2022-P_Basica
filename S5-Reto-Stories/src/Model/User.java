/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import utils.db.Perseverance;

/**
 *
 * @author maria
 */
public class User extends Perseverance {
    private Integer id;
    private String document;
    private String name;
    private String lastname;

    public User() {
    }

    public User(Integer id, String document, String name, String lastname) {
        this.id = id;
        this.document = document;
        this.name = name;
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    

    public User getByDocument(String document) throws Exception {
        User user = null;
        
        try( Connection conn =  createConnection() ){
            String query = "SELECT `id`, `document`, `name`, `lastname` FROM `tb_users` WHERE document=?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, document);
            ResultSet result = statement.executeQuery();
            
            int row_count = 0;
            while( result.next() ){
                row_count++;
                System.out.println("Entra al while del search");
                if( row_count > 1)
                    throw new Exception("Se encontro más de un resultado.");
                
                this.id = result.getInt(1);
                this.document = result.getString(2);
                this.name = result.getString(3);
                this.lastname = result.getString(4);
                
                user = this;
            }
            
            if( row_count == 0)
                throw new Exception("No se encontro el registro.");
            
        }catch(Exception e){
            System.err.println(e.getMessage());
            System.err.println("Error finding the user which has document=" + this.document+ " on the users table.");
        }
        
        return user;
    }

    @Override
    public Integer save() throws Exception {
        String query;
        
        try(Connection conn = createConnection()){
            System.out.println("ID= "+this.id);
            if( this.id == 0 )
                query = "INSERT INTO tb_users (document, name, lastname) VALUES (?, ?, ?)";
            else
                query = "UPDATE tb_users SET document=?, name=?, lastname=? WHERE id=? ";
            System.out.println("Query: "+query);
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, this.document);
            statement.setString(2, this.name);
            statement.setString(3, this.lastname);
            
            if( this.id != 0 ){
                statement.setInt(4, this.id);
            }
            
            int rows = statement.executeUpdate();
            System.out.println("Statement Save users executed");
            
            if( rows > 0 ){
                ResultSet generateKeys = statement.getGeneratedKeys();
                if( generateKeys.next() )
                    this.id = generateKeys.getInt(1);
            }
                    
        } catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }
        
        return this.id;
    }

    @Override
    public Integer delete() throws Exception {
        Integer id = null;
        
        try(Connection conn = createConnection() ){
            String query = "DELETE FROM tb_users WHERE id=? ";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, this.id);
            int rows = statement.executeUpdate();
            
            if( rows > 0 ){
                ResultSet generateKeys = statement.getGeneratedKeys();
                if( generateKeys.next() ){
                    this.id = generateKeys.getInt(1);
                    return this.id;
                }
            }
                    
        } catch(Exception e){
            System.err.println(e);
            System.err.println("Error editing the record in the users table");
        }
        
        return id;
    }

    @Override
    public Object get(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
