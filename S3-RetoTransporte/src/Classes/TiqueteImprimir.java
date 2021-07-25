/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class TiqueteImprimir extends Trayecto {
    private List<PasajeroAdulto> pasajerosAdultosList;
    private List<Pasajero> pasajerosKidsList;

    public TiqueteImprimir() {
    }

    
    public TiqueteImprimir(List pasajerosKidsList, List pasajerosAdultosList, String salida, String llegada, String fechaSalida, String horaSalida, String minutosSalida, int numPasajerosAdultos, int numPasajerosKids, int valorTrayecto, String tipoTiquete){
        super(salida, llegada, fechaSalida, horaSalida, minutosSalida, numPasajerosAdultos, numPasajerosKids, valorTrayecto, tipoTiquete);
        this.pasajerosKidsList = pasajerosKidsList;
        this.pasajerosAdultosList = pasajerosAdultosList;
       
    }

    public void addPasajeroAdulto(PasajeroAdulto pasajero){
        this.pasajerosAdultosList.add(pasajero);
    }

    public void addPasajeroKid(Pasajero pasajero){
        this.pasajerosKidsList.add(pasajero);
    }
    public void removePasajeroAdulto(PasajeroAdulto pasajero){
        this.pasajerosAdultosList.remove(pasajero);
    }
    public void removePasajeroKid(Pasajero pasajero){
        this.pasajerosKidsList.remove(pasajero);
    }
    
      
    
    public void imprimirTiquete(){
        int total;
        System.out.println("-----------------------------------------");
        System.out.println("Lugar de Salida: "+ super.getSalida());
        System.out.println("Lugar de Llegada: "+ super.getLlegada());
        System.out.println("Fecha y hora de Salida: "+ super.getFechaSalida()+"  "+ super.getHoraSalida()+":"+super.getMinutosSalida());
        System.out.print("Pasajeros Adultos:");
        if (!this.pasajerosAdultosList.isEmpty()){
            this.pasajerosAdultosList.forEach(adulto -> {
                System.out.print("\n- "+adulto.getNombreCompleto());
            });
        }else{
            System.out.println("0");
            }
        System.out.print("\nPasajeros Niños:");
        if (!this.pasajerosKidsList.isEmpty()){
            this.pasajerosKidsList.forEach(kid -> {
                System.out.print("\n- "+kid.getNombreCompleto());
            });
        }else{
            System.out.println("0");
            }
        System.out.println("\nTipo de trayecto: "+ super.getTipoTiquete());
        System.out.println("\nValor por tiquete por trayecto: $"+ super.getValorTrayecto());
        total = super.getValorTrayecto() * (this.pasajerosKidsList.size() + this.pasajerosAdultosList.size());
        if (super.getTipoTiquete().equals("Salida y Regreso")){
            total *= 2;
        }
        System.out.println("Valor total: $"+total);
        System.out.println("-----------------------------------------");
        
    }
    
}
