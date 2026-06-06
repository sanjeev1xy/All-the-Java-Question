package D_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ifrane_Handle_Selenium 
{
public static void main(String[] args) throws InterruptedException 
{
//Three way to handle Iframe
//1. Id or name
//2. Index
//3. WebElement
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanje\\eclipse-workspace\\Danger\\chromedriver-win64\\chromedriver.exe");
    driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_linksw3schools");
	
	//How to count total Iframe
	int framecount=driver.findElements(By.tagName("iframe")).size();
	System.out.println("total frame count is "+framecount);
	
	//1. Id or name
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.linkText("Visit W3Schools.com!")).click();
	
	//2. Index
	driver.switchTo().frame(2);
	driver.findElement(By.linkText("Visit W3Schools.com!")).click();
	
	//3. WebElement
	WebElement frameelement=driver.findElement(By.id("iframeResult"));
	driver.switchTo().frame(frameelement);
	Thread.sleep(3000);
	driver.switchTo().defaultContent();  //switch to main page
	driver.findElement(By.id("getwebsitebtn")).click();
	driver.close();
}
}
