package lesson4.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseCreateTables 
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
		System.out.println("Connecting to a selected database...");
		conn = DriverManager.getConnection(DB_URL + PASS);
		System.out.println("Connected database successfully...");

		// STEP 4: Execute a query
		System.out.println("Creating table in given database...");
		stmt = conn.createStatement();

		String sql = "USE TestDB "
	    		  + " CREATE TABLE Airports "
	    		  + " ( "
	    		  + " airportNumber int NOT NULL PRIMARY KEY, "
	    		  + " airport varchar(20) NOT NULL, "
	    		  + " dutyFree varchar(3) NOT NULL, "
	    		  + " priorityBoarding varchar(3) NOT NULL "
	    		  + " ) "
	    		  + " CREATE TABLE Flights "
	    		  + " ( "
	    		  + " flightNumber int NOT NULL PRIMARY KEY, "
	    		  + " airportNumber int NOT NULL FOREIGN KEY REFERENCES Airports(airportNumber), "
	    		  + " departureAirport varchar(20) NOT NULL, "
	    		  + " arrivalAirport varchar(20) NOT NULL, "
	    		  + " stopsNumber int NOT NULL, "
	    		  + " averageTicketPrice int NOT NULL, "
	    		  + " availableSeats int NOT NULL "
	    		  + " ) "
	    		  + " CREATE TABLE Airlines "
	    		  + " ( "
	    		  + " flightNumber int NOT NULL FOREIGN KEY REFERENCES Flights(flightNumber), "
	    		  + " airline varchar(30) NOT NULL, "
	    		  + " additionalSpaceService varchar(3) NOT NULL, "
	    		  + " webRegistration varchar(3) NOT NULL, "
	    		  + " isMealIncluded varchar(3) NOT NULL "
	    		  + " )"; 

		stmt.executeUpdate(sql);
		System.out.println("Created table in given database...");

		stmt.close();

		conn.close();

		System.out.println("BINGO!!!");
	}// end main
}
