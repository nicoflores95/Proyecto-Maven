/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nicof
 */
public class MetodosNGTest {
    
    public MetodosNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of validarMonto method, of class Metodos.
     */
    @Test
    public void testValidarMonto() {
        System.out.println("validarMonto");
        String monto1 = "600000";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarMonto(monto1);
        
        try{
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }catch(Error err){
            
            fail("Monto INVALIDO");
            
        }
    }

    /**
     * Test of validarCouta method, of class Metodos.
     */
    @Test
    public void testValidarCouta() {
        System.out.println("validarCouta");
        String cuota1 = "12";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarCouta(cuota1);
        
        try{
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }catch(Error err){
            
            fail("couta INVALIDO");
            
        }
    }

    /**
     * Test of validarRenta method, of class Metodos.
     */
    @Test
    public void testValidarRenta() {
        System.out.println("validarRenta");
        String renta1 = "600000";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarRenta(renta1);
        try{
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }catch(Error err){
            
            fail("Renta INVALIDO");
            
        }
    }

    /**
     * Test of validarRut method, of class Metodos.
     */
    @Test
    public void testValidarRut() {
        System.out.println("validarRut");
        String rut = "19";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarRut(rut);
        
        try{
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }catch(Error err){
            
            fail("rut INVALIDO");
            
        }
    }

    /**
     * Test of validarNombre method, of class Metodos.
     */
    @Test
    public void testValidarNombre() {
        System.out.println("validarNombre");
        String nombre = "nioc";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarNombre(nombre);
        
        try{
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }catch(Error err){
            
            fail("Nombre INVALIDO");
            
        }
    }

    /**
     * Test of validarCelular method, of class Metodos.
     */
    @Test
    public void testValidarCelular() {
        System.out.println("validarCelular");
        String celular = "994573188";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarCelular(celular);
        
        try{
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }catch(Error err){
            
            fail("CELULAR INVALIDO");
            
        }
    }

    /**
     * Test of validarTelefono method, of class Metodos.
     */
    @Test
    public void testValidarTelefono() {
        System.out.println("validarTelefono");
        String telefono = "26451419";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarTelefono(telefono);
        
        try{
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }catch(Error err){
            
            fail("TELEFONO INVALIDO");
            
        }
    }

    /**
     * Test of validarCorreo method, of class Metodos.
     */
    @Test
    public void testValidarCorreo() {
        System.out.println("validarCorreo");
        String Correo = "nico@outlook.com";
        Metodos instance = new Metodos();
        boolean result = false;
        result = instance.validarCorreo(Correo);
        
        try{
        assertTrue("Error, El correo es invalido", result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }catch(Error err){
            
            fail("CORREO INVALIDO");
            
        }
    }
    
}
