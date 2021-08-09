/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.DepartamentoController;
import Models.Departamento;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import utils.db.DBConf;
import utils.db.Searchs;

/**
 *
 * @author maria
 */
//@RunWith(MockitoJUnitRunner.class)
public class TestDepartamento {
//    @InjectMocks
//    
//    @Mock
//    DepartamentoController deptController;
//    
    
    public TestDepartamento() {
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
    @Test
    public void getDepartamentoList_test() {
        List<Departamento> departamentosList = DepartamentoController.getDepartamentoList();
        List<Integer> departamentosIdList;
        departamentosIdList = departamentosList
                .stream()
                .map(parking -> parking.getId())
                .collect( Collectors.toList() );
      
        assertThat(departamentosIdList, CoreMatchers.is(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
                13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 
                23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33)) );
    }
    
    @Test
    public void deleteDepartamento_test() {
        Random random = new Random();
        Integer idDeleted = random.ints(1, 33).findFirst().getAsInt();
        Integer idDeptDeleted = DepartamentoController.deleteDepartamento(idDeleted);
        assertEquals(idDeleted, idDeptDeleted);
    }    
    
}
