/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.Story;
import Classes.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import utils.db.Perseverance;

/**
 *
 * @author maria
 */
@SupportedSourceVersion(SourceVersion.RELEASE_16)
public class UserModel extends Perseverance {
    
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
                
                Integer id = result.getInt(1);
                document = result.getString(2);
                String name = result.getString(3);
                String lastName = result.getString(4);
                user = new User(id, document, name, lastName);
            }
            
            if( row_count == 0)
                throw new Exception("No se encontro el registro.");
            return user;
        }catch(Exception e){
            System.err.println(e);
            System.err.println("Error finding the user which has document=" + document+ " on the users table.");
        }
        
        return user;
    }

    @Override
    public Integer save(Object object) throws Exception {
        User user = (User)object;
        String query;
        
        try(Connection conn = createConnection()){
            System.out.println("ID= "+user.getId());
            if( user.getId() == null )
                query = "INSERT INTO tb_users (document, name, lastname) VALUES (?, ?, ?)";
            else
                query = "UPDATE tb_users SET document=?, name=?, lastname=? WHERE id=? ";
            System.out.println("Query: "+query);
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getDocument());
            statement.setString(2, user.getName());
            statement.setString(3, user.getLastname());
            
            if( user.getId() != null ){
                statement.setInt(4, user.getId());
            }
            
            int rows = statement.executeUpdate();
            System.out.println("Statement Save users executed");
            
            ResultSet generateKeys = statement.getGeneratedKeys();
            if( generateKeys.next() )
                user.setId(generateKeys.getInt(1));
                    
        } catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }
        
        return user.getId();
    }

    @Override
    public Boolean delete(Object object) throws Exception {
        Integer id = (Integer)object;
        
        try(Connection conn = createConnection() ){
            String query = "DELETE FROM tb_users WHERE id=? ";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            return true;
                    
        } catch(Exception e){
            System.err.println(e);
            System.err.println("Error editing the record in the users table");
        }
        
        return false;
    }

    @Override
    public Object get(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
