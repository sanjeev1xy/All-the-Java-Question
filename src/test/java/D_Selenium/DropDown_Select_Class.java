package D_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select_Class
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Locate Country Dropdown
        WebElement country = driver.findElement(By.id("country"));

        // Create Select Class Object
        Select s = new Select(country);

        // 1. Select By Visible Text
        s.selectByVisibleText("India");
        Thread.sleep(2000);

        // 2. Select By Value
        s.selectByValue("japan");
        Thread.sleep(2000);

        // 3. Select By Index
        s.selectByIndex(2);
        Thread.sleep(2000);

        driver.quit();
    }
}