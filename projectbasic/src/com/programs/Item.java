package com.programs;

import java.util.Scanner;

public class Item {

	public static void main(String[] args) {
		
		Scanner sc =new  Scanner(System.in);
		System.out.println("Enter the Cost:");
		int cost=sc.nextInt();
		double discount=0;
		double amount;
		
		if(cost<2000) {
			discount=cost*0.05;
		}
		else if(cost>=2000 && cost<5000) {
			discount=cost*0.25;
		}
		else if(cost>=5000 && cost<10000) {
			discount=cost*0.35;
		}
		else if(cost>=10000) {
			discount=cost*0.50;
		}
		
		amount=cost-discount;
		System.out.println("The Amount is:"+amount);
		
	}

}
