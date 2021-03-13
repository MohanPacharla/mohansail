<%@page import = "java.sql.*,java.util.*"%>
<%!
Connection con = null;
ArrayList<String> list = null;
public void jspInit() {
    
    try {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan","root","root");
        System.out.println(con+":\n\n  connected");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select title from books");
        list = new ArrayList<String>();
        while(rs.next()) {
            list.add(rs.getString(1));
        }        
    }
    catch (Exception e) {
        System.out.println(e);
    }
    
}
%>
<html>
<head>
</head><br><br>
<body>
<form action="searchtitle.jsp">

 
    <h1>Search form</h1>
    <table border=1;>
    <tr>
    
    <td bgcolor=aqua>Select Title</td>&nbsp;&nbsp;
    <td><select name="title">
    
        <%for(String x : list) { %>
    <option><%=x %></option><%} %>
    
    </select></td>    
    
    </tr>
    <tr><td bgcolor=maroon colspan="2"><input type="submit" value="search"></td></tr>
    
    
    
    </table>

</form>

 

 
</body>
</html>