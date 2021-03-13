<html>
<body>
<%@page errorPage = "ShowError.jsp" %>
<%
String st1 = request.getParameter("t1");
String st2 = request.getParameter("t2");
double n = Double.parseDouble(st1);
double n2 = Double.parseDouble(st2);
%>
<center>
Numerator is :<%=n %><br>
denominatorrator is :<%=n2 %><br>
Quotient is :<%=n/n2 %>
</center>
</body>
</html>


