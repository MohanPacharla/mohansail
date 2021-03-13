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
<form action="JstlFirst.jsp" method="post">
     <h1 style=background-color:green;color:white;padding:30px;text-align:center border-radius:39px;">
     Login IN</h1>
     <table align=center cellpadding = 20px border = 1>
         <tr><td>Enter First name: </td><td><input type="text" name=Name></td></tr>
         <tr><td>Enter password: </td><td><input type="text" name=Password></td></tr>
          <tr><td colspan="2" align=center><input type="submit" value=validate></td></tr>
     </table>
    
</form>
</body>
</html>
<%}
    else {%>
<c:set var ="str" value ="${param.Name}" />
<c:set var ="str1" value ="${param.Password}" />

 

User name : <h1 style=color:red>${str}</h1>
Password  :<h1 style=color:red> <c:out value="${str1}"></c:out></h1>
<%}%>