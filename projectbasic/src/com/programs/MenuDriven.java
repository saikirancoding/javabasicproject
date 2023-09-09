package com.programs;
import java.util.*;

public class MenuDriven 
{
	int countDigit(int no)
	{
		int cnt=0;
		while(no>0)
		{
			cnt++;
			no=no/10;			
		}
		return cnt;
	}
	int powerDigit(int no,int p)
	{
		int product=1;
		for(int i=1;i<=p;i++)
		{
			product=product*no;
		}
		return product;
	}
	int findFactorial(int no2)
	{
		int fact=1;
		for(int i=1;i<=no2;i++)
		{
			fact=fact*i;
		}
		return fact;
			
	}
	public static void main(String args[])
	{
		MenuDriven m=new MenuDriven();
		Scanner sc=new Scanner(System.in);
		String str=null;
		do
		{
			System.out.println("1.No of digits in the given no");
			System.out.println("2.Power of a given no");
			System.out.println("3.factorial of the given no");
			System.out.println("Enter your coice");
			int c=sc.nextInt();
			switch(c)
			{
				case 1:
					System.out.println("Enter no");
					int no=sc.nextInt();
					int count=m.countDigit(no);
					System.out.println("No of digits="+count);
					break;
				case 2:
					System.out.println("Enter no1");
					int no1=sc.nextInt();
					System.out.println("Enter power");
					int p=sc.nextInt();
					int power=m.powerDigit(no1,p);
					System.out.println("power of no="+power);
					break;
				case 3:
					System.out.println("Enter no2");
					int no2=sc.nextInt();
					int factorial=m.findFactorial(no2);
					System.out.println("Factorial of no="+factorial);
					break;
				default:
					System.out.println("Your choice is wrong:");
			
			}
			System.out.println("Do you want to continue if yes");
			str=sc.next();
			
		}while(str.equals("yes"));		
		
	}
}
