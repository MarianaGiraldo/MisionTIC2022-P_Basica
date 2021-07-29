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
public class Polymorphism2 {
    public static void main(String[] args) {
        //Instancias de las clases hijas
        clsDog dog = new clsDog(1,"Criollo", false,1 ,"001", "Firulais", 2013, "Negro", "Sano" );
        clsCat cat = new clsCat(1,"Angora",2 ,"002", "Menino", 2018, "Blanco", "Enfermo" );
     
        dog.Sound();
        cat.Sound();
        
    }
}
