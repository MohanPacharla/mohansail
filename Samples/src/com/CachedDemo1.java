package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;

public class CachedDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			 System.out.println("connected"+con);
			 Statement st=con.createStatement();
			 ResultSet res=st.executeQuery("select * from employee");
			 CachedRowSet crs=raf.cerateCachedRowSet();
			 
		}

	}

}
