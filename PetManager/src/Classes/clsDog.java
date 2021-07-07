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
public class clsDog extends clsPet {
    private String breed;
    private boolean pedigree;

    public clsDog(String breed, boolean pedigree, String code, String name, int born_year, String color, String health_Status) {
        super(code, name, born_year, color, health_Status);
        this.breed = breed;
        this.pedigree = pedigree;
    }

    
    
    public void WalkAround(){
        System.out.println("El perro "+ super.getName() +" está caminando");
    }
    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
    
}
