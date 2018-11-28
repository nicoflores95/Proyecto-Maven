package simulador;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author nicof
 */
public class MetodosNGTest {
    


    @Test
    public void testValidarMonto() {
       
        
        String monto1 = "600000";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarMonto(monto1);
        
        try{
            
       assertEquals(result, expResult);
        
        
        }catch(Error err){
            
            fail("Monto INVALIDO");
            
        }
    }

    @Test
    public void testValidarCouta() {

        String cuota1 = "12";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarCouta(cuota1);
        
        try{
            
        assertEquals(result, expResult);

        }catch(Error err){
            
            fail("couta INVALIDO");
            
        }
    }


    @Test
    public void testValidarRenta() {

        String renta1 = "600000";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarRenta(renta1);
        try{
            
        assertEquals(result, expResult);

        }catch(Error err){
            
            fail("Renta INVALIDO");
            
        }
    }


    @Test
    public void testValidarRut() {

        String rut = "19";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarRut(rut);
        
        try{
            
        assertEquals(result, expResult);

        }catch(Error err){
            
            fail("rut INVALIDO");
            
        }
    }

    @Test
    public void testValidarNombre() {

        String nombre = "nioc";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarNombre(nombre);
        
        try{
            
        assertEquals(result, expResult);

        }catch(Error err){
            
            fail("Nombre INVALIDO");
            
        }
    }


    @Test
    public void testValidarCelular() {
        System.out.println("validarCelular");
        String celular = "994573188";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarCelular(celular);
        
        try{
            
        assertEquals(result, expResult);

        }catch(Error err){
            
            fail("CELULAR INVALIDO");
            
        }
    }


    @Test
    public void testValidarTelefono() {

        String telefono = "26451419";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarTelefono(telefono);
        
        try{
            
        assertEquals(result, expResult);

        }catch(Error err){
            
            fail("TELEFONO INVALIDO");
            
        }
    }


    @Test
    public void testValidarCorreo() {

        String email = "nico@gmail.com";
        Metodos instance = new Metodos();
        boolean expResult = true;
        boolean result = instance.validarCorreo(email);
        
        try{
        assertEquals(result, expResult);

        }catch(Error err){
            
            fail("CORREO INVALIDO");
            
        }
    }
    
       @Test
    public void testMultiplica(){
        
        Metodos instance = new Metodos();
        
        int a = instance.multiplica(3, 2);
        int b = 6;
           System.out.println(a);
        try{
            
        assertEquals(b, a);
        
        
        }catch(Error err){
            
        fail("CORREO INVALIDO");
        
        }
    }
    
}
