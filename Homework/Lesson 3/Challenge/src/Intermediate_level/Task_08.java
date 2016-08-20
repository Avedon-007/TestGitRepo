package Intermediate_level;
import java.util.*;

public class Task_08 
{
	private static Scanner sc1;	
	private static String str;
	private static String newStr = "";
	private static char newChar = ' ';
	private static char ch;
	private static char[] buf;
	
		
	public Task_08()
	{
		Scanner sc1;
		String str;
		newStr = "";
		newChar = ' ';
		char ch;
		char[] buf;
	}
	
	
	
	static String splitCamelCase(String str)  // ����� ��� ��������� ��������� ������ �� �����
	{
		return str.replaceAll(String.format("%s|%s|%s", 
								"(?<=[A-Z])(?=[A-Z][a-z])", 
								"(?<=[^A-Z])(?=[A-Z])", 
								"(?<=[A-Za-z])(?=[^A-Za-z])" ), 
								" " 
								);
	}	
	
	public void Scan()
	{
		System.out.print("Enter CamelCase string: ");		
		sc1 = new Scanner(System.in);
		str = sc1.nextLine();
	}
	
	public void Logic()
	{
		char[] buf = splitCamelCase(str).toCharArray(); // �������� ������ � ��������� ������
		
		for(int i = 0; i < buf.length; i++)
		{			
			ch = buf[i];
			if(i == 0)     //1. ������ ������ ��������� � ������� �������			
				newChar = Character.toUpperCase(ch);
			
			else if(i > 0)  //2. ��� ����������� ������� ��������� � ������ �������
			{
				if(ch == ' ') //3. ������ (����� ������ ����� � ������)				
					newChar = ' ';												
				else if(Character.isUpperCase(ch))								 
					newChar = Character.toLowerCase(ch);			
				else if(Character.isLowerCase(ch))				
					newChar = Character.toLowerCase(ch);				
			}	
			buf[i] = newChar;		// ���������� ��������� ������� ��������� �����						
		}	
		newStr = String.valueOf(buf); // �������� ������ ������� � ������
	}	
	
	public static void main(String[] args) 
	{
		Task_08 task = new Task_08();
		task.Scan();
		task.Logic();		
		System.out.print(newStr);
	}
}
