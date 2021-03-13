<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=gray>
<%@ include file="header.jsp" %>
<h2>Add book</h2>
<form action="insertbook.jsp">
Title<br>
<input type=text name=title size=50/>
<p></p>
Author</br>
<input type=text name=Author size=50/>
<p></p>
 category</br>
 <select name=Category>
 <option value ="n">Non Fiction</option>
 <option value ="f">Fiction</option>
 <option value="t">Text Book</option>
 </select>
 </br>
 No.of pages</br>
 <input type =text name=nopages size=50/>
 <p></p>
 <input type=submit value=addbook> </form>

</body>
</html>