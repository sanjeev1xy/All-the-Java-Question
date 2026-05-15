//Yes, JavaScript can easily handle Shadow Elements using shadowRoot property.
package Danger0;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Element_In_Selenium 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://shop.polymer-project.org/");
	driver.manage().window().maximize();

	// Step 1: Find Shadow Host
	WebElement shadowHost = driver.findElement(By.cssSelector("shop-app"));

	// Step 2: Get Shadow Root
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", shadowHost);

	// Step 3: Find Element inside Shadow DOM
	WebElement element = (WebElement) js.executeScript(
			"return arguments[0].shadowRoot.querySelector('shop-home').shadowRoot.querySelector('h2')",
			shadowHost);

	System.out.println(element.getText());
	Thread.sleep(5000);
	driver.quit();
	
}
}