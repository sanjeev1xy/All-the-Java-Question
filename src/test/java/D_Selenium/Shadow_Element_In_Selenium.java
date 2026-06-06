package D_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Element_In_Selenium 
{
    public static void main(String[] args) throws InterruptedException 
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        // Step 1: Locate Shadow Host
        WebElement host = driver.findElement(By.cssSelector("#userName"));

        // Step 2: Get Shadow Root
        SearchContext shadowRoot = host.getShadowRoot();

        // Step 3: Locate Element inside Shadow DOM
        WebElement inputBox = shadowRoot.findElement(By.cssSelector("#kils"));

        // Step 4: Perform Action
        Thread.sleep(2000); // Just to see the action happening
        inputBox.sendKeys("Hello Shadow DOM");
        Thread.sleep(10000); 
        System.out.println("Text entered successfully inside Shadow DOM");

        driver.quit();   // Close all browser windows of the current session
        
        //driver.close(); //closes only the current browser window.
    }
}