package day1;
public class Que_5a {

	public static void main(String[] args) {
		int c=0;
		char ch='a';
		
		for(int i=0;i<3;i++)
		{
			System.out.print('A');
			System.out.print("  ");
			for(char j=0;;)
			{
				System.out.print(ch++);
				break;
			}
			System.out.println();
		}

	}

}