/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author maria
 */
public class clsSimulationCraps {
    private int gano = 0;
    private int perdio = 0;
    private final int ciclos;

    public clsSimulationCraps(int ciclos) {
        this.ciclos = ciclos;
    }
    
    public void simular(){
        clsCraps juegoCraps = new clsCraps();
        boolean result;
        for(int i=0; i<ciclos;i++){
            result = juegoCraps.jugar();
            if (result == true){
                gano++;
            }else{
                perdio++;
            }
        }
        
        System.out.println();
        System.out.println();
        System.out.println("El juegador gano: " + gano + " partidas.");
        System.out.println("El juegador perdio: " + perdio + " partidas.");
        
        double procentaje = 100 - (gano*100 / ciclos);
        System.out.println("La casa gana : " + procentaje + "% de las veces.");
    }
}
