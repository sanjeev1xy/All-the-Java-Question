package D_Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_Selenium 
{
public static void main(String[] args) 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanje\\eclipse-workspace\\Danger\\chromedriver-win64\\chromedriver.exe");
	
	driver.get("url");
	
	// implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	// Explicit Wait
	
	WebDriverWait my_wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement element=my_wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("")));
	element.click();
	
	//Fluent Wait
	Wait<WebDriver>my_wait1=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(5))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
}
}
