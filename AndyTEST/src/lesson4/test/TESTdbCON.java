package lesson4.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TESTdbCON
{
	public static final String DATA_FILE = "D:\\Git\\TestGitRepo\\AndyTEST\\Libs\\FrameworkForMSSQL.ini";
	private static String pathToExcelFile = "";
	static  String databaseDriver = "";  
	static  String databaseURL = "";
	//  Database credentials
	static  String security = "";
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{
		TESTdbCON myInst = new TESTdbCON();
		myInst.initialiseEnvironmentVariables();
		System.out.println(pathToExcelFile);
		System.out.println(databaseDriver);
		System.out.println(databaseURL);		
		System.out.println(security);
		myInst.creataDB(databaseDriver, databaseURL, security);

	}

	public void creataDB(String databaseDriver, String databaseURL, String security) throws ClassNotFoundException, SQLException
	{
		Connection conn = null;
		Statement stmt = null;		

		// Register JDBC driver
		Class.forName(databaseDriver);

		// Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(databaseURL + security);

		//  Execute a query
		System.out.println("Creating database...");
		stmt = conn.createStatement();
	      
		String sql = "CREATE DATABASE TestDB";			
					
		stmt.executeUpdate(sql);
		System.out.println("Database created successfully...BINGO!!!");
		stmt.close();
		conn.close();	
	}
	
	public void initialiseEnvironmentVariables() throws IOException, ClassNotFoundException
	{
		this.pathToExcelFile = getValueFromFile(DATA_FILE, "pathToExcelFile");
		this.databaseDriver = getValueFromFile(DATA_FILE, "databaseDriver");
		this.databaseURL = getValueFromFile(DATA_FILE, "databaseURL");		
		this.security   = getValueFromFile(DATA_FILE, "databaseSecurity");

	}

	private String getValueFromFile(String DATA_FILE, String myParam) throws IOException, ClassNotFoundException {
		String resultValue = "";	
		
		// Specify path to your file
		File file = new File(DATA_FILE);

		// Create special input stream for reading data
		FileInputStream fis = new FileInputStream(file);

		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		// Get all existing lines from file to the String	
		String line = "";
		while ((line = br.readLine()) != null)
		{
			String bufferArray[] = line.split(" ");	//раздел€ю строку на масив из слов			
			
			if(bufferArray[0].equalsIgnoreCase(myParam) )
			{
				resultValue = line.substring(line.indexOf("=")+2);	// read part of string beginning after "=" . 2  means that the "=" + "space"				
				break;
			}			
		}
		 br.close();

		return resultValue;
	}
	
	
}
