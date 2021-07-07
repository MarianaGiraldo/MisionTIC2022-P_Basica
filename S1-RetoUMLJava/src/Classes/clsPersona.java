/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Calendar;


/**
 *
 * @author maria
 */
public class clsPersona {
    private String id;
    private int born_year;
    private String name;

    public clsPersona(String id, int born_year, String name) {
        this.id = id;
        this.born_year = born_year;
        this.name = name;
    }

    public clsPersona() {
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

        public int getBorn_year() {
        return born_year;
    }

    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void speak(){
        System.out.println(this.name + " está hablando");
    }
    public void eat(){
        System.out.println(this.name + " está comiendo");
    }
    public void walk(){
        System.out.println(this.name + " está caminando");
    }
    public void drinkAlcohol(){
        if(CalculeAge()>=18){
           System.out.println(this.name + " es mayor de edad y puede beber alcohol");
        }
        else{
            System.out.println(this.name + " es menor de edad y NO puede beber alcohol");
        }
    }
    
    public int CalculeAge(){
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        int age = current_year - this.born_year;
        return age;
    }
}
