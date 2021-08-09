/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.DepartamentoController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
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
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        DBConf.testMode = true;
        new Searchs().startDbTest();
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getDepartamentoList_test() {
        //DepartamentoController.getDepartamentoList();
        System.out.println("Entró al test");
    }
}
