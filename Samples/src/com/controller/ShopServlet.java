package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 
/**
 * Servlet implementation class ShopServlet
 */
@WebServlet("/ShopServlet")
public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       HttpSession session;
       String pcode,qty,clickButton;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopServlet() {
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
	        session=request.getSession(true);
	        clickButton=request.getParameter("submit");
	        if(clickButton.equals("ADDITEM"))
	        {
	        	pcode=request.getParameter("pcode");
	        	qty=request.getParameter("qty");
	        	if(!pcode.equals(" ")||qty.equals(" "))
	        	{
	        		session.setAttribute(pcode, qty);
	        		response.sendRedirect("Shop.html");
	        		
	        	}
	        }
	        if(clickButton.equals("REMOVEITEM")){
        	    pcode = request.getParameter("pcode");
        	    
        	        session.removeAttribute(pcode);
        	        response.sendRedirect("Shop.html");
        	    }
	        if(clickButton.equals("SHOWITEM"))
	        {
	        	java.util.Enumeration e=session.getAttributeNames();
	        	if(e.hasMoreElements()) {
	        		out.println("<h2><font color=blue> Youe shoping cart items</font></h2>");
	        		while(e.hasMoreElements())
	        		{
	        			out.println("<body bgcolor=cyan>");
	        			String code=(String)e.nextElement();
	        			out.println("<h2>PRODUCT CODE"+code +"<br>");
	        			out.println("QUANTITY :" +session.getAttribute(code));
	        			
	        		}
	        	}
	        	

	        	 

	        	else
	        	{
	        		out.println("<body bgcolor=cyan>");
	        		out.println("<h2><font color=blue> no Items Please</font></h2>");
	        	}
	        	
	        	}
	        if(clickButton.equals("LOGOUT"))
	        	
	         {
	        	session.invalidate();
	        	response.sendRedirect("Shop.html");
	        }
	        if(clickButton.equals("PAYAMOUNT")){
	        	
	            out.println("<body bgcolor=yellow>");
	            out.println("<h2><font color =red>payment logic goes here</font></h2>");
	            
	        }
	        out.close();
	}

}
