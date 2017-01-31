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
	private String username = "";
	private String password = "";
	private String security = ""; // For MS SQL Server
	

	public void initialiseEnvironmentVariables() throws IOException
	{
		this.pathToExcelFile = getValueFromFile(DATA_FILE, "pathToExcelFile");
		this.databaseDriver = getValueFromFile(DATA_FILE, "databaseDriver");
		this.databaseURL = getValueFromFile(DATA_FILE, "databaseURL");
		this.username  = getValueFromFile(DATA_FILE, "username");
		this.password  = getValueFromFile(DATA_FILE, "password");
		this.security  = getValueFromFile(DATA_FILE, "security");

	}

	private String getValueFromFile(String DATA_FILE, String myParam) throws IOException {
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
			resultValue += line + "\n";
			
			
			if(myParam.equalsIgnoreCase("pathToExcelFile") )
			{
				
			}
			else if(myParam.equalsIgnoreCase("databaseDriver") )
			{
				
			}
			else if(myParam.equalsIgnoreCase("databaseURL") )
			{
				
			}
			else if(myParam.equalsIgnoreCase("security") )
			{
				
			}
			
			
		}
		 br.close();

		return resultValue;
	}

	public void  createEnvironment() throws ClassNotFoundException, SQLException
	{
		Database myDatabase = new Database();
		myDatabase.createStructure(databaseDriver, databaseURL, security);
		myDatabase.createTables(databaseDriver, databaseURL, security);
		myDatabase.fillData(databaseDriver, databaseURL, security);
	}

	public void  runTests(String pathToExcelFile, String databaseDriver, String databaseURL, String security) throws ClassNotFoundException, IOException, SQLException
	{
		Test myTest = new Test();
		myTest.readData();
		myTest.executeTestCases(pathToExcelFile, databaseDriver, databaseURL, security);
		myTest.generateReports();
	}
	
	

}
