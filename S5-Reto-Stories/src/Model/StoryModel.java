/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.Story;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Arrays;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import utils.db.Perseverance;

/**
 *
 * @author maria
 */
@SupportedSourceVersion(SourceVersion.RELEASE_16)
public class StoryModel extends Perseverance {
    
    public StoryModel() {
    }

    public Story getByTitle(String title) throws Exception {
        Story storyGot = null;
        try( Connection conn =  createConnection() ){
            String query = "SELECT `id`, `user_id`, `title`, `short_description`, `story`, `genre`, `timestamp` "
                    + "FROM `tb_stories` WHERE title=?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, title);
            ResultSet result = statement.executeQuery();
            
            int row_count = 0;
            while( result.next() ){
                row_count++;
                
                if( row_count > 1)
                    throw new Exception("Se encontro más de un resultado.");
                
                Integer id = result.getInt(1);
                Integer user_id = result.getInt(2);
                title = result.getString(3);
                String short_description = result.getString(4);
                String story = result.getString(5);
                String genre = result.getString(6);
                String timestamp = result.getString(7);
                
                storyGot = new Story(id, user_id, title, short_description, story, genre, timestamp);
            }
            
            if( row_count == 0)
                throw new Exception("No se encontro el registro.");
            return storyGot;
        }catch(Exception e){
            System.err.println(e.getMessage());
            System.err.println("Error finding the user which has title=" + title + " on the stories table.");
        }
        
        return storyGot;
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
                
                id = result.getInt(1);
                Integer user_id = result.getInt(2);
                String title = result.getString(3);
                String short_description = result.getString(4);
                String story = result.getString(5);
                String genre = result.getString(6);
                String timestamp = result.getString(7);
                
                storyGot = new Story(id, user_id, title, short_description, story, genre, timestamp);
            }
            
            if( row_count == 0)
                throw new Exception("No se encontro el registro.");
            return storyGot;
        }catch(Exception e){
            System.err.println(e.getMessage());
            System.err.println("Error finding the user which has id=" + id + " on the users table.");
        }
        
        return storyGot;
    }
    
    @Override
    public Integer save(Object object) throws Exception {
        Story story = (Story)object;
        String query;
        
        try(Connection conn = createConnection()){
            if( story.getId() == null )
                query = "INSERT INTO `tb_stories`(`title`, `short_description`, `story`, "
                        + "`genre`, `user_id`) VALUES  (?, ?, ?, ?, ?)";
            else
                query = "UPDATE `tb_stories` SET `title`=?,`short_description`=?,"
                        + "`story`=?,`genre`=?, `user_id`=?  WHERE id=?";
            System.out.println(query);
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, story.getTitle());
            statement.setString(2, story.getShort_description());
            statement.setString(3, story.getStory());
            statement.setString(4, story.getGenre());
            statement.setInt(5, story.getUser_id());
            
            if( story.getId() != null ){
                statement.setInt(6, story.getId());
            }
            
            int rows = statement.executeUpdate();
            System.out.println("Statement Save stories executed");
            
            if( rows > 0 ){
                ResultSet generateKeys = statement.getGeneratedKeys();
                if( generateKeys.next() )
                    story.setId(generateKeys.getInt(1));
            }
                    
        } catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }
        
        return story.getId();
    }

    @Override
    public Boolean delete(Object object) throws Exception {
        Integer id = (Integer)object;
               
        try(Connection conn = createConnection() ){
            String query = "DELETE FROM tb_stories WHERE id=? ";
            System.out.println("Entrando al modelo");
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            return true;     
        } catch(Exception e){
            System.err.println(e);
            System.err.println("Error editing the record in the stories table");
        }
        
        return false;
    }   

    public LinkedList<Story> getByKeyWords(String[] words) {
        LinkedList<Story> stories = new LinkedList<>();
        try( Connection conn =  createConnection() ){
            System.out.println("Entrando a la conexión");
            String query = "SELECT `id`, `user_id`, `title`, `short_description`, `story`, `genre`, `timestamp` "
                    + "FROM `tb_stories` WHERE ";
            PreparedStatement statement = conn.prepareStatement(query);
            int i=0;
            for (String word : words) {
                System.out.println(word);
                i++;
                if (i==words.length)
                    query += " title LIKE '%" +word+ "%' OR short_description LIKE '%" +word+ "%'";
                else
                    query += " title LIKE '%" +word+ "%' OR short_description LIKE '%" +word+ "%' OR ";
                System.out.println("String añadido");
                statement = conn.prepareStatement(query);
            }
            System.out.println("Query: "+ query);
            ResultSet result = statement.executeQuery();
            
            int row_count = 0;
            while( result.next() ){
                row_count++;
                
                Integer id = result.getInt(1);
                Integer user_id = result.getInt(2);
                String title = result.getString(3);
                String short_description = result.getString(4);
                String story = result.getString(5);
                String genre = result.getString(6);
                String timestamp = result.getString(7);
                
                Story storyGot = new Story(id, user_id, title, short_description, story, genre, timestamp);
                stories.add(storyGot);
            }
            
            if( row_count == 0)
                throw new Exception("No se encontro el registro.");
            return stories;
        }catch(Exception e){
            System.err.println(e.getMessage());
            System.err.println("Error finding the story which has key words: " + Arrays.toString(words) + " on the stories table.");
        }
        
        return stories;
    }

}
