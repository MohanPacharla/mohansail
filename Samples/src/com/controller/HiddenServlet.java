package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

/**
 * Servlet implementation class HiddenServlet
 */
@WebServlet("/HiddenServlet")
public class HiddenServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiddenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

 

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html");
        out.println("<head>");
        out.println("</head");
        out.println("<body>");
        out.println("<html");
        String name =  request.getParameter("txtName");
        String contactNo  = request.getParameter("txtContactNo");
        out.println("<h3> welcome" + name+ "</h3>");
        out.println("<form action ='HiddenServlet2'>");
        out.println("email:<input type='text' name='txtemail'>");
        out.println("<br><input type='hidden' name='hName' value ='"+name+"'>");
        out.println("<br><input type='hidden' name='hcontact' value ='"+contactNo+"'>");
        out.println("<input type='submit' value ='submit'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

 

}