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
public abstract class AbstHospital {
    private String data;
    
    public abstract String getPatientType();
    public abstract String Surgery();
    
    public String getHospitalInformation(){
        return "La información es: " + this.getData();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
            
}
