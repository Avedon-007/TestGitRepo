package lesson4.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromFile 
{
	public  String readFromFile() throws IOException
	
	//public static void main(String[] args) throws IOException
	{
		//Specify path to your file
		File file = new File("D:\\Git\\TestGitRepo\\AndyTEST\\Libs\\FrameworkForMSSQL.ini");
				
		//Create special input stream for reading data
		FileInputStream fis = new FileInputStream(file);
		
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		//Print all existing lines from file to the console
		String line = "";
		String resultRead = "";
		while ((line = br.readLine()) != null) {
			//System.out.println(line);
			resultRead += line + "\n";
		}
		br.close();
		
		
		return resultRead;
	}
	
	public static void main(String[] args)throws IOException
	{
		ReadFromFile readFromFile = new ReadFromFile();
		System.out.println(readFromFile.readFromFile());
	}
}
 