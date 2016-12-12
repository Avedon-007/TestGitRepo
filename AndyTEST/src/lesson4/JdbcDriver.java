package lesson4;

import java.sql.*;


public class JdbcDriver 
{	
	// User credentials
	//static final String USERNAME = "admin";
	//static final String PASSWORD = "12345";
			
	// JDBC driver name and database URL
	static final String DATABASE_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;";
	static final String DATABASE_NAME = "databaseName = TestDB;";
	static final String DB_SECURITY = "integratedSecurity=true;";
	
	public static void main(String[] args) throws Exception
	{			
		
			// 1. Get a connection to database
			Class.forName(DATABASE_DRIVER);  // Driver registering		
			System.out.println("Driver was registered.");
			
			//Connection myConn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		Connection myConn = DriverManager.getConnection(DATABASE_URL + DATABASE_NAME + DB_SECURITY);
			// 2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			// 3. Execute SQL query					
			String sql = "SELECT airport FROM Airports WHERE airportNumber = 2;";
			ResultSet result = myStmt.executeQuery(sql);			
			System.out.println("Query executed!!!");   			
			
			// 4. Process the result set
			while(result.next())
			{				
				System.out.print(result.getString("airport") + ";");				
			}
			result.close();
			myStmt.close();
			myConn.close();		
	}
}


/*

public class JdbcDriver 
{	
	public static void main(String[] args)
	{		
		try
		{
			// 1. Get a connection to database
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // Driver registering			
			System.out.println("Driver was registered.");
			//Connection myConn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; databaseName = TestDB; user = admin; password = 12345");
			Connection myConn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; databaseName = TestDB;integratedSecurity=true;");
			System.out.println("Connection established.");			
			
			// 2. Create a statement
			Statement myStmt = myConn.createStatement();		
			
			// 3. Execute SQL query					
			String sql = "USE TestDB" + " "
					 + "INSERT INTO Airports" + "(airportNumber, airport, dutyFree, priorityBoarding)"
					 + "VALUES"
					 + "(1, 'London', 'yes', 'yes'),"
					 + "(2, 'Paris', 'yes', 'yes'),"
					 + "(3, 'Sydney', 'no', 'no'),"
					 + "(4, 'Berlin', 'yes', 'no'),"
					 + "(5, 'Munich', 'yes', 'no'),"
					 + "(6, 'New-York', 'no', 'no'),"
					 + "(7, 'Kiev', 'yes', 'yes'),"
					 + "(8, 'Budapest', 'yes', 'no'),"
					 + "(9, 'Beijing', 'no', 'yes'),"
					 + "(10, 'Prague', 'yes', 'yes'),"
					 + "(11, 'Helsinki', 'no', 'no'),"
					 + "(12, 'Ottava', 'no', 'no'),"
					 + "(13, 'Vilnius', 'yes', 'yes'),"
					 + "(14, 'Milan', 'yes', 'yes'),"
					 + "(15, 'Barcelona', 'yes', 'no')";
					
			myStmt.executeUpdate(sql);
			System.out.println("Insert complete.");   		
			
			
			// 4. Process the result set
		
			
			// 4. Process the result set
			while(result.next())
			{// Separate columns for every result
				int	airportNumber = result.getInt("airportNumber");
				String airport = result.getString("airport");
				String dutyFree = result.getString("dutyFree");
				String priorityBoarding = result.getString("priorityBoarding");
				System.out.print("airportNumber: " + airportNumber);
				System.out.print(", airport: " + airport);
				System.out.print(", dutyFree: " + dutyFree);
				System.out.println(", priorityBoarding: " + priorityBoarding);
			}
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
	}
}

*/