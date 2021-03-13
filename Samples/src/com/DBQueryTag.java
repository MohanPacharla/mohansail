package com;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

 

import com.mysql.cj.jdbc.result.ResultSetMetaData;

 

public class DBQueryTag extends TagSupport {
    String driver,url,user,pass,query;
    
    public void setDriver(String driver) {
        this.driver = driver;
    }

 

    public void setUrl(String url) {
        this.url = url;
    }

 

    public void setUser(String user) {
        this.user = user;
    }

 

    public void setPass(String pass) {
        this.pass = pass;
    }

 
    public void setQuery(String query) {
        this.query = query;
    }
    public int doStratTag() {
        System.out.println("doStartTag()");
        try {
            JspWriter out = pageContext.getOut();
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
        ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
        int colCount=rsmd.getColumnCount();
        out.println("<html><body><table border=1>");
        
        while(rs.next()) {
            out.println("<tr>");
            for(int i=1;i<=colCount;i++) {
                out.println("<td>");
                out.println(rs.getString(i));
                out.println("</td>");
            }out.println("<tr>");
        }
        out.println("</table></body></html>");
        out.close();
        }catch (Exception e) {
            System.out.println(e);
        }
        
        
        return SKIP_BODY;
        
    }
    
}
 
 



