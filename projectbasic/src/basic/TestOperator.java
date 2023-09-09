package basic;

import java.util.Scanner;

/*
public class TestOperator {

	public static void main(String[] args) {
	
		int ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbes");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int s;
		
		do
		{
			System.out.println("1.Addition");
			System.out.println("2.Multiplication");
			System.out.println("3.Division");
			System.out.println("4.Remainder");
			System.out.println("5.substraction");
			
			System.out.println("Enter your choice");
			ch=sc.nextInt();
						
			switch(ch)
			{
				case 1:
					System.out.println(n1+n2);
					break;
				case 2:
					System.out.println(n1*n2);
					break;
				case 3:
					System.out.println(n1/n2);
					break;
				case 4:
					System.out.println(n1%n2);
					break;
				case 5:
					System.out.println(n1-n2);
					break;
					
				default:
					System.out.println("your choice is wrong");
			}
			System.out.println("Do u want to continue if yes press 1");
			s=sc.nextInt();
		}while(s==1);
		

	}

}
*/

//< >  <= >=
/*
 * public class TestOperator {
 * 
 * public static void main(String[] args) {
 * 
 * int ch; Scanner sc=new Scanner(System.in);
 * 
 * System.out.println("Enter two numbes"); int n1=sc.nextInt();//6 int
 * n2=sc.nextInt();//7
 * 
 * System.out.println(n1<n2);//true System.out.println(n1>n2);//f
 * 
 * System.out.println(n1<=n2);//t
 * 
 * System.out.println(n1>=n2);//f
 * 
 * System.out.println(n1==n2);//f System.out.println(n1!=n2);//t
 * 
 * 
 * if(n1>n2) { System.out.println(n1+"is maximum"); } else {
 * System.out.println(n2+"is maximum"); }
 * 
 * }
 * 
 * }
 */


//logical operator
//&& ||  !
//&&  t t  t

/*public class TestOperator {

	public static void main(String[] args) {
	
		int ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 numbes");
		int n1=sc.nextInt();//6
		int n2=sc.nextInt();//5
		int n3=sc.nextInt();//7
	
		System.out.println(n1<n2 || n1<n3);//true
		
		if(n1<n2 && n1<n3)
			System.out.println(n1+"is smallest");
		else if(n2<n1 && n2<n3)
			System.out.println(n2+"is smallest");
		else
			System.out.println(n3+"is smallest");
	
}
}*/
/*
 * public class TestOperator {
 * 
 * public static void main(String[] args) {
 * 
 * char ch; Scanner sc=new Scanner(System.in);
 * System.out.println("Enter the char:"); ch=sc.next().charAt(0);
 * if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch
 * =='O'||ch=='U') { System.out.println("Entered char is vowel:"); } else {
 * System.out.println("Entered char is consonent:"); }
 * 
 * } }
 */


/*

public class TestOperator {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 3 nos");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		sc.close();
		int max = n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
		System.out.println(max);
		
		
		
		
	}
}
*/

/*
 * public class TestOperator {
 * 
 * public static void main(String[] args) {
 * 
 * int a=8;
 * 
 * System.out.println(a<<2); }
 * 
 * }
 * 
 */



/*
public class TestOperator {

	public static void main(String[] args) {
	
		int a=8;
		
		System.out.println(a>>>2);
	}
	
}
*/

/*
public class TestOperator {

	public static void main(String[] args) {
	
		int a=5;
		int b=4;
		
		System.out.println(a | b);//
		// 101
	}      
	
}
*/



