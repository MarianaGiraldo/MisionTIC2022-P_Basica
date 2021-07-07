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
public class clsDispositivosIoT {
    private String tipo;
    private String identificador;
    private String estado;

    public clsDispositivosIoT() {
    }

    public clsDispositivosIoT(String tipo, String identificador, String estado) {
        this.tipo = tipo;
        this.identificador = identificador;
        this.estado = estado;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
