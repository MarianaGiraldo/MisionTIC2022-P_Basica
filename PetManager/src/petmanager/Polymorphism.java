/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;

/**
 *
 * @author maria
 */
public class Polymorphism {
    public static void main(String[] args) {
        //Instancias de las clases hijas
        clsDog dog1 = new clsDog("Criollo", false ,"001", "Firulais", 2013, "Negro", "Sano" );
        clsCat cat1 = new clsCat("Angora" ,"002", "Menino", 2018, "Blanco", "Enfermo" );
        
        //Instancias del doctor y vaterinaria
        clsDoctor doctor = new clsDoctor("Maria Torres", "12379");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria UDC", "3054650245", "Cr5 este N 18-50", doctor);
        
        String careDog = veterinary.PetCare(dog1);
        System.out.println("El estado de salud de "+ dog1.getName() + " es " + careDog);
        
        String careCat = veterinary.PetCare(cat1);
        System.out.println("El estado de salud de "+ cat1.getName() + " es " + careCat);
        
    }
    
}
