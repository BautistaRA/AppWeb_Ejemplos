/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bautista;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bauti
 */
@WebServlet(name = "SaludosServlet", urlPatterns = {"/SaludosServlet"})
public class SaludosServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SaludosServlet</title>");
            out.println("<meta charset=\"utf-8\"");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Contexto de la aplicación: " + request.getContextPath() + "</h2>");
            out.println("<h2>Caracter codificación: " + request.getCharacterEncoding() + "</h2>");
            out.println("<h2>Método de invocación: " + request.getMethod() + "</h2>");
            Enumeration<String> headers = request.getHeaderNames();

            Enumeration e = request.getHeaderNames();
            int c = 0;
            while (e.hasMoreElements()) {
                c++;
                String name = (String) e.nextElement();
                String value = request.getHeader(name);
                out.println(c + "---" + name + " = " + value + "</br>");

            }
            if (request.getHeader("sec-ch-ua").contains("Chrome")) {
                out.println("Estás  utilizando google chrome");
            } else {
                out.print("No estás utilizado google chome");
            }

            out.println("<p>" + "host "+ request.getHeader("host")+ " </p>");
            out.println("<p>" +"Navegador " + request.getHeader("user-agent")+ " </p>");
            out.println("<p>" +"Sistema operativo: " + request.getHeader("sec-ch-ua-platform"));
            out.println("<p> Chicos y chicas hoy es  " + new Date() + " </p>");
            out.println("</body>");
            out.println("</html>");
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
