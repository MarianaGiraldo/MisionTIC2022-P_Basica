/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Story;
import Model.User;

/**
 *
 * @author maria
 */
public class Controller {
    private final Story modelStory;
    private final User modelUser;

    public Controller() {
        this.modelStory = new Story();
        this.modelUser = new User();
    }

    public boolean SaveUser(User user) {
        try {
            user.save();
            return true;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
            return false;
        }
    }
    
    public User SearchUser(String document) {
        User user = null;
        try {
            user = this.modelUser.getByDocument(document);
            return user;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
        }
        return user;
    }
    
    public boolean DeleteUser(User user) {
        try {
            user.delete();
            return true;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
            return false;
        }
    }
    
    
    public boolean SaveStory(Story story) {
        try {
            story.save();
            return true;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
            return false;
        }
    }
    
    public Story SearchStory(Integer id) {
        Story story = null;
        try {
            story = this.modelStory.get(id);
            return story;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
        }
        return story;
    }
    
    public boolean DeleteStory(Story story) {
        try {
            story.delete();
            return true;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
            return false;
        }
    }
    
}
