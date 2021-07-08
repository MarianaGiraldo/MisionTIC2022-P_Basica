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
public class clsVeterinary extends AbstHospital {
    private String name;
    private String phone;
    private String address;
    private clsDoctor doctor;

    public clsVeterinary(String name, String phone, String address, clsDoctor doctor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.doctor = doctor;
    }

    public String PetCare(clsPet pet){
        System.out.println("Atendiendo a la mascota "+ pet.getName());
        return pet.getHealth_Status();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public clsDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(clsDoctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String getPatientType() {
        return "Animal";
    }

    @Override
    public String Surgery() {
        return "Surgery animal data";
    }
    
    
    
    
}
