package D_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_Search_and_Price_Extraction 
{
  public static void main(String[] args) 
  {
/*
Q. Open any public e-commerce/demo website using Selenium. 
   Search for a product(for example, "laptop"), wait for 
   the results to load, and print the names and prices of 
   the first 5 products.

.//h2/span → Find product name inside the current product.
.//span[@class='a-price-whole'] → Find product price inside
                                  the current product.
. = current product
// = find inside
@class='...' = find by class
*/
      // Open Amazon
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      // Open website
      driver.get("https://www.amazon.in/");

      // Search for laptop
      WebDriverWait mywait =new WebDriverWait(driver, Duration.ofSeconds(15));
      WebElement searchBox = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
      searchBox.sendKeys("laptop");

      // Click Search
      driver.findElement(By.id("nav-search-submit-button")).click();

      // Wait for product results
      mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-component-type='s-search-result']")));

      // Get product results
      List<WebElement> products =driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
      System.out.println("Total Products Found: " + products.size());

      // Print first 5 products
      int count = Math.min(5, products.size());

      for (int i = 0; i < count; i++) 
      {
          WebElement product = products.get(i);
          String name = product.findElement(By.xpath(".//h2/span")).getText();
          String price = product.findElement(By.xpath(".//span[@class='a-price-whole']")).getText();

          // Easy to understand output
          System.out.println("Product Number: " + (i + 1));
          System.out.println("Product Name: " + name);
          System.out.println("Price: ₹" + price);
          System.out.println("-------------------------");
      }
      driver.quit();
  }
}