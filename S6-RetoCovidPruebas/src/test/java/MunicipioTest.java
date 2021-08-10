/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Models.Departamento;
import Models.Municipio;
import controller.MunicipioController;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.db.DBConf;
import utils.db.Searchs;

/**
 *
 * @author maria
 */
public class MunicipioTest {
    
    public MunicipioTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void getMunicipioList_test() {
        List<Municipio> municipiosList = MunicipioController.getMunicipioList();
        List<Integer> municipiosIdList;
        municipiosIdList = municipiosList
                .stream()
                .map(parking -> parking.getId())
                .collect( Collectors.toList() );
      
        Assert.assertEquals(1126, municipiosIdList.size() );
    }
    
    @Test
    public void getMunicipio_test() throws Exception {
        Random random = new Random();
        Integer idMun = random.ints(1, 1126).findFirst().getAsInt();
        Integer idMunGot = MunicipioController.getMunicipio(idMun);
        Assert.assertEquals(idMun, idMunGot);
    } 
    
    @Test
    public void deleteMunicipio_test() throws Exception {
        Random random = new Random();
        Integer idDeleted = random.ints(1, 1126).findFirst().getAsInt();
        Integer idMunDeleted = MunicipioController.deleteMunicipio(idDeleted);
        Assert.assertEquals(idDeleted, idMunDeleted);
    }  
    
    @Test
    public void saveMunicipio_test() throws Exception {
        Random random = new Random();
        Integer idDep = random.ints(1, 33).findFirst().getAsInt();
        Departamento dep = new Departamento().get(idDep);
        Integer idSaved= 10;
        Integer idMunSaved = MunicipioController.saveMunicipio(idSaved,dep, "Nuevo Municipio", "900");
        Assert.assertEquals(idSaved, idMunSaved);
    }  
}
