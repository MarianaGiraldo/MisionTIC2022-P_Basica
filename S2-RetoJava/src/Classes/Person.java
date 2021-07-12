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
public class Person {
    private String name;
    private String lastname;
    private String id;
    private String email;

    /**
     *
     * @param name
     * @param lastname
     * @param id
     * @param email
     */
    protected Person(String name, String lastname, String id, String email) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.email = email;
    }
    
    
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getAllName(){
        return name + " " + lastname;
    }
    
}
