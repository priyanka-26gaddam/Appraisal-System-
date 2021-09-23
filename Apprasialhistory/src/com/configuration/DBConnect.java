package com.configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	 static final String driver="com.mysql.cj.jdbc.Driver";
	 static final String url="jdbc:mysql://localhost:3306/appraisalsystem";
	 static final String user="rootpassword";
	 static final String password="rootpassword";
	 
	 public static Connection getConnection()
	 {  
		 Connection con=null;
		 try {
			con=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return con;
	 }
	
	
}



