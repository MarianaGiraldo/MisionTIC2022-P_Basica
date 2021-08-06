/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Calculadora.Operaciones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class PruebaOperaciones {
    
    public PruebaOperaciones() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Método único antes de la clase");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Método final");
    }
    
    @Before
    public void setUp() {
        System.out.println("Inicio del método");
    }
    
    @After
    public void tearDown() {
        System.out.println("Final del método");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void PruebaSumarListaNumeros() {
        long[] listaNumeros = new long[]{1,2,3,4,5};
        Operaciones operaciones = new Operaciones();
        assertEquals(15, operaciones.Suma(listaNumeros));
    }
    
    @Test
    public void PruebaSumarNumeros() {
        long num1=5;
        long num2=20;
        Operaciones operaciones = new Operaciones();
        assertEquals(25, operaciones.Suma(num1, num2));
    }
    
    @Test
    public void PruebaRestarNumeros() {
    }
    
    @Test
    public void PruebaMultiplicarListaNumeros() {
    }
    
    @Test
    public void PruebaMultiplicarNumeros() {
    }
    
    @Test
    public void PruebaDividirNumeros() {
    }
    
}
