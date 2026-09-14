package D_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView_selelnium 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/");

Thread.sleep(2000);

// 4. Find the button/link
WebElement scrollElement = driver.findElement(By.xpath("//a[text()='Infinite Scroll']"));

// 5. Create JavaScriptExecutor
JavascriptExecutor js = (JavascriptExecutor) driver;

// 6. Scroll to the element
js.executeScript("arguments[0].scrollIntoView(true);",scrollElement);

Thread.sleep(2000);

// 7. Click the element
scrollElement.click();
	        
System.out.println("ScrollIntoView Successful ");

Thread.sleep(3000);

// 8. Close browser
driver.quit();

}
}
