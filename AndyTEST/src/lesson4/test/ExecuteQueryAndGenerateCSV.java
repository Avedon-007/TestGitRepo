package lesson4.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQueryAndGenerateCSV {

	static final String DATABASE_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;";
	static final String DATABASE_NAME = "databaseName = TestDB;";
	static final String DB_SECURITY = "integratedSecurity=true;";
	static String query = "Use TestDB SELECT * FROM Airports";
	
	//public static void main(String[] args) throws Exception, SQLException // DEBUG
	public String executeSQLQuery(String resultOfReadCel) throws ClassNotFoundException, SQLException
	{
		ExecuteQueryAndGenerateCSV myObject = new ExecuteQueryAndGenerateCSV();
		//System.out.println(myObject.ResultSetToString(myObject.getResultSetFromQuery(query)));
		return  myObject.ResultSetToString(myObject.getResultSetFromQuery(resultOfReadCel));
	}
	
	private ResultSet getResultSetFromQuery(String query) throws ClassNotFoundException, SQLException
	{
		ResultSet result;
		Class.forName(DATABASE_DRIVER);
		Connection myConn = DriverManager.getConnection(DATABASE_URL + DATABASE_NAME + DB_SECURITY);
		Statement myStmt = myConn.createStatement();
		result = myStmt.executeQuery(query);
		return result;		
	}
	private String ResultSetToString(ResultSet result) throws SQLException 
	{
		String resultString = "";
		
		ResultSetMetaData rsmd = result.getMetaData();
		int columnCount = rsmd.getColumnCount();
		while(result.next())
		{
		// The column count starts from 1
			for (int i = 1; i <= columnCount; i++ ) {
		 
				resultString += result.getString(rsmd.getColumnName(i)) + ";";
		  
			}
		}
		
		
		return resultString;
	}
}


/*
public class ExecuteQueryAndGenerateCSV {

static final String DATABASE_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;";
static final String DATABASE_NAME = "databaseName = TestDB;";
static final String DB_SECURITY = "integratedSecurity=true;";
static String query = "Use TestDB SELECT * FROM Airports";

public static void main(String[] args) throws Exception, SQLException 
{
	ExecuteQueryAndGenerateCSV myObject = new ExecuteQueryAndGenerateCSV();
	System.out.println(myObject.ResultSetToString(myObject.getResultSetFromQuery(query)));

}

private ResultSet getResultSetFromQuery(String query) throws ClassNotFoundException, SQLException
{
	ResultSet result;
	Class.forName(DATABASE_DRIVER);
	Connection myConn = DriverManager.getConnection(DATABASE_URL + DATABASE_NAME + DB_SECURITY);
	Statement myStmt = myConn.createStatement();
	result = myStmt.executeQuery(query);
	return result;		
}
private String ResultSetToString(ResultSet result) throws SQLException 
{
	String resultString = "";
	
	ResultSetMetaData rsmd = result.getMetaData();
	int columnCount = rsmd.getColumnCount();
	while(result.next())
	{
	// The column count starts from 1
		for (int i = 1; i <= columnCount; i++ ) {
	 
			resultString += result.getString(rsmd.getColumnName(i)) + ";";
	  
		}
	}
	
	
	return resultString;
}
}

*/