<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%String methodName = request.getMethod();
if(methodName.equals("GET")) {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="JstlIfcondition.jsp" method="post">
     <h1 style=background-color:green;color:white;padding:30px;text-align:center border-radius:39px;">
     Login IN</h1>
     <table align=center cellpadding = 20px border = 1>
         <tr><td>Enter your Salary: </td><td><input type="text" name=Salary></td></tr>
        
          <tr><td colspan="2" align=center><input type="submit" value=validate></td></tr>
     </table>
    
</form>
</body>
</html>
<%}
    else {%>
<c:set var ="Salary" value ="${param.Salary}" />
<c:choose> 
<c:when test="${Salary>=20000}">
  <h3>Salary is Good</h3>
  </c:when>
  
  <c:when test="${Salary>=10000 }">
   <h3>Salary is Okey</h3>
  </c:when>
  <c:otherwise>
  <h3>No Comments</h3></c:otherwise>
  </c:choose>



<%}%>