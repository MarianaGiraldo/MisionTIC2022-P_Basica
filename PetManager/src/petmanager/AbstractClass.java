/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.clsDoctor;
import Classes.clsVeterinary;

/**
 *
 * @author maria
 */
public class AbstractClass {
    public static void main(String[] args) {
        //Instancias del doctor y vaterinaria
        clsDoctor doctor = new clsDoctor("Maria Torres", "12379");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria UDC", "3054650245", "Cr5 este N 18-50", doctor);
        
        veterinary.setData(veterinary.getName());
        
        String data = veterinary.getHospitalInformation();
        String type = veterinary.getPatientType();
        String surgery = veterinary.Surgery();
        
        
        System.out.println("Data: " + data);
        System.out.println("Type: " + type);
        System.out.println("Surgery: " + surgery);
        
    }
}
