package lesson4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestReadFromINI {

	public static final String DATA_FILE = "D:\\Git\\TestGitRepo\\AndyTEST\\Libs\\FrameworkForMSSQL.ini";
	protected static String pathToExcelFile = "pathToExcelFile";
	protected static String databaseDriver = "databaseDriver";
	protected static String databaseURL = "databaseURL";
	protected static String databaseName  = "databaseName";

	
	public static void main(String[] args) throws IOException 
	{
		TestReadFromINI myInstance = new TestReadFromINI();
//		myInstance.getValueFromFile(DATA_FILE, databaseDriver);
		myInstance.test(myInstance.getValueFromFile(DATA_FILE, pathToExcelFile));

	}

	public String getValueFromFile(String DATA_FILE, String myParam) throws IOException {
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
			//System.out.println(line);
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

	public void test(String resultValue)
	{
		System.out.println(resultValue);
	}
}
