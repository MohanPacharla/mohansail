package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

 

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html");
        out.println("<head>");
        out.println("<title>Servlet Cookie</title>");
        out.println("</head");
        out.println("<body>");
        out.println("<html");
        
        out.println("<h3> Servlet cookieServlet at   " + request.getContextPath()+ "</h3><br><br>");
        String lucyno =  request.getParameter("txtname");
        Cookie cookie1 =new Cookie("LuckNo", lucyno);
        response.addCookie(cookie1);
        out.println("<a href = 'PrintCookie'>Display cookie</a>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

 

}
 
