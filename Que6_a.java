package day1;

public class Que6_a {

	public static void main(String[] args) {
		
			for(int i=1;i<=5;i++)
			{
				for(int s=i;s<5;s++)
				System.out.print(" ");
				
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
	}

}