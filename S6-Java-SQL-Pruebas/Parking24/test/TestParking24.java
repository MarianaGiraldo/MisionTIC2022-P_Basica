import controllers.ParkingController;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import models.Parking;
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
    public void get_list_parking_free(){
        List<Parking> parkingList = parCtr.getParkingListFree();
        
        List<Integer> parkingIdList = parkingList
                                        .stream()
                                        .map(parking -> parking.getId())
                                        .collect( Collectors.toList() );
      
        assertThat(parkingIdList, CoreMatchers.is(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)) );
    }
    
    
    @Test
    public void get_list_parking_free_2(){
        List<Parking> parkingList = parCtr.getParkingListFree();
        
        if( parkingList.size() < 9 )
            assertTrue(false);
        
        for(Parking par : parkingList){
            if( par.getId() < 1 && par.getId() > 9)
                assertTrue(false);
        }
    }
    
    
    
}
