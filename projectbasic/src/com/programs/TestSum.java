package com.programs;
import java.util.Scanner;

//=!2/1 +!3/2+ !4/3+...................10terms    
//WAP find and print the sum of the following series upto 10 terms.

public class TestSum {

	public static int fact(int n) {
		int f=1;
		for(int i=1; i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of terms: ");
		int terms=sc.nextInt();
		int sum=0;
		for(int i=1;i<terms;i++) {
			
		//System.out.println(fact(i+1)/i);
			sum=sum+fact(i+1)/i;
			
			System.out.println("Sum is: !"+fact(i+1)/i);
		
	}
System.out.println(+sum);
	}
}
