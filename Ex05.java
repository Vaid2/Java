package day1;

import java.util.*;
public class Ex05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage: ");
		Double per = sc.nextDouble();
		if(per>=85)
			System.out.println("distinction");
		else if(per>=70)
			System.out.println("first class");
		else if(per>=60)
			System.out.println("second class");
		else if(per>=35)
			System.out.println("pass");
		else 
			System.out.println("fail");
		sc.close();
	}
}
