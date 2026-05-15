package Danger1;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_New_Tab_or_Multiple_Window_Selenium  
{
    public static void main(String[] args) throws InterruptedException
    {
        /*
        getWindowHandle()  → Returns current window ID
        getWindowHandles() → Returns all window IDs
        switchTo().window() → Switch between windows
        */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open DemoQA Browser Windows page
        driver.get("https://demoqa.com/browser-windows");

        // Store parent window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindow);

        // Click on "New Window" button
        driver.findElement(By.id("windowButton")).click();
        Thread.sleep(2000);

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Total Windows: " + allWindows.size());

        // Switch to child window
        for (String window : allWindows) 
        {
            if (!window.equals(parentWindow)) 
            {
                driver.switchTo().window(window);

                // Get text from new window
                String text = driver.findElement(By.id("sampleHeading")).getText();
                System.out.println("Child Window Text: " + text);

                Thread.sleep(2000);
                driver.close(); // Close child window
            }
        }

        // Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Parent Window Title: " + driver.getTitle());

        Thread.sleep(2000);
        driver.quit();
    }
}