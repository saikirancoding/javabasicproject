package com.programs;

class Stoke
{
	private long code;
	private int qty;
	private double price;
	private double total,discount,netPrice;
	
	Stoke(long n,int q, double p)
	{
		code=n;
		qty=q;
		price=p;
			
	}
	public void Compute()
	{
		total = qty*price;
		discount = total*0.25;
		netPrice= total-discount;
		

	}
	public void Display()
	{
		System.out.println("Display Details of Product");

		System.out.println("Code"+code);
		System.out.println("Quantity "+qty);
		System.out.println("Price "+price);
		System.out.println("Total "+total);
		System.out.println("Discount "+discount);
		System.out.println("Net Price"+netPrice);
	}
	
}

public class TestStoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stoke s =new Stoke(101,5,5000.05);
		s.Compute();
		s.Display();
	}

}
