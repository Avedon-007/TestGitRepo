package lesson4.framework;

public class TestEnvironment 
{	
	public static final String DATA_FILE = "d:\\Git\\TestGitRepo\\AndyTEST\\src\\lesson4\\lib\\Framework.ini";
	private String pathToExcelFile = "";
	private String databaseDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String databaseURL = "";
	private String username = "";
	private String password = "";
	

	public void initialiseEnvironmentVariables()
	{
		this.pathToExcelFile = getValueFromFile(DATA_FILE, "pathToExcelFile");
		this.databaseURL = getValueFromFile(DATA_FILE, "databaseURL");
		this.username  = getValueFromFile(DATA_FILE, "username");
		this.password  = getValueFromFile(DATA_FILE, "password");
	};

	public void  createEnvironment()
	{
		Database myDatabase = new Database(databaseURL, username, password);
		myDatabase.createStructure();
		myDatabase.fillData();
	};

	public void  runTests()
	{
		Test myTest = Test();
		myTest.readData();
		myTest.executeTestCases();
		myTest.generateReports();
	};
	
	

}
