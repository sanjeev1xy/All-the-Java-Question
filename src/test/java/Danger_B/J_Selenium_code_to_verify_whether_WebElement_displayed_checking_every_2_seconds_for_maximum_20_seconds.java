package Danger_B;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class J_Selenium_code_to_verify_whether_WebElement_displayed_checking_every_2_seconds_for_maximum_20_seconds 
{
    public static void main(String[] args) 
    {
        WebDriver driver = new ChromeDriver();
        
        // Working Website
        driver.get("https://www.google.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // polling every 2 seconds
        wait.pollingEvery(Duration.ofSeconds(2));

        // Google search box (valid element)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

        System.out.println("Element is displayed");

        driver.quit();
    }
}