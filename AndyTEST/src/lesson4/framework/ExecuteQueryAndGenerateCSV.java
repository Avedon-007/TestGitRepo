package lesson4.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class ExecuteQueryAndGenerateCSV
{
//	static final String DATABASE_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//	static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;";
//	static final String DATABASE_NAME = "databaseName = TestDB;";
//	static final String DB_SECURITY = "integratedSecurity=true;";
	// static String query = "Use TestDB SELECT * FROM Airports";	// DEBUG
	
	public String executeSQLQuery(String databaseDriver, String databaseURL, String security, String resultOfReadCel) throws ClassNotFoundException, SQLException
	{
		ExecuteQueryAndGenerateCSV myObject = new ExecuteQueryAndGenerateCSV();		
		return myObject.resultSetToString(myObject.getResultSetFromQuery(databaseDriver, databaseURL, security, resultOfReadCel));
	}	// end of Main method
	
	private ResultSet getResultSetFromQuery(String databaseDriver, String databaseURL, String security, String query) throws ClassNotFoundException, SQLException
	{
		ResultSet result;
		Class.forName(databaseDriver);
		Connection myConn = DriverManager.getConnection(databaseURL +  security);
		Statement myStmt = myConn.createStatement();
		result = myStmt.executeQuery(query);
		return result;
	}	// end of getResultSetFromQuery()

	private String resultSetToString(ResultSet result) throws SQLException
	{
		String resultString = "";
		ResultSetMetaData rsmd = result.getMetaData();
		int columnCount = rsmd.getColumnCount();
		while (result.next())
		{
			// The column count starts from 1
			for (int i = 1; i <= columnCount; i++)			
				resultString += result.getString(rsmd.getColumnName(i)) + ";";			
		}
		return resultString;
	}	// end of ResultSetToString()
}	// end of class
