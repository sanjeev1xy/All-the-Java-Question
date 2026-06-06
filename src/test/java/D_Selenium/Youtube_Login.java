package D_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube_Login 
{
    public static void main(String[] args) throws InterruptedException 
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        
        WebElement email = driver.findElement(By.xpath("(//input[contains(@class,'xggy1nq')])[1]"));
        email.sendKeys("sanjeev8697@gmail.com");
        WebElement password = driver.findElement(By.xpath("(//input[contains(@class,'xggy1nq')])[2]"));
        password.sendKeys("SANgita@123");
        WebElement login = driver.findElement(By.xpath("(//div[@role='none'])[3]"));
        login.click();
        
        /*
        Thread.sleep(4000);
        // Click Create New Account
        WebElement Creat_Account=driver.findElement(By.xpath("(//div[@role='none'])[8]"));
        Creat_Account.click();
        Thread.sleep(4000);
        // First Name
        WebElement First_Name=driver.findElement(By.xpath("(//input[contains(@class,'xggy1nq')])[1]"));
        First_Name.sendKeys("STHUB");
        Thread.sleep(2000);
        // Surname
        WebElement Sur_Name=driver.findElement(By.xpath("(//input[contains(@class,'xggy1nq')])[2]"));
        Sur_Name.sendKeys("Testers");
        // Select Day
        WebElement day = driver.findElement(By.xpath("(//div[contains(@class,'xwoeoq')])[1]"));
        day.click();
        WebElement day1 = driver.findElement(By.xpath("(//div[contains(@class,'x1lliihq')])[11]"));
        day1.click();
        // Select Month
        WebElement month = driver.findElement(By.xpath("(//div[contains(@class,'xwoeoq')])[2]"));
        month.click();
        WebElement month1 = driver.findElement(By.xpath("(//div[contains(@class,'x1lliihq')])[8]"));
        month1.click();
        // Select Year
        WebElement year = driver.findElement(By.xpath("(//div[contains(@class,'xwoeoq')])[3]"));
        year.click();
        WebElement year1 = driver.findElement(By.xpath("(//div[contains(@class,'x1lliihq')])[32]"));
        year1.click();
        //Gender
        WebElement Gender=driver.findElement(By.xpath("( //div[contains(@class,'xwoeoq')])[4]"));
        Gender.click();
         WebElement Gender1=driver.findElement(By.xpath("(//div[contains(@class,'x1lliihq')])[2]"));
		 Gender1.click();
        // Mobile Number
        WebElement Mobile_Number=driver.findElement(By.xpath("(//input[contains(@class,'xggy1nq')])[3]"));
        Mobile_Number.sendKeys("8969204470");
        // New Password
        WebElement New_Password=driver.findElement(By.xpath("(//input[contains(@class,'xggy1nq')])[4]"));
        New_Password.sendKeys("8699415693");
        // Submit
        //WebElement Submit=driver.findElement(By.xpath("(//div[contains(@class,'x1ja2u2z')])[109]"));
        //Submit.click();
     // Submit Button
        WebElement Submit = driver.findElement(By.xpath("//div[@role='button']//span[text()='Submit']"));
        Submit.click();
        */
    }
}