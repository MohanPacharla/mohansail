package com.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/ServletDemo")
public class MyFilter implements Filter {

    /**
     * Default constructor. 
     */
	ServletContext ctx=null;
	
    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String user1=request.getParameter("uname");
		String pass=request.getParameter("upass");
		if(user1.equalsIgnoreCase("mohan")&& pass.equalsIgnoreCase("java")) {
			request.setAttribute("username", user1);
			
		
		chain.doFilter(request, response);
		}
		else {
            RequestDispatcher rd = ctx.getRequestDispatcher("/Filter.html");
            rd.include(request, response);
        }
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		 ctx = fConfig.getServletContext();
	        System.out.println("init");
	}

}
