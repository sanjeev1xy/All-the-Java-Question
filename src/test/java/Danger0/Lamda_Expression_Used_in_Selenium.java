package Danger0;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lamda_Expression_Used_in_Selenium 
{
    public static void main(String[] args) throws InterruptedException 
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        Thread.sleep(20000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // ✅ LAMBDA EXPRESSION USED HERE
        wait.until(d -> d.findElement(By.name("q")).isDisplayed());

        System.out.println("Google search box is displayed");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        // ✅ LAMBDA EXPRESSION USED HERE
        links.forEach(e -> System.out.println(e.getText()));

        driver.quit();
    }
}
