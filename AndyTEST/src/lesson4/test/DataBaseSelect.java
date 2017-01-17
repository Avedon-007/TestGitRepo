package lesson4.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseSelect 
{
			// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
		static final String DB_URL = "jdbc:sqlserver://localhost:1433;";
			//  Database credentials
		static final String PASS = "integratedSecurity=true;";
	   
	public String selectFromDataBase() throws IOException, SQLException, ClassNotFoundException
		{
		   String sqlResult = "";
			Connection conn = null;
		   Statement stmt = null;
		   
		      //STEP 2: Register JDBC driver
			   Class.forName(JDBC_DRIVER);

		      //STEP 3: Open a connection
		 //     System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL + PASS);
		 //     System.out.println("Connected database successfully...");
	      
		      //STEP 4: Execute a query
		 //     System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      // String sql = "USE TestDB SELECT * FROM Airports";
		      // ResultSet rs = stmt.executeQuery(sql);	     
	     
		    ExcelReadCell readCell = new ExcelReadCell();
		    ResultSet rs = stmt.executeQuery(readCell.readFromExcel());	      
	      
		     // ExcelReadCells readCell = new ExcelReadCells();
		     // ResultSet rs = stmt.executeQuery(readCell.readCellsFromExcel());
		      
		      1. resultSet to ArrayList
		      2. column names read from arrayList (Retrieve column names from java.sql.ResultSet)
		      
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		    	  //Retrieve by column name
		    	  //int airportNumber  = rs.getInt("airportNumber");
		    	  String flightNumber = rs.getString("flightNumber");
		    	 // String dutyFree = rs.getString("dutyFree");
		    	  //String priorityBoarding = rs.getString("priorityBoarding");
		    	  sqlResult = flightNumber + ";";
		    	  //Display values
		    	 // System.out.print(airportNumber + ";");
		    	  //System.out.print(flightNumber + ";");
		    	 // System.out.print(dutyFree + ";");
		    	 // System.out.println(priorityBoarding + ";");
		      }
		      rs.close();
	 
	return sqlResult;
//	  System.out.println("BINGO!!!");	//DEBUG
	}
}



/*
public class DataBaseSelect 
{
			// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
		static final String DB_URL = "jdbc:sqlserver://localhost:1433;";
			//  Database credentials
		static final String PASS = "integratedSecurity=true;";
	   
		public static void main(String[] args)
		{
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
			   Class.forName(JDBC_DRIVER);

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL + PASS);
		      System.out.println("Connected database successfully...");
	      
		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      // String sql = "USE TestDB SELECT * FROM Airports";
		      // ResultSet rs = stmt.executeQuery(sql);	     
	     
		    ExcelReadCell readCell = new ExcelReadCell();
		    ResultSet rs = stmt.executeQuery(readCell.readFromExcel());	      
	      
		     // ExcelReadCells readCell = new ExcelReadCells();
		     // ResultSet rs = stmt.executeQuery(readCell.readCellsFromExcel());
		      
		      
		      
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		    	  //Retrieve by column name
		    	  //int airportNumber  = rs.getInt("airportNumber");
		    	  String flightNumber = rs.getString("flightNumber");
		    	 // String dutyFree = rs.getString("dutyFree");
		    	  //String priorityBoarding = rs.getString("priorityBoarding");

		    	  //Display values
		    	 // System.out.print(airportNumber + ";");
		    	  System.out.print(flightNumber + ";");
		    	 // System.out.print(dutyFree + ";");
		    	 // System.out.println(priorityBoarding + ";");
		      }
		      rs.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   //System.out.println("BINGO!!!");	//DEBUG
	}//end main
}
*/