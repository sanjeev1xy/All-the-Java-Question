package Danger0;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Danger0.L2_MyListener.class)
public class L1_Listener
{
    WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException
    {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);
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