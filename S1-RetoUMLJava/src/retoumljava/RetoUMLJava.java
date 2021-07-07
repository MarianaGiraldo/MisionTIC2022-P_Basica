/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoumljava;

import Classes.clsPersona;

/**
 *
 * @author maria
 */
public class RetoUMLJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clsPersona persona1 = new clsPersona("1032796495", 2004, "Mariana");
        clsPersona persona2 = new clsPersona("1032796496", 2004, "Gabriela");
        clsPersona persona3 = new clsPersona("1032798588", 2005, "Victoria");
        clsPersona persona4 = new clsPersona("52224769", 1973, "Paula");
        clsPersona persona5 = new clsPersona("1010132444", 1996, "David");
        
        if (persona1.CalculeAge()>persona2.CalculeAge()){
            System.out.println(persona1.getName() + " es mayor que " + persona2.getName());
        }
        if (persona2.CalculeAge()>persona1.CalculeAge()){
            System.out.println(persona2.getName() + " es mayor que " + persona1.getName());
        }
        else{
            System.out.println(persona1.getName() + " tiene la misma edad que " + persona2.getName());
        }
        persona3.drinkAlcohol();
        persona5.drinkAlcohol();
        persona4.eat();
        persona4.speak();
        persona3.walk();
        
    }
    
}
