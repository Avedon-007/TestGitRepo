package lesson4.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBaseCreate 
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;";
	//  Database credentials
	static final String PASS = "integratedSecurity=true;";
	   
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Connection conn = null;
		Statement stmt = null;

		// STEP 2: Register JDBC driver
		Class.forName(JDBC_DRIVER);

		// STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL + PASS);

		// STEP 4: Execute a query
		System.out.println("Creating database...");
		stmt = conn.createStatement();
	      
		String sql = "CREATE DATABASE TestDB ON " 
						+ " ( "
						+ " NAME = 'TestDB', "
						+ " FILENAME = 'E:\\йспяш\\TestClub\\Automation\\DataBase\\TestDB.mdf', "
						+ " SIZE = 5MB, "
						+ " MAXSIZE = 10MB, "
						+ " FILEGROWTH = 1MB "
						+ " ) "
						+ " LOG ON "
						+ " ( "
						+ " NAME = 'Log_TestDB', "
						+ " FILENAME = 'E:\\йспяш\\TestClub\\Automation\\DataBase\\TestDB.ldf', "
						+ " SIZE = 5MB, "
						+ " MAXSIZE = 10MB, "
						+ " FILEGROWTH = 1MB "
						+ " ) "
						+ " COLLATE Cyrillic_General_CI_AS ";
	     
		stmt.executeUpdate(sql);
		System.out.println("Database created successfully...");

		stmt.close();

		conn.close();

		System.out.println("BINGO!!!");
	}// end main
}

