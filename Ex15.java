package day1;

import java.util.Scanner;
public class Ex15 
{
	public static void main(String srgs[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		int no1=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int no2=sc.nextInt();
		if(no1>no2)
			System.out.println(no1+" is greater number");
		else if(no2>no1)
			System.out.println(no2+" is greater number");
		else
			System.out.println(no1+" and "+no2+" both are equal numbers.");
		sc.close();
	}
}
