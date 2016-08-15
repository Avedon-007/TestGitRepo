package Intermediate_level;
import java.util.*;

public class Task_08 
{
	private static Scanner sc1;	
	
	static String splitCamelCase(String str)  // ����� ��� ��������� ��������� ������ �� �����
	{
		return str.replaceAll(String.format("%s|%s|%s", 
								"(?<=[A-Z])(?=[A-Z][a-z])", 
								"(?<=[^A-Z])(?=[A-Z])", 
								"(?<=[A-Za-z])(?=[^A-Za-z])" ), 
								" " 
								);
	}	
	
	public static void main(String[] args) 
	{
		String str;
		String newStr = "";		
		char newChar = ' ';		
		
		System.out.print("Enter CamelCase string: ");
		
		sc1 = new Scanner(System.in);
		str = sc1.nextLine();
	
		char[] buf = splitCamelCase(str).toCharArray(); // �������� ������ � ��������� ������
		
		for(int i = 0; i < buf.length; i++)
		{			
			char ch = buf[i];
			if(i == 0)     //1. ������ ������ ��������� � ������� �������
			{
				newChar = Character.toUpperCase(ch);
			}
			else if(i > 0)  //2. ��� ����������� ������� ��������� � ������ �������
			{
				if(ch == ' ') //3. ������ (����� ������ ����� � ������)
				{
					newChar = ' ';
				}								
				else if(Character.isUpperCase(ch))					
				{					 
					newChar = Character.toLowerCase(ch);									
				}	
				else if(Character.isLowerCase(ch))
				{
					newChar = Character.toLowerCase(ch);
				}
			}	
			buf[i] = newChar;		// ���������� ��������� ������� ��������� �����						
		}	
		newStr = String.valueOf(buf); // �������� ������ ������� � ������
		System.out.print(newStr);
	}
}
