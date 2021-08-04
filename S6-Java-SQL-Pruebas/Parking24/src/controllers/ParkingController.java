package controllers;

import models.Parking;


public class ParkingController {

    
    public void pruebaDb() throws Exception {
        Parking parking = (Parking) new Parking().get(1);
        parking.setCode("Fre");
        parking.save();
        System.out.println( parking.getCode() );
        
        
        parking = (Parking) new Parking().get(1);
        System.out.println( parking.getCode() );
    }
    
    
    
}
