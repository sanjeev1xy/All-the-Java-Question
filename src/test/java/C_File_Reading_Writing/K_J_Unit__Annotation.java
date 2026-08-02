package C_File_Reading_Writing;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class K_J_Unit__Annotation 
{
//@BeforeClass
//@BeforeTest
//@Test
//@AfterTest
//AfterClass
	
//@Ignore it is used to ignore a few test statements during 
//execution.
	
//@Disable used to disable the tests from execution , but the 
//corresponding reports of the tests are still generated.
	
//output of this program should be
	
//Before Class
//I am the before test user
//I am the test user
//I am the after test user
//I am the before test user
//I am the test user 1
//I am the after test user
//After Class
	
//this program will run alphabetically from method name,priority 
//and order can't set in the J unit only set in the TestNG.
	
//@Before and @After will run each @Test Annotation
	
//if You are using without static method in the Before Class and 
//After Class then it will give the error.
	
//@BeforeClass and @AfterClass , it will execute only once , 
//start and end.
	
	@BeforeClass
	public static void class1()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public static void class2()
	{
		System.out.println("After Class");
	}
	@Test
	public void a()
	{
		System.out.println("I am the test user");
	}
	@Test
	public void xyz()
	{
		System.out.println("I am the test user 1");
	}
	@Before
	public void abc1()
	{
		System.out.println("I am the before test user");
	}
	@After
	public void abc2()
	{
		System.out.println("I am the after test user");
	}
}
