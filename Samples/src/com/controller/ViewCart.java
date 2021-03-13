package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 

import com.model.Product;

 

/**
 * Servlet implementation class ViewCart
 */
@WebServlet("/ViewCart")
public class ViewCart extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCart() {
        super();
        // TODO Auto-generated constructor stub
    }

 

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        PrintWriter out = response.getWriter();
        HttpSession hs = request.getSession();
        List<Product> cart =(List<Product>)hs.getAttribute("mycart");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Addcart </title>");
        out.println("</head>");
        out.println("<body>");
        out.print("<h2>item addded to cart </h2>");
        out.print("Current item in cart");
        for(Product i :cart)
        {
            out.print("<br>"+i);
        }
    }

 

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

 

}
 