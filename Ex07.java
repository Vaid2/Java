package day1;
public class Ex07
{
	public static void main(String[] args) 
	{		
		for (char c='A'; c<='C'; c++) 
		{
			for (char ch='a'; ch<='c'; ch++)
				System.out.println(c+"\t"+ch);
			System.out.println();
		}
	}
}

/*

A	a
A	b
A	c

B	a
B	b
B	c

C	a
C	b
C	c

*/