package basic;

import java.util.Scanner;

import com.TestBasic;
/*
 * public class Test {
 * 
 * int num;
 * 
 * void input() { Scanner sc=new Scanner(System.in);
 * System.out.println("Enter a number"); num=sc.nextInt(); }
 * 
 * void display() { System.out.println(num); } public static void main(String[]
 * args) {
 * 
 * Test ob=new Test(); ob.input(); ob.display(); }
 * 
 * }
 */



/*
public class Test {
	
	int num;
	
	int input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		return num;
	}
	
	void display(int n)
	{
		System.out.println(n);
	}
	public static void main(String[] args) {
	
		Test ob=new Test();
		int n=ob.input();
		
		ob.display(n);
	}

}
*/

public class Test {
	String name;
	String getName()
	{
		
		
		return "Simran";
	}
	
	public static void main(String[] args) {
		
		
		    System.out.println("\nJava Version: "+System.getProperty("java.version"));
		    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
		    System.out.println("Java Home: "+System.getProperty("java.home"));
		    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
		    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
		    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
		 
		Test t=new Test();
		System.out.println(t.getName());
		
		String n=t.getName();
		System.out.println(n);
		
		
	}
}


