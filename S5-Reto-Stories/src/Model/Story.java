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
public class Story extends Perseverance {
    private Integer id;
    private Integer user_id;
    private String title;
    private String short_description;
    private String story;
    private String genre;
    private String timestamp;

    public Story() {
    }

    public Story(Integer id, Integer user_id, String title, String short_description, String story, String genre, String timestamp) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.short_description = short_description;
        this.story = story;
        this.genre = genre;
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
   

    @Override
    public Story get(Integer id) throws Exception {
        Story storyGot = null;
        
        try( Connection conn =  createConnection() ){
            String query = "SELECT `id`, `user_id`, `title`, `short_description`, `story`, `genre`, `timestamp` "
                    + "FROM `tb_stories` WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            int row_count = 0;
            while( result.next() ){
                row_count++;
                
                if( row_count > 1)
                    throw new Exception("Se encontro más de un resultado.");
                
                this.id = result.getInt(1);
                this.user_id = result.getInt(2);
                this.title = result.getString(3);
                this.short_description = result.getString(4);
                this.story = result.getString(5);
                this.genre = result.getString(6);
                this.timestamp = result.getString(7);
                
                storyGot = this;
            }
            
            if( row_count == 0)
                throw new Exception("No se encontro el registro.");
            
        }catch(Exception e){
            System.err.println(e.getMessage());
            System.err.println("Error finding the user which has id=" + id + " on the users table.");
        }
        
        return storyGot;
    }

    @Override
    public Integer save() throws Exception {
        String query;
        
        try(Connection conn = createConnection()){
            if( this.id == null )
                query = "INSERT INTO `tb_stories`(`title`, `short_description`, `story`, "
                        + "`genre`, `timestamp`, `user_id`) VALUES  (?, ?, ?, ?, ?, ?, ?)";
            else
                query = "UPDATE `tb_stories` SET `title`=?,`short_description`=?,"
                        + "`story`=?,`genre`=?,`timestamp`=? WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, this.title);
            statement.setString(2, this.short_description);
            statement.setString(3, this.story);
            statement.setString(4, this.genre);
            statement.setString(5, this.timestamp);
            statement.setInt(6, this.user_id);
            
            if( this.id != null ){
                statement.setInt(7, this.id);
            }
            
            int rows = statement.executeUpdate();
            System.out.println("Statement Save stories executed");
            
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
            String query = "DELETE FROM tb_stories WHERE id=? ";
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
            System.err.println("Error editing the record in the stories table");
        }
        
        return id;
    }
}
