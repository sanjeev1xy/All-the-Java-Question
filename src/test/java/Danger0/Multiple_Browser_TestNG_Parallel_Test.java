package Danger0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Browser_TestNG_Parallel_Test 
{
//TestNG parallel execution allows running tests on multiple 
//browsers at the same time to save execution time
	
    WebDriver driver;

    @Parameters("browser")
    @Test
    public void launchBrowser(String browser) throws InterruptedException 
    {
        if (browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get("https://www.facebook.com");
        // ⏳ Wait for 20 seconds (each browser waits independently)
        Thread.sleep(20000);
        driver.quit();
    }
}
