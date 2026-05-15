package parallel_Test;

import org.testng.annotations.Test;

public class Test_Class1 
{
	@Test
public void testMethod1()
{
	//I want Thread Number (Thread.currentThread().getId()) -> whenever execute anytestcase in the
	//java so every testcase going to execute on some thread , so you perform any action not 
	//for tes tcase execution,first java will create thread for you.
	// than start for those operation , even will try to print hello world in the console.
	System.out.println("TestClass1 >> testMethod1 >>" +Thread.currentThread().getId());
}
	@Test
	public void testMethod2()
	{
		System.out.println("TestClass1 >> testMethod2 >>" +Thread.currentThread().getId());
	}
	@Test
	public void testMethod3()
	{
		System.out.println("TestClass1 >> testMethod3 >>" +Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod4()
	{
		System.out.println("TestClass1 >> testMethod4 >>" +Thread.currentThread().getId());
	}
}