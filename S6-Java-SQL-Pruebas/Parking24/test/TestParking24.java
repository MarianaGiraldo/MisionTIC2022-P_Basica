import controllers.ParkingController;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import models.Parking;
import models.ParkingLog;
import models.Searchs;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.db.DBConf;


public class TestParking24 {
    
    ParkingController parCtr = new ParkingController();
    
    public TestParking24() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        DBConf.testMode = true;
        new Searchs().startDbTest();
    }
    
    @After
    public void tearDown() {
    }


    // Pruebas
    
    @Test
    public void get_list_parking_free_test(){
        System.out.println("Entró a la prueba");
//        List<Parking> parkingList = parCtr.getParkingListFree();
//        
//        List<Integer> parkingIdList = parkingList
//                                        .stream()
//                                        .map(parking -> parking.getId())
//                                        .collect( Collectors.toList() );
//      
//        assertThat(parkingIdList, CoreMatchers.is(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)) );
    }
    
    
    @Test
    public void get_list_parking_free_2_test(){
//        List<Parking> parkingList = parCtr.getParkingListFree();
//        
//        if( parkingList.size() < 9 )
//            assertTrue(false);
//        
//        for(Parking par : parkingList){
//            if( par.getId() < 1 && par.getId() > 9)
//                assertTrue(false);
//        }
    }
    
    
    @Test
    public void get_list_parking_not_free_test(){
//        List<Parking> parkingList = parCtr.getParkingListNotFree();
//        
//        List<Integer> parkingIdList = parkingList
//                                        .stream()
//                                        .map(parking -> parking.getId())
//                                        .collect( Collectors.toList() );
//      
//        assertThat(parkingIdList, CoreMatchers.is(Arrays.asList(10)) );
    }
    
    
    @Test
    public void get_all_list_parking_test(){
//        List<Parking> parkingList = parCtr.getAllParkingList();
//        
//        List<Integer> parkingIdList = parkingList
//                                        .stream()
//                                        .map(parking -> parking.getId())
//                                        .collect( Collectors.toList() );
//      
//        assertThat(parkingIdList, CoreMatchers.is(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) );
    }
    
    
    @Test
    public void parking_new_arrived_test(){
//        try {
//            parCtr.setArrivedToParking(1, "KDU748");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            assertTrue(false);
//        }
//        
//        try {
//            Parking par = (Parking) new Parking().get(1);
//            assertTrue( !par.getIsFree() );
//            assertEquals(par.getCarNumber(), "KDU748");
//            assertNotNull( par.getArrived() );
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            assertTrue(false);
//        }
    }
    
    @Test
    public void parking_new_arrived_fail_test(){
//        try {
//            parCtr.setArrivedToParking(25, "");
//            parCtr.setArrivedToParking(25, null);
//            parCtr.setArrivedToParking(0, "KDU748");
//            parCtr.setArrivedToParking(25, "KDU748");
//            assertTrue(false);
//        } catch (Exception ex) {
//            assertTrue(true);
//        }
    }
    
    
    
    @Test
    public void parking_departure_test(){
//        try {
//            parCtr.setArrivedToParking(1, "KDU748");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            assertTrue(false);
//        }
//        
//        try {
//            parCtr.setDepartureToParking(1);
//        } catch (Exception ex) {
//            assertTrue(false);
//        }
//        Parking par = null;
//        try {
//            par = (Parking) new Parking().get(1);
//            assertTrue( par.getIsFree() );
//            assertNull(par.getCarNumber());
//            assertNull( par.getArrived() );
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            assertTrue(false);
//        }
//        
//        try {
//            ParkingLog log = (ParkingLog) new ParkingLog().get(1);
//            assertEquals(log.getCode(), par.getCode());
//            assertEquals(log.getCarNumber(), "KDU748");
//            assertNotNull( log.getArrived() );
//            assertNotNull( log.getDeparture() );
//            assertNotNull( log.getMinutes() );
//            assertEquals(log.getParkingId(), par.getId());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            assertTrue(false);
//        }
    }
    
    
}
