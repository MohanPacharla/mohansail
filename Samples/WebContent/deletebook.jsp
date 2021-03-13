 <%@page import = "java.sql.*,java.util.*"%>
<%!
Connection con = null;
ArrayList<String> list = null;
public void jspInit() {
   
    try {
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan","root","root");
        System.out.println(con+":\n\n  connected");   
    }
    catch (Exception e) {
        System.out.println(e);
    }
   
}
%>
<html>
<head>
</head>
<body>
<%
String id  = request.getParameter("id");
try
{
    PreparedStatement pst = con.prepareStatement("delete from books where id=?");
    pst.setString(1,id);
    int res = pst.executeUpdate();
    if(res > 0)
        out.println("<h2>deleted</h2>");
    else
        out.println("<h1>failed</h1>");
      response.sendRedirect("homebook.jsp");
    }catch(Exception e)
    {
        System.out.println(e);
    }
%>
 