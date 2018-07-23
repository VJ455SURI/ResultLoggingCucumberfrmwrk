package com.cucumber.dblogging.ResultLogging.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnections {
	

	public static void InsertToDB(String testname, String testclass, String teststatus) {
		try {
			// create a mysql Database connection
			String myUrl = "jdbc:postgresql://localhost:5432/TestPoject";
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(myUrl, "postgres", "@Postgress123");
			System.out.println("in insert method");
			// the mysql insert statement
			String query = " Insert into testresults values(?,?,?)";
			
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, testname);
			preparedStmt.setString(2, testclass);
			preparedStmt.setString(3, teststatus);
					
			// execute the preparedstatement
			preparedStmt.execute();
			
			conn.close();
		} catch (Exception e) {
			System.out.println("Got an exception!");
			System.out.println(e.getMessage());
		}
	}

	

}
