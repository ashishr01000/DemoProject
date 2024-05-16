package com.example.testsonar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:sqlserver://localhost:1434;databaseName=sonar;encrypt=False;trustServerCertificate=True"; // table
																														// details
		String username = "yugabdh";
		String password = "password";
//		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println(con.isClosed());
		con.close();
		
	}
}
