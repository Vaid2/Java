package day1;

public class Que_4 {

	public static void main(String[] args) {
		
		int flag=1;
		
		for(int i=3;i<=30;i=i+2)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
					flag=1;
				
			}
			if (flag==1)
				System.out.println(i);
					
			
		}
	}

}
