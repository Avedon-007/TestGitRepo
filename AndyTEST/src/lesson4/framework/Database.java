package lesson4.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Database
{
	private String databaseDriver;
	private String databaseURL;
	private String security;
	private  String username;
	private  String password;
	
	
	
	public Database(String databaseDriver, String databaseURL, String security, String username, String password)
	{
		this.databaseDriver = databaseDriver;
		this.databaseURL = databaseURL;
		this.security = security;
		this.username = username;
		this.password = password;
	}
	
	
	
	
//	protected void createStructure() throws ClassNotFoundException, SQLException
//	{		
//		Connection conn = null;
//		Statement stmt = null;		
//
//		// Register JDBC driver
//		Class.forName(databaseDriver);
//
//		// Open a connection
//		System.out.println("Connecting to database...");
//		conn = DriverManager.getConnection(databaseURL + username + password);
//
//		//  Execute a query
//		System.out.println("Creating database...");
//		stmt = conn.createStatement();
//	      
//		//String sql = "CREATE DATABASE TestDB";			
//					
////		stmt.executeUpdate(sql);
////		System.out.println("Database created successfully...BINGO!!!");
////		stmt.close();
////		conn.close();		
//	}
	
	protected void createTables() throws ClassNotFoundException, SQLException
	{
		Connection conn = null;
		Statement stmt = null;

		// Register JDBC driver
		Class.forName(databaseDriver);

		// Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(databaseURL, username, password);

		//  Execute a query
		System.out.println("Creating Tables...");
		stmt = conn.createStatement();
	    /////////// SQL query read form file  
		String sql = 
	    		   " CREATE TABLE Airports "
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
		System.out.println("Tables were created successfully...BINGO!!!");
		stmt.close();
		conn.close();	
	}
		
	protected void fillData() throws ClassNotFoundException, SQLException
	{
		Connection conn = null;
		Statement stmt = null;

		// Register JDBC driver
		Class.forName(databaseDriver);

		// Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(databaseURL, username, password);

		//  Execute a query
		System.out.println("Filling the Tables of database...");
		stmt = conn.createStatement();
/////////// SQL query read form file 
		
		
		
		
		String sql = 
				   " INSERT INTO Airports "
	    		  + " (airportNumber, airport, dutyFree, priorityBoarding) "
	    		  + " VALUES "
	    		  + " (1, 'London', 'yes', 'yes'), "
	    		  + " (2, 'Paris', 'yes', 'yes'), "
	    		  + " (3, 'Sydney', 'no', 'no'), "
	    		  + " (4, 'Berlin', 'yes', 'no'), "
	    		  + " (5, 'Munich', 'yes', 'no'), "
	    		  + " (6, 'New York', 'no', 'no'), "
	    		  + " (7, 'Kiev', 'yes', 'yes'), "
	    		  + " (8, 'Budapest', 'yes', 'no'), "
	    		  + " (9, 'Beijing', 'no', 'yes'), "
	    		  + " (10, 'Prague', 'yes', 'yes'), "
	    		  + " (11, 'Helsinki', 'no', 'no'), "
	    		  + " (12, 'Ottava', 'no', 'no'), "
	    		  + " (13, 'Vilnius', 'yes', 'yes'), "
	    		  + " (14, 'Milan', 'yes', 'yes'), "
	    		  + " (15, 'Barcelona', 'yes', 'no') "
	    		  + " INSERT INTO Flights "
	    		  + " (flightNumber, airportNumber, departureAirport, arrivalAirport, stopsNumber, averageTicketPrice, availableSeats) "
	    		  + " VALUES "
	    		  + " (1001, 1, 'London', 'Munich', 0, 90, 12), "
	    		  + " (1002, 1, 'London', 'New York', 1, 300, 0), "
	    		  + " (1003, 1, 'London', 'Ottava', 1, 290, 2), "
	    		  + " (1004, 1, 'London', 'Milan', 0, 45, 33), "
	    		  + " (1005, 6, 'New York', 'Sydney', 2, 681, 17), "
	    		  + " (1006, 6, 'New York', 'Kiev', 1, 220, 80), "
	    		  + " (1007, 6, 'New York', 'Milan', 1, 440, 1), "
	    		  + " (1008, 6, 'New York', 'Barcelona', 0, 375, 14), "
	    		  + " (1009, 6, 'New York', 'Prague', 1, 410, 21), "
	    		  + " (1010, 6, 'New York', 'Helsinki', 1, 200, 5), "
	    		  + " (1011, 8, 'Budapest', 'London', 0, 15, 47), "
	    		  + " (1012, 8, 'Budapest', 'Kiev', 0, 39, 0), "
	    		  + " (1013, 8, 'Budapest', 'Vilnius', 0, 50, 11), "
	    		  + " (1014, 9, 'Beijing', 'Helsinki', 2, 190, 33), "
	    		  + " (1015, 9, 'Beijing', 'Barcelona', 1, 149, 13), "
	    		  + " (1016, 3, 'Sydney', 'Berlin', 1, 800, 13), "
	    		  + " (1017, 3, 'Sydney', 'Munich', 1, 1200, 13), "
	    		  + " (1018, 3, 'Sydney', 'Milan', 1, 1000, 9), "
	    		  + " (1019, 2, 'Paris', 'Ottava', 1, 999, 2), "
	    		  + " (1020, 2, 'Paris', 'Vilnius', 0, 67, 3), "
	    		  + " (1021, 2, 'Paris', 'Helsinki', 0, 95, 10), "
	    		  + " (1022, 2, 'Paris', 'New York', 0, 212, 10), "
	    		  + " (1023, 7, 'Kiev', 'New York', 2, 220, 25), "
	    		  + " (1024, 7, 'Kiev', 'Milan', 0, 99, 8), "
	    		  + " (1025, 5, 'Munich', 'London', 0, 15, 0), "
	    		  + " (1026, 12, 'Ottava', 'Vilnius', 1, 333, 0), "
	    		  + " (1027, 12, 'Ottava', 'Milan', 1, 310, 1), "
	    		  + " (1028, 12, 'Ottava', 'Barcelona', 1, 310, 4), "
	    		  + " (1029, 4, 'Berlin', 'Kiev', 0, 87, 7), "
	    		  + " (1030, 10, 'Prague', 'Helsinki', 1, 87, 23), "
	    		  + " (1031, 15, 'Barcelona', 'Ottava', 1, 310, 6), "
	    		  + " (1032, 11, 'Helsinki', 'Budapest', 0, 94, 8), "
	    		  + " (1033, 14, 'Milan', 'Beijing', 2, 190, 0), "
	    		  + " (1034, 14, 'Milan', 'Sydney', 2, 725, 2), "
	    		  + " (1035, 13, 'Vilnius', 'Munich', 0, 41, 100) "
	    		  + " INSERT INTO Airlines "
	    		  + " (flightNumber, airline, additionalSpaceService, webRegistration, isMealincluded) "
	    		  + " VALUES "
	    		  + " (1001, 'WizzAir', 'yes', 'no', 'no'), "
	    		  + " (1002, 'WizzAir', 'no', 'no', 'no'), "
	    		  + " (1003, 'Lufthansa', 'no', 'yes', 'no'), "
	    		  + " (1004, 'Lufthansa', 'yes', 'yes', 'yes'), "
	    		  + " (1005, 'Lufthansa', 'no', 'no', 'yes'), "
	    		  + " (1006, 'Lufthansa', 'yes', 'no', 'yes'), "
	    		  + " (1007, 'Windrose Aero', 'yes', 'no', 'yes'), "
	    		  + " (1008, 'Windrose Aero', 'yes', 'no', 'yes'), "
	    		  + " (1009, 'WizzAir', 'no', 'no', 'no'), "
	    		  + " (1010, 'Cathay Pacific', 'no', 'yes', 'yes'), "
	    		  + " (1011, 'Cathay Pacific', 'yes', 'yes', 'no'), "
	    		  + " (1012, 'Austrian Airlines', 'no', 'yes', 'yes'), "
	    		  + " (1013, 'AirAsia', 'no', 'yes', 'yes'), "
	    		  + " (1014, 'Virgin', 'no', 'yes', 'yes'), "
	    		  + " (1015, 'Virgin', 'yes', 'no', 'no'), "
	    		  + " (1016, 'Virgin', 'yes', 'yes', 'no'), "
	    		  + " (1017, 'AirAsia', 'no', 'no', 'no'), "
	    		  + " (1018, 'Emirates', 'yes', 'yes', 'yes'), "
	    		  + " (1019, 'Ryanair', 'no', 'no', 'no'), "
	    		  + " (1020, 'AirAsia', 'yes', 'no', 'yes'), "
	    		  + " (1021, 'Windrose Aero', 'no', 'no', 'no'), "
	    		  + " (1022, 'WizzAir', 'no', 'no', 'no'), "
	    		  + " (1023, 'AirAsia', 'yes', 'yes', 'yes'), "
	    		  + " (1024, 'AirAsia', 'no', 'no', 'no'), "
	    		  + " (1025, 'Emirates', 'yes', 'yes', 'yes'), "
	    		  + " (1026, 'WizzAir', 'yes', 'no', 'yes'), "
	    		  + " (1027, 'Emirates', 'no', 'yes', 'no'), "
	    		  + " (1028, 'Austrian Airlines', 'no', 'no', 'no'), "
	    		  + " (1029, 'Turkish Airlines', 'yes', 'yes', 'yes'), "
	    		  + " (1030, 'Air France', 'yes', 'no', 'no'), "
	    		  + " (1031, 'Air France', 'yes', 'no', 'yes'), "
	    		  + " (1032, 'Air France', 'yes', 'yes', 'no'), "
	    		  + " (1033, 'Air France', 'no', 'yes', 'no'), "
	    		  + " (1034, 'WizzAir', 'no', 'yes', 'yes'), "
	    		  + " (1035, 'Ryanair', 'no', 'yes', 'no')";		
		System.out.println(sql);			
		stmt.executeUpdate(sql);
		
		System.out.println("Tables were filled successfully...BINGO!!!");
		stmt.close();
		conn.close();	
	}
}
