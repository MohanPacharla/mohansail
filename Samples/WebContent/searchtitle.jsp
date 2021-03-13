   
<%@page import="java.sql.*"%>
<%!Connection con = null;


    public void jspInit() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan", "root", "root");
            System.out.println(con + " Connected Successfully");


        } catch (Exception e) {
            System.out.println(e);
        }
    }%>
<%
    String title = request.getParameter("title");
    try {
        PreparedStatement pst = con.prepareStatement("select * from books where title=?");
        pst.setString(1, title);
        ResultSet res = pst.executeQuery();
%>
<table bgcolor=aqua border=1 width="60%">
    <%
        out.println(
                    "<tr><td bgcolor=teal>ID</td><td bgcolor=red>TITLE</td><td bgcolor=maroon>AUTHOR</td><td bgcolor=yellow>NOPAGES</td></tr>");
    %>
    <%
        while (res.next()) {
    %>
    <tr>
        <td><%=res.getInt(1)%>
        <td><%=res.getString(2)%></td>
        <td><%=res.getString(3)%></td>
        <td><%=res.getString(5)%></td>
    </tr>
    <%
        }
    %>
</table>
<%
    } catch (Exception e) {
        e.printStackTrace();
        // TODO: handle exception
    }
%>


