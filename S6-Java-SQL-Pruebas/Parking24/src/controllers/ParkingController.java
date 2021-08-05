package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Parking;
import models.Searchs;


public class ParkingController {

    public List<Parking> getParkingListFree() {
        List<Parking> parkingList = new ArrayList();
        parkingList = new Searchs().getParkingListFree();
        return parkingList;
    }

    
    
    
    
}
