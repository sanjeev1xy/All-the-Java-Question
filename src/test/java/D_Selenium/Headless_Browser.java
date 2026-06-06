package D_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_Browser 
{
public static void main(String[] args) 
{
ChromeOptions options=new ChromeOptions();
options.addArguments("--headless");
WebDriver driver=new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://omayo.blogspot.com/");
String Title=driver.getTitle();
System.out.println(Title);
driver.quit();
}
}
