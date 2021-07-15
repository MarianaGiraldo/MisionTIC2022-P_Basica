/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retojava;

import Classes.*;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class RetoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean firstTime = true;
        boolean runSowfware = true;
        Scanner sc = new Scanner(System.in);

        
        while(runSowfware){
            if( firstTime ){
                firstTime = false;
            } else {
                System.out.println();
                System.out.println("Presione enter para continuar");
                new Scanner(System.in).nextLine();
            }
            
            System.out.println("Opciones:\n 1.Calculadora. \n 2.Radar de autos. \n 3.Dispositivos IoT. \n 4.Cuerpos en Caída libre. \n 5.Distancia más corta en redes móviles. \n 6.Salir. ");
            System.out.print("Opción: ");
            int option = sc.nextInt();
            
                    sc.nextLine();
            switch(option){
                case 1 -> {
                    clsCalculadora operacion = new clsCalculadora();
                    System.out.print("Ingrese el primer número: ");
                    operacion.setNumero1(sc.nextDouble());
                    sc.nextLine();
                    System.out.print("Ingrese el símbolo de la operación a realizar (+,-,*,/): ");
                    operacion.setOperador(sc.nextLine());
                    System.out.print("Ingrese el segundo número: ");
                    operacion.setNumero2(sc.nextDouble());
                    operacion.Calcular();
                }
                case 2 -> {
                    clsAutosRadar auto = new clsAutosRadar();
                    System.out.print("Ingrese la placa del vehículo: ");
                    String placa = sc.nextLine();
                    auto.setPlaca(placa);
                    System.out.print("Ingrese la posición 1 en Kilómetros: ");
                    auto.setDistancia1(sc.nextDouble());
                    System.out.print("Ingrese la posición 2 en Kilómetros: ");
                    auto.setDistancia2(sc.nextDouble());
                    System.out.print("Ingrese el tiempo que duró en llegar a la posición 2 en horas: ");
                    auto.setTiempo(sc.nextDouble());
                    System.out.print("Ingrese el grado de alcoholemia del conductor: ");
                    auto.setGr_alcohol(sc.nextDouble());
                   auto.MultarVel();
                   auto.MultarAlcohol();
                }
                case 3 -> {
                    System.out.print("¿Cuántos dispositivos IoT desea añadir?: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    int contadorON = 0;
                    for(int i = 1; i<= cantidad; i++){
                        System.out.println("---Agregando Dispositivo: " + i + "---");
                        clsDispositivosIoT dispositivo = new clsDispositivosIoT();
                        System.out.print("Ingrese el tipo de dispositivo (electrico, sensor o alarma): ");
                        dispositivo.setTipo(sc.nextLine());
                        if (null == dispositivo.getTipo()){
                            System.out.println("Tipo de dispositivo incorrecto");
                            continue;
                        }else switch (dispositivo.getTipo()) {
                            case "electrico" -> {
                                System.out.print("Ingrese el identificador (luces, tomas, entre otros): ");
                                dispositivo.setIdentificador(sc.nextLine());
                            }
                            case "sensor" -> {
                                System.out.print("Ingrese el identificador (humedad, temperatura, entre otros): ");
                                dispositivo.setIdentificador(sc.nextLine());
                            }
                            case "alarma" -> {
                                System.out.print("Ingrese el identificador (movimiento, apertura, entre otros): ");
                                dispositivo.setIdentificador(sc.nextLine());
                            }
                            default -> {
                                System.out.println("Tipo de dispositivo incorrecto");
                                continue;
                            }
                        }
                        System.out.print("Ingrese el Estado del dispositivo (ON, OFF): ");
                        dispositivo.setEstado(sc.nextLine());
                        if ("ON".equals(dispositivo.getEstado())){
                            contadorON++;
                        }
                    }
                    System.out.println("La cantidad de dispositivos Encendidos es de "+contadorON);
                }
                case 4 ->{
                    System.out.print("Ingrese la altura desde la que lanza el objeto: ");
                    clsCuerpoCaidaLibre cuerpo = new clsCuerpoCaidaLibre(sc.nextDouble());
                    cuerpo.DistanciaRecorridaXsegundo();
                }
                case 5 ->{
                    clsDistanciaRed distancia = new clsDistanciaRed();
                    System.out.print("Ingrese las coordenadas en x del celular 1: ");
                    distancia.setCoord_x_cel1(sc.nextDouble());
                    System.out.print("Ingrese las coordenadas en y del celular 1: ");
                    distancia.setCoord_y_cel1(sc.nextDouble());
                    System.out.print("Ingrese las coordenadas en x de la antena 1: ");
                    distancia.setCoord_x_ant1(sc.nextDouble());
                    System.out.print("Ingrese las coordenadas en y de la antena 1: ");
                    distancia.setCoord_y_ant1(sc.nextDouble());
                    System.out.print("Ingrese las coordenadas en x de la Central Holi: ");
                    distancia.setCoord_x_Central(sc.nextDouble());
                    System.out.print("Ingrese las coordenadas en y de la Central Holi: ");
                    distancia.setCoord_y_Central(sc.nextDouble());
                    System.out.print("Ingrese las coordenadas en x de la antena 2: ");
                    distancia.setCoord_x_ant2(sc.nextDouble());
                    System.out.print("Ingrese las coordenadas en y de la antena 2: ");
                    distancia.setCoord_y_ant2(sc.nextDouble());
                    System.out.print("Ingrese las coordenadas en x del celular 2: ");
                    distancia.setCoord_x_cel2(sc.nextDouble());
                    System.out.print("Ingrese las coordenadas en y del celular 2: ");
                    distancia.setCoord_y_cel2(sc.nextDouble());
                    
                    System.out.println("La distancia total fue de: " + distancia.calcular_distancia_total());
                }
                case 6 ->{
                    runSowfware = false;
                }
            }
        }
        
    }
    
}
