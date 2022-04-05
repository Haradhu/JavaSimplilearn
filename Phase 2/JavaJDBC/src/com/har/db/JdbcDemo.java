package com.har.db;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		// step1 Register Driver

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// step2 Get DB Connection

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardb", "root", "root");

			// step3 create any one statement 1. Statement 2. PreparedStatement 3.
			// CallableStatement

			Statement stmt = conn.createStatement(); // use statement for static queries

			String query =
			  "insert into  details values(104,'Fanta',current_date)"; 
			int count = stmt.executeUpdate(query);// step 4
			 
			// step5
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

