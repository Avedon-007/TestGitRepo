package Advanced;
import org.apache.commons.lang3.RandomStringUtils;

public class Task_01 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)   // ������ 80(10*8) ������� � 8~15-� �������.
		{
			for(int j = 8; j <= 15; j++)
				System.out.println(RandomStringUtils.randomAlphanumeric(j));
		}
	}
}
