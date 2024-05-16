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
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/interview_system", "root",
		"toor")) {

	Statement stmt = con.createStatement();

	String query = "SELECT email FROM candidate WHERE email='" + email + "'";

	System.out.println(query);

	ResultSet result = stmt.executeQuery(query);

	while (result.next()) {

		emailPlaceHolder = result.getString(1);
	}

} catch (SQLException e) {

	e.printStackTrace();

}
		
	}
}
