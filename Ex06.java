package day1;

public class Ex06
{
	public static void main(String[] args) 
	{
		System.out.println("prime number from 1-30: ");
		System.out.print("2");
		for (int i = 3; i <= 30; i = i + 2) 
		{
			int flag = 0;
			for (int j = 2; j <= i / 2; j++) 
			{
				if (i % j == 0) 
				{
					flag++;
					break;
				}
			}
			if (flag==0)
				System.out.print(" "+i);
		}
	}
}
