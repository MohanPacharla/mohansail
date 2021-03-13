package com.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Product;

/**
 * Servlet implementation class AddCartServlet
 */
@WebServlet("/AddCartServlet")
public class AddCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCartServlet() {
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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
	        HttpSession hs = request.getSession();
	        List<Product> cart = (List<Product>)hs.getAttribute("mycart");
	        try
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	            System.out.println(con + " COnnected Successfully");
	            PreparedStatement pst = con.prepareStatement("select *from product where pname=?"); 
	            pst.setString(1,request.getParameter("item"));
	            ResultSet res = pst.executeQuery();
	        
	            while(res.next())
	            {
	                Product p = new Product();
	                p.setPno(res.getInt(1));
	                p.setPname(res.getString(2));
	                p.setPrice(res.getFloat(3));
	                cart.add(p);
	            }
	            out.print("<br> <a href = 'listener.html'>add more cart </a><br>");
	            out.print("<br> <a href = 'ViewCart'>List the Cart </a><br>");
	            
	            
	        }catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }

	 

	}