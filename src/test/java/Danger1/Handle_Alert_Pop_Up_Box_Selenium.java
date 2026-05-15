package Danger1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alert_Pop_Up_Box_Selenium
{
    public static void main(String[] args) throws InterruptedException   
    {                                                                                                                                                                                                                                                                                                                                        
//Simple Alert:->A simple alert shows a message with only an 
//OK button, and Selenium handles it using `accept().
    	
//Confirmation Alert:->A confirmation alert shows a message
//with OK and Cancel buttons and Selenium
// handles it using accept() or dismiss().
    	
//Prompt Alert:->A prompt alert allows the user 
//to enter text input, and Selenium    	
//handles it using sendKeys() accept() or dismiss().
    	
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/");

        // Click Selenium Practice
        driver.findElement(By.xpath("//a[text()='Selenium Practice']")).click();
        Thread.sleep(2000);

        // Scroll to Alerts link
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)"); //down scrolling

        // Click Alerts using JavaScript (important fix)
        js.executeScript("arguments[0].click();", 
        driver.findElement(By.xpath("//a[text()='Alerts']")));
        Thread.sleep(4000);

        // Simple Alert
        driver.findElement(By.id("alertBox")).click();
        Alert simplealert = driver.switchTo().alert();
        System.out.println(simplealert.getText());
        Thread.sleep(2000);
        simplealert.accept();
        Thread.sleep(2000);

        // Confirmation Alert
        driver.findElement(By.id("confirmBox")).click();
        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        Thread.sleep(2000);
        confirmationAlert.accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(5000);

        // Prompt Alert
        driver.findElement(By.id("promptBox")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Sanjeev");
        Thread.sleep(5000);
        promptAlert.accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(5000);

        driver.quit();
    }
}
