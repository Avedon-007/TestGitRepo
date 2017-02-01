package lesson4.framework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class TestEnvironment 
{	
	public static final String DATA_FILE = "D:\\Git\\TestGitRepo\\AndyTEST\\Libs\\FrameworkForMSSQL.ini";
	private String pathToExcelFile = "";
	private String databaseDriver = "";
	private String databaseURL = "";
	private String username = ""; // For Oracle
	private String password = ""; // For Oracle
	private String databaseSecurity  = ""; // For MS SQL Server
	

	public void initialiseEnvironmentVariables() throws IOException, ClassNotFoundException
	{
		this.pathToExcelFile = getValueFromFile(DATA_FILE, "pathToExcelFile");
		this.databaseDriver = getValueFromFile(DATA_FILE, "databaseDriver");
		this.databaseURL = getValueFromFile(DATA_FILE, "databaseURL");
		//this.username  = getValueFromFile(DATA_FILE, "username");
		//this.password  = getValueFromFile(DATA_FILE, "password");
		this.databaseSecurity   = getValueFromFile(DATA_FILE, "databaseSecurity ");
System.out.println("!!!!!!");
	}

	private String getValueFromFile(String DATA_FILE, String myParam) throws IOException, ClassNotFoundException {
		String resultValue = "";
		// open file (.ini) and read row by row
		// if row starts from myParam then return the content after =
		//use subString
		
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

	public void  createEnvironment() throws ClassNotFoundException, SQLException
	{
		Database myDatabase = new Database();
		myDatabase.createStructure(databaseDriver, databaseURL, databaseSecurity );
		myDatabase.createTables(databaseDriver, databaseURL, databaseSecurity );
		myDatabase.fillData(databaseDriver, databaseURL, databaseSecurity );
	}

	public void  runTests() throws ClassNotFoundException, IOException, SQLException
	{
		Test myTest = new Test();
		//myTest.readData();
		myTest.executeTestCases(pathToExcelFile, databaseDriver, databaseURL, databaseSecurity );
		//myTest.generateReports();
	}
	
	

}
