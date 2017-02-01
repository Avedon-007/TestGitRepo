package lesson4.framework;

import java.io.IOException;
import java.sql.SQLException;

public class Runner 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException 
	{
		System.out.println("GETTING STARTED...");
		
		TestEnvironment myInstance = new TestEnvironment();

		  myInstance.initialiseEnvironmentVariables();

		  myInstance.createEnvironment();

		  myInstance.runTests();
		  
		  System.out.println("FINISH!!!");
	}
}
