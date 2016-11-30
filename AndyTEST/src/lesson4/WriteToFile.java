package lesson4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteToFile 
{
	private static void writeToFile() throws IOException
	{
		//Specify path to your new file
		File file = new File("out.txt");
		
		//Create special output stream for writing  data
		FileOutputStream fos = new FileOutputStream(file);
		
		//Construct BufferedWrite form OutputStreamWriter
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		
		//Write 10 words to your file
		for(int i = 0; i < 10; i++)
		{
			bw.write("something");
			bw.newLine();
		}bw.flush();
		bw.close();
	}
}
