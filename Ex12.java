package day1;

import java.util.Scanner;
public class Ex12
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int no1=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int no2=sc.nextInt();
		int sub= no1-no2;
		System.out.println("Subtraction is "+sub);
		sc.close();
	}
}
