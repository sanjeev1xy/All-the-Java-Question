package Danger1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Handle_Selenium 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanje\\eclipse-workspace\\Danger\\chromedriver-win64\\chromedriver.exe");

	driver.get("https://the-internet.herokuapp.com/");
	
	Thread.sleep(5000);
	//Run the javascript code
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	//down scrolling
	jse.executeScript("window.scrollBy(0,400)");
	//window.scrollBy(x,y),here x=horizontal distance and y=vertical distance just use this.
	//command in the console of network.
	Thread.sleep(3000);
	//up scrolling
	jse.executeScript("window.scrollBy(0,-200)");
}
}
