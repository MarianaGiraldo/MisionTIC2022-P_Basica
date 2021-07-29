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
    private int dogId;
    private String breed;
    private boolean pedigree;

    public clsDog(int dogId, String breed, boolean pedigree, int petId, String code, String name, int born_year, String color, String health_Status) {
        super(petId, code, name, born_year, color, health_Status);
        this.dogId = dogId;
        this.breed = breed;
        this.pedigree = pedigree;
    }

    
    
    public void WalkAround(){
        System.out.println("El perro "+ super.getName() +" está caminando");
    }
    
    public void WalkAround(int km){
        System.out.println("El perro "+ super.getName() +" está caminando " + km + "km");
    }
    
    public void WalkAround(boolean dogLeash){
        String hasLeash = dogLeash ? "con correa " : "sin correa";
        System.out.println("El perro "+ super.getName() +" está caminando " + hasLeash);
    }
    
    @Override
    public void Sound(){
        System.out.println("El perro "+ super.getName() + " está ladrando");
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
    
    
    @Override
    public String getAnimalType(){
        return"Dog";
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }
    
}
