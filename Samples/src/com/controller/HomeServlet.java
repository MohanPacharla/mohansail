package com.controller;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1> Home Servlet !!!</h1>");
        
        HttpSession session = request.getSession(false);
        if(session != null)
        {
        String loginId = (String) session.getAttribute("loginId");
       out.println("<h2> Welcome " + loginId + " !!! </h2>");
       out.println("<br> Session ID :: " + session.getId() );
       out.println("<br> Session Creation Time :: " + 
               new java.util.Date(session.getCreationTime()));
       out.println("<br> Last Accessed Time :: " + 
               new java.util.Date(session.getLastAccessedTime()));      
      
       out.println("<br><br> <a href='HomeServlet2'> Next </a>");
       
       out.println("<br><br><br><br><br>");
       out.println("<a href='LogoutServlet'>Logout </a>");
        }
        else
        {
            out.println("<h2> Session Expired...</h2>");
            out.println("<br><a href='LoginPage.html'> Login Again</a> ");
        }       
        out.close();
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
