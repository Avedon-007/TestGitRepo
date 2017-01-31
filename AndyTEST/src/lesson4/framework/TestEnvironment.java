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
	private String PASS = "";
	

	public void initialiseEnvironmentVariables() throws IOException
	{
		this.pathToExcelFile = getValueFromFile(DATA_FILE, "pathToExcelFile");
		this.databaseDriver = getValueFromFile(DATA_FILE, databaseDriver);
		this.databaseURL = getValueFromFile(DATA_FILE, "databaseURL");
		this.username  = getValueFromFile(DATA_FILE, "username");
		this.password  = getValueFromFile(DATA_FILE, "password");
	}

	private String getValueFromFile(String dataFile, String myParam) throws IOException {
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
		}
		 br.close();

		return resultValue;
	}

	public void  createEnvironment() throws ClassNotFoundException, SQLException
	{
		Database myDatabase = new Database();
		myDatabase.createStructure(databaseDriver, databaseURL, PASS);
		myDatabase.createTables(databaseDriver, databaseURL, PASS);
		myDatabase.fillData(databaseDriver, databaseURL, PASS);
	}

	public void  runTests()
	{
		Test myTest = new Test();
		myTest.readData();
		myTest.executeTestCases();
		myTest.generateReports();
	}
	
	

}
