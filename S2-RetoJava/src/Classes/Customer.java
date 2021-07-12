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
public class Customer extends Person {
    
    private String address;
    private String phone;


    public Customer(String address, String phone, String name, String lastname, String id, String email) {
        super(name, lastname, id, email);
        this.address = address;
        this.phone = phone;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
}
