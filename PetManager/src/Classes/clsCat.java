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
    private String breed;

    public clsCat(String breed, String code, String name, int born_year, String color, String health_Status) {
        super(code, name, born_year, color, health_Status);
        this.breed = breed;
    }
    
    
    
    public void SelfCleaning(){
        System.out.println("El gato"+ super.getName() +" se está limpiando. ");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}   
