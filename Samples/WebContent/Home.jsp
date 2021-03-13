<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=US-ASCII">
<title>Home Page</title>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<style>
table,th,td
{
border:1px solid black;
}
</style>
</head>
<body>
<%-- Using JSTL forEach and out to loop a list and display items in table --%>
<table>
<tbody>
<tr><th>ID</th><th>Name</th><th>Salary</th></tr>
    <c:forEach items="${requestScope.empList}" var="emp">
        <tr><td><c:out value="${emp.getEmpNo()}"></c:out></td>
        <td><c:out value="${emp.getEmpName()}"></c:out></td>
        <td><c:out value="${emp.getSalary()}"></c:out></td></tr>
    </c:forEach>
</tbody>
</table>
    <a href='<c:url value="${requestScope.url}"></c:url>'>Google</a>
</body>
</html>