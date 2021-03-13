<html>
<body>
<%@ page isErrorPage="true" %>
<h4>This is ShowErrors.jsp page showing the error of ErrorPage.jsp</h4>
The following error occured:<hr>
<%exception.printStackTrace(new java.io.PrintWriter(out));%>
 </body></html>