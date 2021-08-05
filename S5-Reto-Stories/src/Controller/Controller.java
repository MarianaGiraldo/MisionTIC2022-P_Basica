/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.Story;
import Classes.User;
import Model.StoryModel;
import Model.UserModel;
import java.util.LinkedList;

/**
 *
 * @author maria
 */
public class Controller {
    private final StoryModel modelStory;
    private final UserModel modelUser;

    public Controller() {
        this.modelStory = new StoryModel();
        this.modelUser = new UserModel();
    }

    public boolean SaveUser(User user) {
        try {
            this.modelUser.save(user);
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
    
    public boolean DeleteUser(Integer id) {
        try {
            this.modelUser.delete(id);
            return true;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
            return false;
        }
    }
    
    
    public boolean SaveStory(Story story) {
        try {
            this.modelStory.save(story);
            return true;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
            return false;
        }
    }
    
    public Story SearchStory(String title) {
        Story story = null;
        try {
            story = this.modelStory.getByTitle(title);
            return story;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
        }
        return story;
    }
    
    public boolean DeleteStory(Integer id) {
        try {
            this.modelStory.delete(id);
            System.out.println("Entrando al controlador");
            return true;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
            return false;
        }
    }
    
    public LinkedList<Story> SearchStoryByKeyWords(String[] words){
        LinkedList<Story> stories = null;
        try {
            stories = this.modelStory.getByKeyWords(words);
            return stories;
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
        }
        return stories;
    };
    
}
