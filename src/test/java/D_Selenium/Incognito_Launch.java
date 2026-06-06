package D_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incognito_Launch 
{
public static void main(String[] args) throws InterruptedException 
{
DesiredCapabilities caps=new DesiredCapabilities();
caps.setAcceptInsecureCerts(true);
ChromeOptions options=new ChromeOptions();
options.addArguments("--start-maximized");
options.addArguments("--incognito");
options.merge(caps);
WebDriver driver=new ChromeDriver(options);
//driver.get("https://omayo.blogspot.com/");
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
Thread.sleep(7000);
driver.quit();

}
}
