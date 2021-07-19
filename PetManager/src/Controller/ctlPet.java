/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.*;
import Model.*;

/**
 *
 * @author maria
 */
public class ctlPet {
    private modelDog modelDog;
    private modelCat modelCat;

    public ctlPet() {
        this.modelDog = new modelDog();
        this.modelCat = new modelCat();
    }
    
    
    
    public boolean CreatePet(clsPet pet){
       try{
           switch(pet.getAnimalType()){
            case "Gato"->{
                this.modelCat.CreatePet((clsCat) pet);
            }
            case "Perro"->{
                this.modelDog.CreatePet((clsDog) pet);
            }
        }
           return true;
       }catch (Exception e) {
           return false;
       }
        
    }
    
    
    public boolean UpdatePet(clsPet pet){
       try{
           switch(pet.getAnimalType()){
            case "Gato"->{
                this.modelCat.UpdatePet((clsCat)pet);
            }
            case "Perro"->{
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
                case "Gato"->{
                    this.modelCat.SearchPet(code);
                }
                case "Perro"->{
                    this.modelDog.SearchPet(code);
                }
            }
            return pet;
       }catch (Exception e) {
           return null;
       }
        
    }
    
}
