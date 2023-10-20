package day1;

import java.util.Scanner;
public class Que_2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int num1=10;
		int num2=20;
		int res;
		
		System.out.println("Please enter operator");
		char ch;
		ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case '+': res=num1+num2;
		System.out.println(res);
				break;
		default: System.out.println("invalid");
		}
	}

}

