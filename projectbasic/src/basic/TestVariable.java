package basic;

public class TestVariable {

	int rollno;
	String name;
	
	static int c;
	
	void findMarks()
	{
		int marks=80;//local variabl
		
		System.out.println(rollno+" "+name+" "+marks+" "+c);
		c++;//1
		rollno++;//1
		
	}
	
	public static void main(String[] args) {
	
		TestVariable ob=new TestVariable();
		TestVariable ob1=new TestVariable();
		ob.findMarks();// 0 null 80 0
		ob1.findMarks();//0 null 80 1

	}

}
