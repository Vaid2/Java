package day1;


public class Ex04 
{
	public static void main(String[] args) 
	{
		System.out.println("Numbers from 3 to 30 except 24: ");
		for(int i=3; i<=30; i++)
		{
			if(i==24)
				continue;
			System.out.print(" "+i);
		}
	}
}
