<%@page import="java.sql.*,java.util.*"%>
<%!Connection con = null;
    ArrayList<String> list = null;
  public void jspInit() {

 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan", "root", "root");
            System.out.println(con + ":\n\n  connected");
        } catch (Exception e) {
            System.out.println(e);
        }


    }%>
<html>
<head>

</head><br><br>
<body>
    <%
        try {
            PreparedStatement pst = con.prepareStatement("select * from books");
            ResultSet res = pst.executeQuery();
    %>
    <table bgcolor=aqua border=1 width="60%">
        <%
            out.println(
                        "<tr><td bgcolor=teal>ID</td><td bgcolor=lime>TITLE</td><td bgcolor=maroon>AUTHOR</td><td bgcolor=fuchasia>CATEGOERY</td><td bgcolor=yellow>NOPAGES</td></tr>");
        %>
        <%
            while (res.next()) {
        %>
        <tr>
            <td><%=res.getInt(1)%>
            <td><%=res.getString(2)%></td>
            <td><%=res.getString(3)%></td>
            <td><%=res.getString(4)%></td>
            <td><%=res.getInt(5)%></td>
            <td><a href="deletebook.jsp?id=<%=res.getString("id")%>"><button>Delete</button></a></td>
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