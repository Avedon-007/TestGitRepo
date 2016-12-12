package lesson4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteSQL {

	public static void main(String[] args) {
		// 1. Get a connection to database
		DataBaseConnection connectionBD = new DataBaseConnection();
		connectionBD.dataBaseConnAndCredentials();
		
	
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
