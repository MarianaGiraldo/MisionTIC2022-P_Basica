package models;

import java.sql.Timestamp;
import utils.db.Perseverance;


public class ParkingLog extends Perseverance{
    
    private Integer id;
    private String code;
    private String carNumber;
    private Timestamp arrived;
    private Timestamp departure;
    private Integer minutes;
    private Integer parkingId;

    public ParkingLog() {
    }

    public ParkingLog(Integer id, String code, String carNumber, Timestamp arrived, Timestamp departure, Integer minutes, Integer parkingId) {
        this.id = id;
        this.code = code;
        this.carNumber = carNumber;
        this.arrived = arrived;
        this.departure = departure;
        this.minutes = minutes;
        this.parkingId = parkingId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Timestamp getArrived() {
        return arrived;
    }

    public void setArrived(Timestamp arrived) {
        this.arrived = arrived;
    }

    public Timestamp getDeparture() {
        return departure;
    }

    public void setDeparture(Timestamp departure) {
        this.departure = departure;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getParkingId() {
        return parkingId;
    }

    public void setParkingId(Integer parkingId) {
        this.parkingId = parkingId;
    }

    @Override
    public Object get(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer save() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
