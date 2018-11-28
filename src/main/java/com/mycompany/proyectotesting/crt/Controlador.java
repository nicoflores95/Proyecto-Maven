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
        boolean a ;
        boolean b ;
        boolean c ;
        

        
            a = prueba.validarRut(request.getParameter("indentificador"));
            b = prueba.validarMonto(request.getParameter("monto"));
            c = prueba.validarCouta(request.getParameter("cuotas"));
            
            
       try (PrintWriter out = response.getWriter()) {
          
               
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Validar Campos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
                if( !a|| !b || !c){
                    
                if ( !a ) {

                out.println("<script> alert('RUT INVALIDO'); </script>");
                }
                if (!b) {

                 out.println("<script>");
                out.println("alert('MONTO INVALIDO');");
                out.println("</script>");

           }
                if (!c) {

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
