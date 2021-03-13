<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% 
String mName = request.getMethod();
if(mName.equals("GET")){
%>
<html>
<body bgcolor="green" text = "blue">
<form action="JstlSqlDelete.jsp" method = "POST">

   <hr>
Enter movie number to delete:<input type ="text" name ="id"><br>
 

<input type ="submit" value = "click">
</form>
</body>
</html>
<%} else{ %>
<sql:setDataSource var="ds" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mydb"
    user="root" password="root"/>
    <sql:update var="r" dataSource="${ds}">
      delete from movies  where id =?;
    
    <sql:param value="${param.id}"></sql:param>
</sql:update>
<sql:query var="rs" dataSource="${ds }">
    select * from movies;</sql:query>
    <c:forEach var="rowValue" items="${rs.rows }">
    ${rowValue.id } ${rowValue.mname }<br></c:forEach>
<%
    }
%>