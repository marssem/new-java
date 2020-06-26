package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectorClone2 {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3306/java";
			String id = "root";
			String pwd = "1234";
			Connection conn = DriverManager.getConnection(url,id,pwd);
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("num")+",");
				System.out.print(rs.getString("name")+",");
				System.out.print(rs.getString("id"));
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
