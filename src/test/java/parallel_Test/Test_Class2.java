package parallel_Test;

import org.testng.annotations.Test;

public class Test_Class2 
{
	@Test
public void testMethod5()
{
	//I want Thread Number (Thread.currentThread().getId()) -> whenever execute anytestcase in the java so every testcase going to execute on some thread , so you perform any action not for testcase execution,first java will create thread for you.
	// than start for those operation , even will try to print hello world in the console.
	System.out.println("TestClass2 >> testMethod5 >>" +Thread.currentThread().getId());
}
	@Test
	public void testMethod6()
	{
		System.out.println("TestClass2 >> testMethod6 >>" +Thread.currentThread().getId());
	}
	@Test
	public void testMethod7()
	{
		System.out.println("TestClass2 >> testMethod7 >>" +Thread.currentThread().getId());
	}
	
	
}
