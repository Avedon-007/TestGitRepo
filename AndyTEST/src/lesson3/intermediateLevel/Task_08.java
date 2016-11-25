/*
 * CamelCaseSeparator. Some testing frameworks can read names of test methods and include them to
the report like a beautiful sentence. As you know, we use camelCaseNamingPolicy during writing our
tests. Please write a method which takes a test name and returns beautiful sentence for report.
Example:
		Input: "checkChangingProfilePicture�
		Output: "Check changing profile picture"
 */



package lesson3.intermediateLevel;


public class Task_08 
{
	
	public char[] splitCamelCase(String testString)  // ����� ��� ��������� ��������� ������ �� �����
	{
		String buferTestString = testString.replaceAll(String.format("%s|%s|%s", 
								"(?<=[A-Z])(?=[A-Z][a-z])", 
								"(?<=[^A-Z])(?=[A-Z])", 
								"(?<=[A-Za-z])(?=[^A-Za-z])" ), 
								" ");
		char[] bufCharArray = buferTestString.toCharArray(); // �������� ������ � ��������� ������
		return bufCharArray;
	}		
	
	public void Logic(char[] bufCharArray)
	{		
		String newStr = "";
		char newChar = ' ';	
		for(int i = 0; i < bufCharArray.length; i++)
		{			
			char ch = bufCharArray[i];					
			if(i == 0)     //1. ������ ������ ��������� � ������� �������			
				newChar = Character.toUpperCase(ch);			
			else if(i > 0)  //2. ��� ����������� ������� ��������� � ������ �������
			{
				if(ch == ' ') //3. ������ (����� ������ ����� � ������)				
					newChar = ' ';												
				else if(Character.isUpperCase(ch))								 
					newChar = Character.toLowerCase(ch);			
				else 				
					newChar = ch;				
			}	
			bufCharArray[i] = newChar;		// ���������� ��������� ������� ��������� �����						
		}	
		 newStr = String.valueOf(bufCharArray); // �������� ������ ������� � ������
		System.out.println(newStr);
	}	
	
	public static void main(String[] args) 
	{
		//Test data
		String testString = "canWeLoveAgaine";
		//Instantiate new object
		Task_08 task = new Task_08();
		//Method application		
		task.Logic(task.splitCamelCase(testString));		
	}
}

