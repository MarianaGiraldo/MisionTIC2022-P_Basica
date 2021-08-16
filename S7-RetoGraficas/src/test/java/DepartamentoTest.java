/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Models.Departamento;
import controller.DepartamentoController;
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
import utils.db.DBConf;
import utils.db.Searchs;

/**
 *
 * @author maria
 */
public class DepartamentoTest {
    
    public DepartamentoTest() {
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
    public void getDepartamentoList_test() {
        List<Departamento> departamentosList = DepartamentoController.getDepartamentoList();
        List<Integer> departamentosIdList;
        departamentosIdList = departamentosList
                .stream()
                .map(parking -> parking.getId())
                .collect( Collectors.toList() );
      
        Assert.assertThat(departamentosIdList, CoreMatchers.is(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
                13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 
                23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33)) );
    }
    
    @Test
    public void getDepartamento_test() {
        Random random = new Random();
        Integer idDept = random.ints(1, 33).findFirst().getAsInt();
        Integer idDeptGot = DepartamentoController.getDepartamento(idDept);
        Assert.assertEquals(idDept, idDeptGot);
    } 
    
    @Test
    public void deleteDepartamento_test() {
        Random random = new Random();
        Integer idDeleted = random.ints(1, 33).findFirst().getAsInt();
        Integer idDeptDeleted = DepartamentoController.deleteDepartamento(idDeleted);
        Assert.assertEquals(idDeleted, idDeptDeleted);
    }  
    
    @Test
    public void saveDepartamento_test() throws Exception {
        Integer idSaved= 10;
        Integer idDeptSaved = DepartamentoController.saveDepartamento(idSaved, "Cordoba", "23");
        Assert.assertEquals(idSaved, idDeptSaved);
    }  
}
