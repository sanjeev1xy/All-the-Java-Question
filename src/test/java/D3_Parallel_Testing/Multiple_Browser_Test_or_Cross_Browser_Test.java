package D3_Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Browser_Test_or_Cross_Browser_Test
{
public static void main(String[] args) throws InterruptedException 
{
//Multiple Browser Test or Cross Browser Test

//Yes, we can run two browsers simultaneously by creating two 
//separate WebDriver instances.
	
//Each driver controls a different browser, so both can run in 
//parallel.
	
	 // Launch Chrome
	 WebDriverManager.chromedriver().setup();
	 WebDriver chromeDriver = new ChromeDriver();
	 chromeDriver.get("https://www.google.com");
	 chromeDriver.manage().window().maximize();
     
     
	 Thread.sleep(10000);
	 
	 // Launch Firefox
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver firefoxDriver = new FirefoxDriver();
	 firefoxDriver.get("https://www.facebook.com");
	 firefoxDriver.manage().window().maximize();
	 Thread.sleep(5000);
	 firefoxDriver.quit();
	 Thread.sleep(5000);
	 chromeDriver.quit();
	 Thread.sleep(2000);
}
}
