package D1_Data_Driven_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class L1_Data_Provider_Annotation_Demo
{
	WebDriver driver;

	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "dp")
	public void testLogin(String email, String pwd, String exp) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);

		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pwd);

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(2000);

		boolean status = driver.findElements(By.xpath("//h2[normalize-space()='My Account']")).size() > 0;

		// Valid Login
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(status)
			{
				driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail("Valid Login Failed");
			}
		}

		// Invalid Login
		else
		{
			if(status)
			{
				driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
				Assert.fail("Invalid Login Passed");
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}

	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

	@DataProvider(name = "dp" , indices={0,1,2,3,4})
	public Object[][] loginData()
	{
		Object data[][] =
		{
			{"abc@gmail.com", "test123", "Invalid"},
			{"xyz@gmail.com", "test012", "Invalid"},
			{"john@gmail.com", "test@123", "Invalid"},
			{"sanjeev86994156@gmail.com", "SANgita@123", "Valid"},
			{"johncanedy@gmail.com", "test", "Invalid"}
		};

		return data;
	}
}


