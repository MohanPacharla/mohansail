<html>
<body bgcolor=cornsite text=blue>
<h3> Product of Two Numbers</h3>
<%!
Double fn,sn;
public double calculate(double d1,double d2)
{
	return d1*d2;
	
}
public void display(double d1,double d2 ,JspWriter pw) throws java.io.IOException
{
	pw.println("<br>The sum is "+(d1+d2));
	
}
%>
<% 
String str1=request.getParameter("first");
String str2=request.getParameter("second");
fn=Double.parseDouble(str1);
sn=Double.parseDouble(str2);
out.println("<br>First Number is "+fn);
out.println("<br>Second Number is "+sn);

 

 %>
 
 Product is:<%=calculate(fn,sn) %>
<% display(fn,sn,out); %>

 </body></html>