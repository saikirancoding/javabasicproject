package com;

import java.util.Scanner;

public class TestArray {
	
  int[]	input()
	{
	  Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter array elements");
		   for(int i=0;i<5;i++)
	        {
			   a[i]=sc.nextInt();
	            
	        }
		 return a;
	}

    void display(int []a)
    { System.out.println("Display array");
    	for(int i=0;i<5;i++)
    	   System.out.println(a[i]);
    }
    	
     
	public static void main(String[] args) {
		
		TestArray ob=new TestArray();
		int b[]=  ob.input();
		  
		ob.display(b);
		  
		   
	}

}
