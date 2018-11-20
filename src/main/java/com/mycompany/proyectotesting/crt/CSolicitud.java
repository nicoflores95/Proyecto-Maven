/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectotesting.crt;

import java.io.IOException;
import java.io.PrintWriter;
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
public class CSolicitud extends HttpServlet {

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
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        boolean e = true;
        boolean f = true;
        boolean g = true;
        
        a = prueba.validarRut(request.getParameter("rut"));
        b = prueba.validarNombre(request.getParameter("nombre"));
        c = prueba.validarNombre(request.getParameter("apellido"));
        d = prueba.validarRenta(request.getParameter("renta"));
        e = prueba.validarCelular(request.getParameter("celular"));
        f =prueba.validarTelefono(request.getParameter("telefono"));
        g = prueba.validarCorreo(request.getParameter("correo"));
        
        

        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */


            if (a!=true || b!=true || c!=true || d!=true || e!=true || f!=true || g!=true) {
                
                if (a!=true) {
                  out.println("<script>");
                out.println("alert('RUT INVALIDO');");
               out.println("</script>");

                }
                if (b!=true) {
                     out.println("<script>");
                     out.println("alert('NOMBRE INVALIDO');");
                     out.println("</script>");
                     

                }
                if (c!=true) {
                     out.println("<script>");
                out.println("alert('APELLIDO INVALIDO');");
                out.println("</script>");

                }
                if (d!=true) {
                     out.println("<script>");
                out.println("alert('RENTA INVALIDO');");
                out.println("</script>");

                }if (e!=true) {
                     out.println("<script>");
                out.println("alert('CELULAR INVALIDO');");
                out.println("</script>");

                }
                if (f!=true) {
                     out.println("<script>");
                out.println("alert('TELEFONO INVALIDO');");
                out.println("</script>");

                }
                if (g!=true) {
                     out.println("<script>");
                out.println("alert('CORREO INVALIDO');");
                out.println("</script>");

                }
                RequestDispatcher rd = request.getRequestDispatcher("/solicitud.jsp");
                rd.include(request, response);
               
            }else{

                out.println("APROBO");

                
            }

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
