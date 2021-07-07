/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retojava;

import Classes.clsAutosRadar;
import Classes.clsCalculadora;
import Classes.clsCuerpoCaidaLibre;
import Classes.clsDispositivosIoT;
import Classes.clsDistanciaRed;

/**
 *
 * @author maria
 */
public class RetoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clsCalculadora operacion1 = new clsCalculadora("+",1,3);
        clsCalculadora operacion2 = new clsCalculadora("-",15,5);
        clsCalculadora operacion3 = new clsCalculadora("*",4,4); 
        
        
        operacion1.Calcular();
        operacion2.Calcular();
        operacion3.Calcular();
        
        clsAutosRadar auto1 = new clsAutosRadar();
        auto1.setPlaca("YYY-456");
        auto1.setDistancia1(1.3);
        auto1.setDistancia2(240);
        auto1.setTiempo(1);
        auto1.setGr_alcohol(120);
        
        clsAutosRadar auto2 = new clsAutosRadar("XXX-123" ,25,200,0.8,155);
        
        auto1.MultarVel();
        auto1.MultarAlcohol();
        auto2.MultarVel();
        auto2.MultarAlcohol();
        
        clsDispositivosIoT dispositivo1 = new clsDispositivosIoT("eléctrico", "luces", "ON");
        clsDispositivosIoT dispositivo2 = new clsDispositivosIoT("sensor", "temperatura", "OFF");
        clsDispositivosIoT dispositivo3 = new clsDispositivosIoT("alarma", "apertura", "ON");
        clsDispositivosIoT dispositivo4 = new clsDispositivosIoT("sensor", "humedad", "ON");
        clsDispositivosIoT dispositivo5 = new clsDispositivosIoT("eléctrico", "luces", "OFF");
     
        int contadorON = 0;
        if ("ON".equals(dispositivo1.getEstado())){
            contadorON++;
        }
        if ("ON".equals(dispositivo2.getEstado())){
            contadorON++;
        }
        if ("ON".equals(dispositivo3.getEstado())){
            contadorON++;
        }
        if ("ON".equals(dispositivo4.getEstado())){
            contadorON++;
        }
        if ("ON".equals(dispositivo5.getEstado())){
            contadorON++;
        }
        System.out.println("La cantidad de dispositivos Encendidos son "+contadorON);
        
        
        clsDistanciaRed distancia1 = new clsDistanciaRed(2.0,2.0,4.0,4.0,6.0,6.0,7.0,7.0,8.0,8.0);  
        clsDistanciaRed distancia2 = new clsDistanciaRed(1,1,3,3,5,5,7,7,9,9);  
        
        System.out.println(distancia1.calcular_distancia_total());
        System.out.println(distancia2.calcular_distancia_total());
    
        
        clsCuerpoCaidaLibre cuerpo1 = new clsCuerpoCaidaLibre(10);
        clsCuerpoCaidaLibre cuerpo2 = new clsCuerpoCaidaLibre(50);
        clsCuerpoCaidaLibre cuerpo3 = new clsCuerpoCaidaLibre(100);
        
        cuerpo1.DistanciaRecorridaXsegundo();
        cuerpo2.DistanciaRecorridaXsegundo();
        cuerpo3.DistanciaRecorridaXsegundo();
    }
    
}
