package D2_listner_and_reports;
/*
Listener: Used in TestNG to monitor test execution events like 
start, pass, fail, skip, and finish.

Main annotation:
----------------
@Listeners(MyListener.class)

Common Listener methods:
------------------------
onStart()
onTestStart()
onTestSuccess()
onTestFailure()
onTestSkipped()
onFinish()

Example
-------
@Listeners(MyListener.class)
public class LoginTest 
{
    @Test
    public void loginTest() 
    {
        System.out.println("Login Test");
    }
}

In short: Listener helps us automatically perform actions, such as 
taking a screenshot when a test fails.

 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(D2_listner_and_reports.L2_MyListener.class)
public class L1_Listener
{
    WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException
    {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(19000);
    }

    
    // PASS
    @Test(priority = 1)
    public void testLogo()
    {
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertTrue(status);
    }

    // FAIL
    @Test(priority = 2)
    public void testAppUrl()
    {
        Assert.assertEquals(
        driver.getCurrentUrl(),"https://wrongurl.com");
    }

    // SKIP
    @Test(priority = 3, dependsOnMethods = {"testAppUrl"})
    public void testHomePageTitle()
    {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }
    
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}


