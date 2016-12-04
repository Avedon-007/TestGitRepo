package lesson4;
import java.sql.*;





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
			
			
			
			
			/*
			TestCollection test001 = new TestCollection();
			List<String> sql = test001.getCol4();
			//StringBuilder sql = new StringBuilder();
			for(String s : test001.getCol4())
			{
				sql.append(s);
				//sql.append("\t");
			
			}
			myStmt.executeLargeUpdate(test001.getCol4());
			System.out.println(sql);
			
			//myStmt.executeUpdate(sql);
			 System.out.println("Insert complete."); 
			*/
			
			
			
			
			/*
			TestCollection test001 = new TestCollection();
			test001.insertIntoAirports();
			Collection<String> col = insertIntoAirports();
			*/
			
			
			
			// 4. Process the result set
			
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
	}
}










/*
String sql = "USE TestDB" + " "  
		+ "insert into Airports" 
		+ "(airportNumber, airport, dutyFree, priorityBoarding)" 
		+ "values (1, 'London', 'yes', 'yes'),"
		+ "(2, 'Paris', 'yes', 'yes'),"
		+ "(3, 'Sydney', 'no', 'no') ";
*/