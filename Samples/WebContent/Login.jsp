<jsp:useBean id="myobj" class="com.model.User" scope="page">
<% myobj.setUname(request.getParameter("uname"));
   myobj.setUpass(request.getParameter("upass"));
   
%>
</jsp:useBean>
User Name:<jsp:getProperty property="uname" name="myobj"/></br>
Password: <jsp:getProperty property="upass" name="myobj"/></br>
<% if(myobj.validate()){
	
session.setAttribute("username",myobj.getUname());
%>
<jsp.forword page="./HomePage.jsp"/>
<%} else {%>
<jsp.forword page="./LoginPage.html"/>
<%} %>