<%@ taglib uri="http://hello.com" prefix="db" %>
<db:mohan
driver="com.mysql.cj.jdbc.Driver"
url="jdbc.mysql://localhost:3306/mohan"
user = "root"
pass = "root"
query='<%=request.getParameter("sql") %>'/>
 