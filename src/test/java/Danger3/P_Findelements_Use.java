package Danger3;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_Findelements_Use 
{
public static void main(String[] args) throws InterruptedException 
{
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanje\\eclipse-workspace\\Danger\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");	
		
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.click();
		search.sendKeys("Automation Testing Videos");
		driver.findElement(By.xpath("(//button[@id='search-icon-legacy'])")).click();
		Thread.sleep(5000);
		
		List<WebElement>ls=driver.findElements(By.id("video-title"));
		System.out.println("Total videos are "+ls.size());
		
		ls.get(1).click();
		System.out.println(driver.getCurrentUrl());
		//Now we want to play all these videos
		Actions ac=new Actions(driver);
		
		for(WebElement element:ls)
		{
			element.click(); // Video play
			Thread.sleep(5000);
			driver.navigate().back();
			ac.sendKeys(Keys.ESCAPE).perform();
		}
}
}
