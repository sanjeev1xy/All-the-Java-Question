package parallel_Test;

import org.testng.annotations.Test;

public class Test_Class3 
{
	@Test
public void testMethod8()
{
	//I want Thread Number (Thread.currentThread().getId()) -> whenever execute anytestcase in the java so every testcase going to execute on some thread , so you perform any action not for testcase execution,first java will create thread for you.
	// than start for those operation , even will try to print hello world in the console.
	System.out.println("TestClass3 >> testMethod8 >>" +Thread.currentThread().getId());
}
	@Test
	public void testMethod9()
	{
		System.out.println("TestClass3 >> testMethod9 >>" +Thread.currentThread().getId());
	}
	@Test
	public void testMethod10()
	{
		System.out.println("TestClass3 >> testMethod10 >>" +Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod11()
	{
		System.out.println("TestClass3 >> testMethod11 >>" +Thread.currentThread().getId());
	}
}