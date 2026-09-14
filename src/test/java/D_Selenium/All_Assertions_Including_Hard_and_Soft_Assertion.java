package D_Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class All_Assertions_Including_Hard_and_Soft_Assertion 
{
    WebDriver driver;

    @Test
    public void verifyAssertions() 
    {
        // 1. Launch Browser
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Open URL
        driver.get("https://www.saucedemo.com/");

        // 3. HARD ASSERTIONS
        // assertEquals() → Compare
        Assert.assertEquals(driver.getTitle(),"Swag Labs");

        // assertTrue() → Should be TRUE
        Assert.assertTrue(driver.findElement(By.id("user-name")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("login-button")).isDisplayed());

        // 4. LOGIN
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // 5. CRITICAL VALIDATION
        // Verify URL after login
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
        // Verify Products text
        Assert.assertEquals(driver.findElement(By.className("title")).getText(),"Products");
        // Verify Add to Cart button
        Assert.assertTrue(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed());

        // 6. SOFT ASSERTIONS
        SoftAssert soft = new SoftAssert();

        // Product name
        soft.assertEquals(driver.findElement(By.className("inventory_item_name")).getText(),"Sauce Labs Backpack");
        // Add to Cart button
        soft.assertTrue(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed());
        // URL contains inventory
        soft.assertTrue(driver.getCurrentUrl().contains("inventory"));
        // IMPORTANT
        soft.assertAll();
    }

    // 7. CLOSE BROWSER
    @AfterMethod
    public void tearDown() 
    {
        if (driver != null) 
        {
            driver.quit();
        }
    }
}
