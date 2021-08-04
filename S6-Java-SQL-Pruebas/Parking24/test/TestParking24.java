import controllers.ParkingController;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Searchs;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.db.DBConf;


public class TestParking24 {
    
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
    public void test(){
        ParkingController parkingCtr = new ParkingController();
        try {
            parkingCtr.pruebaDb();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
