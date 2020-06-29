package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorClone3 {
	public static void main(String[] args) {
	try {
		Class.forName("org.mariadb.jdbc.driver");
		String url = "jdbc:mariadb://1227.0.0.1:3306/java";
		String id = "root";
		String pwd = "1234";
		Connection conn = DriverManager.getConnection(url,id,pwd);
		
	//	Statement stmt =  conn.Create
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	}

}
