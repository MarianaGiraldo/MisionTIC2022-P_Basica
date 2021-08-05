package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.db.Perseverance;


public class Searchs extends Perseverance{

    public void startDbTest(){
        System.out.println("Se creo la base de datos de prueba!!!!!!!!!");
        try(Connection conn = createDBTesting()){
            // no hacer nada
        }catch(Exception e){
            e.printStackTrace();
        }
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

    public List<Parking> getParkingListFree() {
        List<Parking> parkingList = new ArrayList();
        try(Connection conn = super.createConnection()){
            String query = "SELECT p.id, p.code, p.is_free, p.car_number, p.arrived "
                    + "     FROM parking p where p.is_free = true";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while( result.next() ){
                parkingList.add( Parking.rowMapper( result ) );
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return parkingList;
    }
    
}
