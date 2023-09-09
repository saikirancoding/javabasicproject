package basic;

import java.util.Scanner;

public class TestFarToCelcius {

	public static void main(String[] args) {
		
		float cel,far;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter celcius");
		cel=sc.nextFloat();
		
		far=((9*cel)/5)+32;
		
		System.out.println(far+" Fahreheit");
		
		

	}

}
