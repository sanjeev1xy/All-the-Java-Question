package D_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Element_Example
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");
        driver.manage().window().maximize();

        // Hidden content (initially display:none)
        WebElement hiddenText = driver.findElement(By.id("myDIV"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Make the hidden element visible
        js.executeScript("arguments[0].style.display='block';", hiddenText);

        System.out.println(hiddenText.getText());

        driver.quit();
    }
}