package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class URLDEMO
 */
@WebServlet("/URlDemo")
public class URlDemo extends HttpServlet {
private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#HttpServlet()
*/
public URlDemo() {
super();
// TODO Auto-generated constructor stub
}

 /**
* @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
*/
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String n=request.getParameter("userName");
out.print("Welcome "+n);
//appending the username in the query string
out.print("<a href='URlDemo1?uname="+n+"'>visit</a>");
out.close();
}catch(Exception e){System.out.println(e);}
}

}