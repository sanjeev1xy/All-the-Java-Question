package C_File_Reading_Writing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class N_Generic_Method_Dropdown_Using_Select_Class 
{
	
public static void selectByValue(String value , WebElement element)
{
	Select s=new Select(element);
	s.selectByValue(value);
}

public static void selectByIndex(int i , WebElement element1)
{
Select s1=new Select(element1);
s1.selectByIndex(i);
}

public static void selectByVisibleTex(String Text , WebElement element2)
{
Select s2=new Select(element2);
s2.selectByVisibleText(Text);
}

public static void main(String[] args) throws InterruptedException 
{
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanje\\eclipse-workspace\\Danger\\chromedriver-win64\\chromedriver.exe");
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getPageSource());
System.out.println(driver.getTitle());
Thread.sleep(3000);
WebElement drop=driver.findElement(By.name("birthday_day"));
selectByIndex(6, drop);
driver.quit();
}
}
