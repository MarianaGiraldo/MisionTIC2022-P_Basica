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
public class PasajeroAdulto extends Pasajero {
    private String contacto;
    private String email;

    public PasajeroAdulto() {
    }

    public PasajeroAdulto(String contacto, String email, String nombre, String apellido, String tipoDocumento, String numDocumento, String Sexo) {
        super(nombre, apellido, tipoDocumento, numDocumento, Sexo);
        this.contacto = contacto;
        this.email = email;
    }

    
    
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
