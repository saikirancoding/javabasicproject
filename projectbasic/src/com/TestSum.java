package com;

import java.util.Scanner;

public class TestSum {

	public static void main(String []args)
	{
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1=scan.nextInt();
		
		System.out.println("Enter second number");
		num2=scan.nextInt();
		
		int sum=num1+num2;
		
		System.out.println("Sum is "+sum);
		
	}
}
