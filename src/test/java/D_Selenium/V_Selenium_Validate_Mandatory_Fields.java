package D_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;

public class V_Selenium_Validate_Mandatory_Fields
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // 1. Validate Page Title
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Swag Labs", "Page title did not match!");
        System.out.println("Page title validated : " + actualTitle);

        // 2. Validate Page/Element is not empty (products loaded)
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        Assert.assertFalse(products.isEmpty(), "No products found on page!");
        System.out.println("Products found : " + products.size());

        // 3. Validate Specific Field Value
        String firstProductName = driver.findElement(By.cssSelector(".inventory_item_name")).getText();
        Assert.assertEquals(firstProductName, "Sauce Labs Backpack", "First product name did not match!");
        System.out.println("First product name validated : " + firstProductName);

        // 4. Validate Mandatory Fields exist for each record (not hardcoded index)
        for (int i = 0; i < products.size(); i++)
        {
            WebElement product = products.get(i);

            WebElement name = product.findElement(By.className("inventory_item_name"));
            WebElement desc = product.findElement(By.className("inventory_item_desc"));
            WebElement price = product.findElement(By.className("inventory_item_price"));
            WebElement image = product.findElement(By.className("inventory_item_img"));
            WebElement addToCartBtn = product.findElement(By.tagName("button"));

            Assert.assertTrue(name.isDisplayed(), "Record " + i + " - name is MISSING!");
            Assert.assertFalse(name.getText().isEmpty(), "Record " + i + " - name is EMPTY!");

            Assert.assertTrue(desc.isDisplayed(), "Record " + i + " - description is MISSING!");
            Assert.assertFalse(desc.getText().isEmpty(), "Record " + i + " - description is EMPTY!");

            Assert.assertTrue(price.isDisplayed(), "Record " + i + " - price is MISSING!");
            Assert.assertTrue(price.getText().startsWith("$"), "Record " + i + " - price format is WRONG!");

            Assert.assertTrue(image.isDisplayed(), "Record " + i + " - image is MISSING!");

            Assert.assertTrue(addToCartBtn.isDisplayed(), "Record " + i + " - add to cart button is MISSING!");

            System.out.println("Record " + i + " - " + name.getText() + " validated successfully.");
        }

        System.out.println("All validations passed successfully.");
        driver.quit();
    }
}