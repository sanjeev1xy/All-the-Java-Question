package Danger3;

public class H_Debugging 
{
//Step Into (F5): It goes inside the method 
//and executes line by line. = Go Inside Method
	
//Step Over (F6): It executes the current line and moves to 
//next line without going inside method. = Skip Inside Method
	
//Step Return (F7): It completes the current method execution 
//and comes back to calling method. = Exit from Method
	
	int a;
	public void method()
	{
		System.out.println("First line of class");
		System.out.println("Second line of class");
	}
	public void method1()
	{
		System.out.println("First line of class1");
		System.out.println("Second line of class1");
	}
	public static void main(String[] args) 
	{
		System.out.println("I am the boss");
		System.out.println("Main Method First line");
		System.out.println("Main Method Second line");
		
		H_Debugging s=new H_Debugging();
		s.method();
		System.out.println("Value of a is "+s.a);
		s.a=115;
		System.out.println("Third line of main method ");
		s.method1();
		System.out.println("value of a is  "+s.a);
		System.out.println("Final line of main method ");
	}
}
