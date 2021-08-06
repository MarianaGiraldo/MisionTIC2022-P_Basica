/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Calculadora.GeneradorNumeros;
import Calculadora.Operaciones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author maria
 */
@RunWith(MockitoJUnitRunner.class)
public class PruebaOperaciones {
    @InjectMocks
    private final Operaciones operaciones;
    
    @Mock
    GeneradorNumeros generador;
    
    public PruebaOperaciones() {
        operaciones = new Operaciones();
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
        assertEquals(15, operaciones.Sumar(listaNumeros));
    }
    
    @Test
    public void PruebaSumarNumeros() {
        long num1=5;
        long num2=20;
        assertEquals(25, operaciones.Sumar(num1, num2));
    }
    
    @Test
    public void PruebaRestarNumeros() {
        long num1=100;
        long num2=20;
        assertEquals(80, operaciones.Restar(num1, num2));
    }
    
    @Test
    public void PruebaMultiplicarListaNumeros() {
        long[] listaNumeros = new long[]{1,2,3,4};
        assertEquals(24, operaciones.Multiplicar(listaNumeros));
    
    }
    
    @Test
    public void PruebaMultiplicarNumeros() {
        long num1=5;
        long num2=10;
        assertEquals(50, operaciones.Multiplicar(num1, num2));
    }
    
    @Test
    public void PruebaDividirNumeros() {
        long num2=5;
        long num1=20;
        assertEquals(4, operaciones.Dividir(num1, num2), 0.0001);
    }
    
    @Test (expected = ArithmeticException.class)
    public void PruebaDividirNumerosException() {
        long num2=0;
        long num1=20;
        assertEquals(ArithmeticException.class, operaciones.Dividir(num1, num2));
    }
    
    @Test (expected = ArithmeticException.class)
    public void PruebaPromedioNumerosVacios(){
        Mockito.when(this.generador.ListaNumeros()).thenReturn(new long[]{});
        assertEquals(ArithmeticException.class, this.operaciones.Promedio(this.generador.ListaNumeros()));
    }
    
    @Test 
    public void PruebaPromedioNumeros(){
        Mockito.when(this.generador.ListaNumeros()).thenReturn(new long[]{1,2,3,4,5});
        assertEquals(3.0, this.operaciones.Promedio(this.generador.ListaNumeros()), 0.01);
    
    }
    
}
