package lesson4.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC 
{
	// User credentials
	static final String USERNAME = "system";
	static final String PASSWORD = "12345";
				
	// JDBC driver name and database URL
	static final String DATABASE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DATABASE_URL = "jdbc:oracle:thin:@localhost:1521:TestDB";
	//static final String DATABASE_NAME = "databaseName = TestDB;";
	//static final String DB_SECURITY = "integratedSecurity=true;";
	
	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException
	{
		// 1. Get a connection to database
		Class.forName(DATABASE_DRIVER); // Driver registering
		System.out.println("Driver was registered.");

		System.out.println("Connecting to a selected database...");
		 //Connection myConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:TestDB","system","12345");		
		Connection myConn = DriverManager.getConnection(DATABASE_URL , USERNAME , PASSWORD);
		System.out.println("Connected database successfully...");
		
		// 2. Create a statement
		Statement myStmt = myConn.createStatement();

		// 3. Execute SQL query
		System.out.println("Inserting records into the table...");
		String sql = "INSERT INTO AIRPORTS(airportNumber, airport, dutyFree, priorityBoarding) VALUES(4, 'Berlin', 'yes', 'no')";		
		myStmt.executeUpdate(sql);
	     System.out.println("Insert comleted...");

		// 4. Process the result set
		
		
		myStmt.close();
		myConn.close();

	}

}
