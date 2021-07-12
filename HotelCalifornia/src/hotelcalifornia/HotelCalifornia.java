/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelcalifornia;

import Classes.Hotel;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class HotelCalifornia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option, roomType;
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
      
            System.out.println("Opciones:\n1.Mostrar detalles de las habitaciones\n2.Mostrar disponibilidad de habitaciones \n3.Reservar\n4.Ordenar comida\n5.Liberar habitaciÃ³n\n6.Salir\n");
            System.out.print("OpciÃ³n: ");
            option = sc.nextInt();
            switch(option){
                case 1 -> { 
                    System.out.println("\nSeleccione una habitaciÃ³n :\n1.Doble lujosa \n2.Doble sencilla \n3.Lujosa \n4.Sencilla\n");
                    System.out.print("OpciÃ³n: ");
                    roomType = sc.nextInt();
                    Hotel.featuresRoom(roomType);
                }
                case 2 -> {
                    System.out.println("\nSeleccione una habitaciÃ³n :\n1.Doble lujosa \n2.Doble sencilla \n3.Lujosa \n4.Sencilla\n");
                    System.out.print("OpciÃ³n: "); 
                    roomType = sc.nextInt();
                    Hotel.getAvailableRooms(roomType);
                }
                case 3 -> {
                    System.out.println("\nSeleccione una habitaciÃ³n :\n1.Doble lujosa \n2.Doble sencilla \n3.Lujosa \n4.Sencilla\n");
                    System.out.print("OpciÃ³n: ");
                    roomType = sc.nextInt();
                    Hotel.bookRoom(roomType);
                }
                case 4 -> {
                    System.out.print("NÃºmero de habitaciÃ³n: ");
                    roomType = sc.nextInt();
                    if(roomType>60)
                        System.out.println("La habitaciÃ³n no existe");
                    else if(roomType>40)
                        Hotel.roomService(roomType-41, 4);
                    else if(roomType>30)
                        Hotel.roomService(roomType-31, 3);
                    else if(roomType>10)
                        Hotel.roomService(roomType-11, 2);
                    else if(roomType>0)
                        Hotel.roomService(roomType-1, 1);
                    else
                        System.out.println("La habitaciÃ³n no existe");
                }
                case 5 -> {                 
                    System.out.print("NÃºmero de habitaciÃ³n: ");
                    roomType = sc.nextInt();
                    if(roomType>60)
                        System.out.println("La habitaciÃ³n no existe");
                    else if(roomType>40)
                        Hotel.deallocateRoom(roomType-41,4);
                    else if(roomType>30)
                        Hotel.deallocateRoom(roomType-31,3);
                    else if(roomType>10)
                        Hotel.deallocateRoom(roomType-11,2);
                    else if(roomType>0)
                        Hotel.deallocateRoom(roomType-1,1);
                    else
                        System.out.println("La habitaciÃ³n no existe");
                }
                case 6 -> runSowfware = false;
            }
        }          
        
    }
    
}
