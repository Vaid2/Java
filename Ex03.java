package day1;
import java.util.*;

public class Ex03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter the operators from '+', '-', '*', '/', '%': ");
		System.out.println("Enter an Operator: ");
		int ch = sc.next().charAt(0);
		System.out.println("Answer: ");
		switch(ch) 
		{
			case '+' : System.out.println(a+b); 
			break;
			
			case '-' : System.out.println(a-b); 
			break;
			
			case '*' : System.out.println(a*b); 
			break;
			
			case '/' : System.out.println(a/b); 
			break;
			
			case '%' : System.out.println(a%b);
			break;
			
			default : System.out.println("Enter Invalid Choice");
		}
		sc.close();
	}
}
