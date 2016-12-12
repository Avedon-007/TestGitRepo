package lesson4;

import java.sql.*;

public class DataBaseConnection 
{
	static final String DATABASE_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;";
	static final String DATABASE_NAME = "databaseName = TestDB;";
	static final String DB_SECURITY = "integratedSecurity=true;";	
	
	
	
	
	public static void dataBaseConnAndCredentials() throws Exception 
	{
		// 1. Get a connection to database
		Class.forName(DATABASE_DRIVER); // Driver registering
		System.out.println("Driver was registered.");
		Connection myConn = DriverManager.getConnection(DATABASE_URL + DATABASE_NAME + DB_SECURITY);

		// 2. Create a statement
		// Statement myStmt = myConn.createStatement();	
			
		
		
		
	}
	
}



/*
public class DataBaseConnection 
{
	// User credentials
	static final String USERNAME = "admin";
	static final String PASSWORD = "12345";
	
	// JDBC driver name and database URL
	static final String DATABASE_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433/TestDB";	
	
		
	public static void dataBaseConnAndCredentials() throws Exception
	{	
		
			// 1. Get a connection to database
			Class.forName(DATABASE_DRIVER);  // Driver registering			
			System.out.println("Driver was registered.");
			Connection myConn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);			
			
			// 2. Create a statement
		//	Statement myStmt = myConn.createStatement();
			
		
	}
	
}
*/