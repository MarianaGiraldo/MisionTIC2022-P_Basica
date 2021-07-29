/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Intefaces.*;

/**
 *
 * @author maria
 */
public class clsPet implements IAnimal, IVertebrate {
    
    // atributos
    private int petId;
    private String code;
    private String name; 
    private int born_year;
    private String color;
    private String health_Status;
    private clsVeterinary veterinary;

    public clsPet(int petId, String code, String name, int born_year, String color, String health_Status) {
        this.petId = petId;
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.health_Status = health_Status;
    }
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the born_year
     */
    public int getBorn_year() {
        return born_year;
    }

    /**
     * @param born_year the born_year to set
     */
    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

  

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the health_Status
     */
    public String getHealth_Status() {
        return health_Status;
    }

    /**
     * @param health_Status the health_Status to set
     */
    public void setHealth_Status(String health_Status) {
        this.health_Status = health_Status;
    }
    
    public clsVeterinary getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(clsVeterinary veterinary) {
        this.veterinary = veterinary;
    }

    
  // métodos
  public void Eat(){
  System.out.println("La mascota " + this.getName() + " está comiendo.");
  }
  public void Move(){
  System.out.println("La mascota " + this.getName() + " está moviendose.");
  }
  public void Sound(){
  System.out.println("La mascota " + this.getName() + " está haciendo sonidos.");
  }

    @Override
    public String getAnimalType() {
        return "domestic";
    }

    @Override
    public int getNumberOfBones() {
        return 0;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    
}
