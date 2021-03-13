<html>
<body>
<h1 style='color:green'>Hello world</h1>
<br>
<%!
String firstName,lastName,name;
%>
<% 
    firstName=request.getParameter("firstName");
    lastName=request.getParameter("lastName");
    name=firstName+" "+lastName;
    %>
    <jsp:forward page="SendingGreetings.jsp">
        <jsp:param value="<%=name %>" name="myname"/>
        </jsp:forward>
        <h1 style='color:Orange'>Hello World 2</h1>


%></body></html>