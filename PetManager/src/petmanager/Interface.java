/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.clsCat;
import Classes.clsDog;

/**
 *
 * @author maria
 */
public class Interface {
    public static void main(String[] args) {
        clsDog dog = new clsDog("Criollo", false ,"001", "Firulais", 2013, "Negro", "Sano" );
        clsCat cat = new clsCat("Angora" ,"002", "Menino", 2018, "Blanco", "Enfermo" );
        
        System.out.println(dog.getAnimalType());
        System.out.println(""+ cat.getAnimalType());
        
        System.out.println(dog.getNumberOfBones());
        System.out.println(""+ cat.getNumberOfBones());
        
        
    }
}
