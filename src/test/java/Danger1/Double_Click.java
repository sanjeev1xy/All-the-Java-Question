package Danger1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Click 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanje\\eclipse-workspace\\Danger\\chromedriver-win64\\chromedriver.exe");

	
	driver.get("https://omayo.blogspot.com/");
	WebElement blogsmenu=driver.findElement(By.id("blogsmenu"));
	Actions ac=new Actions(driver);
	//ac.moveToElement(blogsmenu).perform();
	ac.doubleClick(blogsmenu).perform();
	System.out.println("Double Click is successful");
	driver.quit();
	
}
}
