package lesson4.framework;

public class TestEnvironment 
{	
	public static final String DATA_FILE = "d:\\Git\\TestGitRepo\\AndyTEST\\src\\lesson4\\lib\\FrameworkForMSSQL.ini";
	private String pathToExcelFile = "";
	private String databaseDriver = "";
	private String databaseURL = "";
	private String username = "";
	private String password = "";
	

	public void initialiseEnvironmentVariables()
	{
		this.pathToExcelFile = getValueFromFile(DATA_FILE, "pathToExcelFile");
		this.databaseDriver = getValueFromFile(DATA_FILE, databaseDriver);
		this.databaseURL = getValueFromFile(DATA_FILE, "databaseURL");
		this.username  = getValueFromFile(DATA_FILE, "username");
		this.password  = getValueFromFile(DATA_FILE, "password");
	};

	private String getValueFromFile(String dataFile, String myParam) {
		String resultValue = "";
		// open file (.ini) and read row by row
		// if row starts from myParam then return the content after =
		//use subString
		
		
		return resultValue;
	}

	public void  createEnvironment()
	{
		Database myDatabase = new Database(databaseURL, username, password);
		myDatabase.createStructure();
		myDatabase.fillData();
	};

	public void  runTests()
	{
		Test myTest = new Test();
		myTest.readData();
		myTest.executeTestCases();
		myTest.generateReports();
	};
	
	

}
