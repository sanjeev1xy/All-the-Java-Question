package Danger_B;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class K_Selenium_code_to_verify_WebElement_displayed_checking_every_2_seconds_for_max_20_seconds 
{
	public static void main(String[] args) 
	{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // Wait max 20 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Check every 2 seconds
        wait.pollingEvery(Duration.ofSeconds(2));

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
            System.out.println("Element is Displayed");
            } 
        catch (Exception e) 
        {
            System.out.println("Element is NOT Displayed");
        }
        driver.quit();
    }
}
