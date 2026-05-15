//First get Shadow Host → then get Shadow Root → then find element.
//Yes, JavaScript can easily handle Shadow Elements using shadowRoot property.
package Danger0;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow1_Element_In_Selenium 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://shop.polymer-project.org/");
        driver.manage().window().maximize();

        // Step 1: Find Shadow Host (shop-app)
        WebElement shadowHost1 = driver.findElement(By.cssSelector("shop-app"));

        // Step 2: Get Shadow Root (Level 1)
        SearchContext shadowRoot1 = shadowHost1.getShadowRoot();

        // Step 3: Find inner Shadow Host (shop-home)
        WebElement shadowHost2 = shadowRoot1.findElement(By.cssSelector("shop-home"));

        // Step 4: Get Shadow Root (Level 2)
        SearchContext shadowRoot2 = shadowHost2.getShadowRoot();

        // Step 5: Find element inside Shadow DOM
        WebElement element = shadowRoot2.findElement(By.cssSelector("h2"));

        // Print text
        System.out.println(element.getText());

        Thread.sleep(5000);
        driver.quit();
	}

}
