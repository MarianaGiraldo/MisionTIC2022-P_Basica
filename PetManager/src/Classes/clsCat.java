/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author maria
 */
public class clsCat extends clsPet {
    private int catId;
    private String breed;

    public clsCat(int catId, String breed, int petId, String code, String name, int born_year, String color, String health_Status) {
        super(petId, code, name, born_year, color, health_Status);
        this.catId = catId;
        this.breed = breed;
    }

    
    
    public void SelfCleaning(){
        System.out.println("El gato"+ super.getName() +" se está limpiando. ");
    }
    
    
    @Override
    public void Sound(){
        System.out.println("El gato "+ super.getName() + " está mauyando");
    }
    
    @Override
    public int getNumberOfBones(){
        return 230;
    }
    
    @Override
    public String getAnimalType(){
       return "Cat"; 
    }
    

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }
    
    
    
}   
