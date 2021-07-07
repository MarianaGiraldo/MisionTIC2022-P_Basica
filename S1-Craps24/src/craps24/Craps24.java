/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps24;

import Juego.clsCraps;
import Juego.clsSimulationCraps;

/**
 *
 * @author maria
 */
public class Craps24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        clsSimulationCraps simular = new clsSimulationCraps(10000);
        simular.simular();
        
    }
    
}
