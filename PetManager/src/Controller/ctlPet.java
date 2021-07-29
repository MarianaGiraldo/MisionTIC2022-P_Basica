/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.*;
import Model.*;
import java.sql.SQLException;

/**
 *
 * @author maria
 */
public class ctlPet {
    private final modelDog modelDog;
    private final modelCat modelCat;

    public ctlPet() {
        this.modelDog = new modelDog();
        this.modelCat = new modelCat();
    }
    
    
    
    public boolean CreatePet(clsPet pet){
       try{
           switch(pet.getAnimalType()){
            case "Cat"->{
                this.modelCat.CreatePet((clsCat) pet);
            }
            case "Dog"->{
                this.modelDog.CreatePet((clsDog) pet);
            }
        }
           return true;
       }catch (SQLException e) {
           return false;
       }
        
    }
    
    
    public boolean EditPet(clsPet pet){
       try{
           switch(pet.getAnimalType()){
            case "Cat"->{
                this.modelCat.UpdatePet((clsCat)pet);
            }
            case "Dog"->{
                this.modelDog.UpdatePet((clsDog) pet);
            }
        }
           return true;
       }catch (Exception e) {
           return false;
       }
        
    }
    
    public boolean DeletePet(clsPet pet){
       try{
           switch(pet.getAnimalType()){
            case "Gato"->{
                this.modelCat.DeletePet((clsCat) pet);
            }
            case "Perro"->{
                this.modelDog.DeletePet((clsDog) pet);
            }
        }
           return true;
       }catch (Exception e) {
           return false;
       }
        
    }
    
    public clsPet SearchPet(String code, String type){
        clsPet pet = null;
        try{
            switch(type){
                case "Cat"->{
                    pet = this.modelCat.SearchPet(code);
                }
                case "Dog"->{
                    pet = this.modelDog.SearchPet(code);
                }
            }
            return pet;
       }catch (SQLException e) {
            System.err.println("Error:"+ e.getMessage());
           return null;
       }
        
    }
    
}
