package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

/**
 * Servlet implementation class HiddenServlet2
 */
@WebServlet("/HiddenServlet2")
public class HiddenServlet2 extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiddenServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

 

   
       protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           // TODO Auto-generated method stub
           response.setContentType("text/html");
           PrintWriter out = response.getWriter();
           out.println("<html");
           out.println("<head>");
           out.println("</head");
           out.println("<title>Hidden servlet2</title>");
           out.println("<body>");
           out.println("<html");
           String name =  request.getParameter("hName");
           String contactNo  = request.getParameter("hcontact");

           String email  = request.getParameter("txtemail");

 

           out.println("<h2>Details are</h2>"+"<br>");
           out.println("name is :"+name+"<br>");
           out.println("contact no is :"+contactNo+"<br>");
           out.println("email is :"+email+"<br>");
           out.println("</body>");
           out.println("</html>");
           out.close();
       }

 

   }
 
