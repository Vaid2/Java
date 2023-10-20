package day1;


public class Que_6b {

	public static void main(String[] args) {
		
		for(int i=4;i>=1;i--)
		{
			for(int s=i;s<4;s++)
				System.out.print(" ");
			
			for(int j=i;j>=1;j--)
				System.out.print("* ");
			System.out.println();
		}
	
	}

}