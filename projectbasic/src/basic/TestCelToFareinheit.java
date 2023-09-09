package basic;

import java.util.Scanner;

public class TestCelToFareinheit {

	public static void main(String[] args) {
		
		float far,cel;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter fahrenheit");
		far=scan.nextFloat();
		
		cel=((far-32)*5)/9;
		
		System.out.println(cel+"celcius");

	}

}
