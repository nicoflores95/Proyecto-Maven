package com.mycompany.proyectotesting.crt;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import simulador.Metodos;


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
        boolean a ;
        boolean b ;
        boolean c ;
        boolean d ;
        boolean e ;
        boolean f ;
        boolean g ;
        
        a = prueba.validarRut(request.getParameter("rut"));
        b = prueba.validarNombre(request.getParameter("nombre"));
        c = prueba.validarNombre(request.getParameter("apellido"));
        d = prueba.validarRenta(request.getParameter("renta"));
        e = prueba.validarCelular(request.getParameter("celular"));
        f =prueba.validarTelefono(request.getParameter("telefono"));
        g = prueba.validarCorreo(request.getParameter("correo"));
        
        

        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */


            if (!a || !b || !c || !d || !e || !f || !g) {
                
                if (!a) {
                    out.println("<script> alert('RUT INVALIDO'); </script>");

                }
                if (!b) {
                     out.println("<script>");
                     out.println("alert('NOMBRE INVALIDO');");
                     out.println("</script>");
                     

                }
                if (!c) {
                     out.println("<script>");
                out.println("alert('APELLIDO INVALIDO');");
                out.println("</script>");

                }
                if (!d) {
                     out.println("<script>");
                out.println("alert('RENTA INVALIDO');");
                out.println("</script>");

                }
                if (!e) {
                     out.println("<script>");
                out.println("alert('CELULAR INVALIDO');");
                out.println("</script>");

                }
                if (!f) {
                     out.println("<script>");
                out.println("alert('TELEFONO INVALIDO');");
                out.println("</script>");

                }
                if (!g) {
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


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
