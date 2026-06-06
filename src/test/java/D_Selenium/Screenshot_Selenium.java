package D_Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_Selenium 
{
public static void main(String[] args) throws IOException 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanje\\eclipse-workspace\\Danger\\chromedriver-win64\\chromedriver.exe");

	driver.get("https://omayo.blogspot.com/");
	File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(sourcefile, new File("E:\\Study\\Interview Preparation\\Screenshot\\screen.png"));
	driver.quit();
}
}
