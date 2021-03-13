<%@page import="java.sql.*" %>
<%!
    Connection con = null;
    public void jspInit(){
           try
               {
                Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan","root","root");
            System.out.println(con + " Connected Successfully");
               }
           catch(Exception e)
           {
               System.out.println(e);
           }
          
    }
%>
<%
String title=request.getParameter("title");
String Author=request.getParameter("Author");
String Category=request.getParameter("Category");
int nopages=Integer.parseInt(request.getParameter("nopages"));
try
{
    PreparedStatement pst = con.prepareStatement("insert into books(title,Author,Category,nopages)values(?,?,?,?)");
    pst.setString(1,title);
    pst.setString(2,Author);
    pst.setString(3,Category);
    pst.setInt(4,nopages);
    int res = pst.executeUpdate();
    if(res > 0)
        out.println("<h2>Insertred</h2>");
    else
        out.println("<h1>failes</h1>");
    }catch(Exception e)
    {
        System.out.println(e);
    }
%>