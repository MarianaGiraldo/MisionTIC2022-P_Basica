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
public class Trayecto {
    private String salida;
    private String llegada;
    private String fechaSalida;
    private String horaSalida;
    private String minutosSalida;
    private int numPasajerosAdultos;
    private int numPasajerosKids;
    private int valorTrayecto;
    private String tipoTiquete;

    public Trayecto() {
    }

    
    public Trayecto(String salida, String llegada, String fechaSalida, String horaSalida, String minutosSalida, int numPasajerosAdultos, int numPasajerosKids, int valorTrayecto, String tipoTiquete) {
        this.salida = salida;
        this.llegada = llegada;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.minutosSalida = minutosSalida;
        this.numPasajerosAdultos = numPasajerosAdultos;
        this.numPasajerosKids = numPasajerosKids;
        this.valorTrayecto = valorTrayecto;
        this.tipoTiquete = tipoTiquete;
    }
    
    
    
    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumPasajerosAdultos() {
        return numPasajerosAdultos;
    }

    public void setNumPasajerosAdultos(int numPasajerosAdultos) {
        this.numPasajerosAdultos = numPasajerosAdultos;
    }

    public int getNumPasajerosKids() {
        return numPasajerosKids;
    }

    public void setNumPasajerosKids(int numPasajerosKids) {
        this.numPasajerosKids = numPasajerosKids;
    }

    public int getValorTrayecto() {
        return valorTrayecto;
    }

    public void setValorTrayecto(int valorTrayecto) {
        this.valorTrayecto = valorTrayecto;
    }

    public String getTipoTiquete() {
        return tipoTiquete;
    }

    public void setTipoTiquete(String tipoTiquete) {
        this.tipoTiquete = tipoTiquete;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getMinutosSalida() {
        return minutosSalida;
    }

    public void setMinutosSalida(String minutosSalida) {
        this.minutosSalida = minutosSalida;
    }
    
    
    
}
