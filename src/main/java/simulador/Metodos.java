/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author nicof
 */
public class Metodos {

    
    //Valida el monto del credito,  retornta true o false 
    public boolean validarMonto(String monto1)
    {
        int monto;
        
        boolean aprobo = false;
        
        if (isNumeric(monto1 ) == true) {
            
            monto = Integer.parseInt(monto1);
            
        if (520200 < monto && monto < 41068501) {
            
            aprobo = true;
        }
        }

            return aprobo;
    }
    
    //Valida la Couta para pagar el credito 
    public boolean validarCouta(String cuota1)
    {
        boolean paso = false;
        int cuota;
        if (isNumeric(cuota1) == true) {
            
            cuota = Integer.parseInt(cuota1);
        if (cuota > 11 && 61 > cuota) {
            paso = true;
        }
        }
            return paso;
    }
    
        //Valida la Renta
    public boolean validarRenta(String renta1)
    {
        boolean paso = false;
        int renta;
        
        if (isNumeric(renta1)) {
            
            renta = Integer.parseInt(renta1);
            
        if (renta > 399999 && 10000000 > renta) {
            paso = true;
        }
        
        }
            return paso;
    }
            
    //  Valida que el rut sea valido
public boolean validarRut(String rut) {
       
    boolean validacion = false;
    try {
        rut =  rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

        char dv = rut.charAt(rut.length() - 1);

        int m = 0, s = 1;
        for (; rutAux != 0; rutAux /= 10) {
            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
        }
        if (dv == (char) (s != 0 ? s + 47 : 75)) {
            validacion = true;
        }

    } catch (java.lang.NumberFormatException e) {
    } catch (Exception e) {
    }
    return validacion;
}

//Valida el nombre del solicitanten

public boolean validarNombre(String nombre)
{
        boolean V = false;
        
        for (int n=0; n < nombre.length (); n++) 
             { 
                     char c = nombre.charAt (n);
        
                    int ascii = nombre.codePointAt(n);
      
                    if(ascii<39 || ascii>40 && ascii<45 || ascii<65 && ascii>45  || ascii <97 && ascii>90 || ascii<128 && ascii >122 || ascii < 160 && ascii > 155 ){
                 
                            V = false;
                     }
        
                    else{
                        V = true;
                        }            
    }
        
        return V;
}

    //Validar cantidad de digito que tiene el celular
        public boolean validarCelular(String celular)
        {
            boolean ver = true;
            
                for(int x=0; x<celular.length(); x++ ){
       
                    int num = celular.codePointAt(x);
        
       
                    if(celular.length() != 9 || num<48 && num >57){
            
                    ver = false;            
                        break;
        
                    }
        
    }
                 
            return ver;
        }
        
        //Validar Telefono 8 digitos
        public boolean validarTelefono(String telefono)
        {
            boolean ver = true;
            
                for(int x=0; x<telefono.length(); x++ ){
       
                    int num = telefono.codePointAt(x);
        
       
                    if(telefono.length() != 8 || num<48 && num >57){
            
                    ver = false;            
                        break;
        
                    }
        
    }
                 
            return ver;
        }
        
        //Validar el Correo electronico
        public boolean validarCorreo(String Correo){
            
           String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Correo);
        
        return matcher.matches();
        
        }
        
        private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    
    
}

