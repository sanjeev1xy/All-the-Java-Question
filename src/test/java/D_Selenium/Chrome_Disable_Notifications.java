package D_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Disable_Notifications 
{
public static void main(String[] args) 
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://demoqa.com");
	System.out.println("Successful launch the browser with notifications disabled");
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanje\\eclipse-workspace\\Danger\\chromedriver-win64\\chromedriver.exe");
	driver.quit();
}
}
