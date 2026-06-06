package D_Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Convert_list_Arraylist_Click_Individual_Tab_Selenium
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        String parent = driver.getWindowHandle();
        System.out.println("Parent window id: " + parent);

        // CLICK TO OPEN NEW TAB
        driver.findElement(By.xpath("//button[text()='New Tab']")).click();//click on any value which is open in next tab 
        Thread.sleep(2000);

        // CONVERT SET → ARRAYLIST
        Set<String> allwindow = driver.getWindowHandles();
        ArrayList<String> tab = new ArrayList<String>(allwindow);

        // CLICK (SWITCH) INDIVIDUAL TAB
        driver.switchTo().window(tab.get(1));
        System.out.println("Title of Child Tab: " + driver.getTitle());

        driver.switchTo().window(tab.get(0));
        System.out.println("Title of Parent Tab: " + driver.getTitle());
        
        driver.quit();
    }
}
