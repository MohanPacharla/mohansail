package com;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet1
 */
@WebServlet("/HomeServlet1")
public class EmployeeServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	ServletContext ctx=null;
    public EmployeeServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		   ctx=config.getServletContext();
		
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
		PrintWriter pw=response.getWriter();
		  List<Employee> empList = new ArrayList<Employee>();
		
		
		
	    Employee emp1 = new Employee();
		emp1.setEmpNo(1);
		emp1.setEmpName("Mahesh");
		emp1.setSalary(48484);
		
		Employee emp2=new Employee();
		emp2.setEmpNo(2);
		emp2.setEmpName("Rajesh");
		emp2.setSalary(50000);
		
		Employee emp3=new Employee();
		emp3.setEmpNo(3);
		emp3.setEmpName("Kamesh");
		emp3.setSalary(38000);
		
		Employee emp4=new Employee();
		emp4.setEmpNo(4);
		emp4.setEmpName("Ramesh");
		emp4.setSalary(47000);
		
		Employee emp5=new Employee();
		emp5.setEmpNo(5);
		emp5.setEmpName("Suresh");
		emp5.setSalary(40000);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		request.setAttribute("empList",empList);
		request.setAttribute("url","http:/www.google.com");
		RequestDispatcher rd=ctx.getRequestDispatcher("/Home.jsp");
	    rd.forward(request, response);
	}

}
