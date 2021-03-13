<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String aName = request.getMethod();
    if (aName.equals("GET")) {
%>
<html>
<body bgcolor="green" text="red">
    <form action="JstlUpdateDemo.jsp" method="POST">

         Enter Movie ID : <input type="text" name="id"><br>
        <br> Enter Movie Name : <input type="text" name="mname"><br>
        <br> <input type="submit" value="Click">
    </form>
</body>
</html>

 


<%
    } else {
%>
<sql:setDataSource var="ds" driver="com.mysql.cj.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/mydb" user="root"
    password="root" />
<sql:update var="r" dataSource="${ds}">
      insert into movies values(?,?);
    <sql:param value="${param.id}"></sql:param>
    <sql:param value="${param.mname}"></sql:param>
</sql:update>
<sql:query var="rs" dataSource="${ds}">
      select * from movies;
   </sql:query>
<c:forEach var="rowValue" items="${rs.rows}">
      ${rowValue.id} ${rowValue.mname}<br>
</c:forEach>
<%
    }
%>