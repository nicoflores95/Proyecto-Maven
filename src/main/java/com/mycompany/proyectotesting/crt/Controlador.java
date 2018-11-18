/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectotesting.crt;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import simulador.Metodos;
/**
 *
 * @author nicof
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Metodos prueba = new Metodos();
        boolean a = false;
        boolean b = false;
        boolean c = false;
        

        
            a = prueba.validarRut(request.getParameter("indentificador"));
            b = prueba.validarMonto(request.getParameter("monto"));
            c = prueba.validarCouta(request.getParameter("cuotas"));
            
             out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                out.println("< script src = \" https://unpkg.com/sweetalert/dist/sweetalert.min.js \" > < / script > ");
            
       try (PrintWriter out = response.getWriter()) {
          
               
                
                
                if( a!= true|| b!=true || c!=true ){
                    
                if (a != true) {
                    /*
                out.println("<script>");
                out.println("$(document).ready(function(){");
                out.println("swal ( 'Oops' ,  'RUT INVALIDO' ,  'error' )");
                out.println("});");
                out.println("</script>");
                */
                out.println("<script>");
                out.println("alert('RUT INVALIDO');");
                out.println("</script>");
               
           }
                if (b!= true) {
                    /*
                out.println("<script>");
                out.println("$(document).ready(function(){");
                out.println("swal ( 'Oops' ,  'MONTO INVALIDO' ,  'error' )");
                out.println("});");
                out.println("</script>");
                */
                 out.println("<script>");
                out.println("alert('MONTO INVALIDO');");
                out.println("</script>");

           }
                if (c!=true) {
                    /*
                out.println("<script>");
                out.println("$(document).ready(function(){");
                out.println("swal ( 'Oops' ,  'CUOTA INVALIDO' ,  'error' )");
                out.println("});");
                out.println("</script>");
                */
                out.println("<script>");
                out.println("alert('CUOTA INVALIDA');");
                out.println("</script>");
           }
                
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.include(request, response);
       }else{
                
                RequestDispatcher rd = request.getRequestDispatcher("/solicitud.jsp");
                rd.include(request, response);
                }                
           
           
           
           /* if(numero>300000){
            out.println("numero");
            }else{
            out.println("NO NUMERO");
            out.println("reterno =="+bb+"===");
            }
           if(a==false){
                
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
               
                out.println("<script>");
                out.println("$(document).ready(function(){");
                out.println("swal ( 'Oops' ,  'RUT INVALIDO' ,  'error' )");
                out.println("});");
                out.println("</script>");
                
                RequestDispatcher rd = request.getRequestDispatcher("/inicio.jsp");
                rd.include(request, response);
        
            }else{
                out.println("<pre> RUT VALIDO<pre/>");
            }*/
    
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
