package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

/**
 * Servlet implementation class CookieExample
 */
@WebServlet("/CookieExample")
public class CookieExample extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    static int i;
    static int j;
    public CookieExample() {
        super();
        // TODO Auto-generated constructor stub
    }

 
    /**
     * @see Servlet#init(ServletConfig)
     */
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
    }

 
    /**
     * @see Servlet#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

 

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String shirt = request.getParameter("shirt");
        String book = request.getParameter("book");
        Cookie c1 = new Cookie("shirt" + i, shirt);
        Cookie c2 = new Cookie("book" + j, shirt);
        response.addCookie(c1);
        response.addCookie(c2);
        i++;
        j++;
        out.println("<h3>Items  are</h3>");
        out.println("<h3>" + c1.getName() + ":" + shirt + "</h3>");
        out.println("<h3>" + c2.getName() + ":" + book + "</h3>");
        Cookie s[] = request.getCookies();
        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                out.println("<h3>" + s[i].getName() + ":" + s[i].getValue() + "</h3>");

 

            }
        }
        RequestDispatcher rd = request.getRequestDispatcher("/CookieExample.jsp");
        rd.include(request, response);
        out.close();
    }

 

}