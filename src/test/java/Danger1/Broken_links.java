package Danger1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_links
{
public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanje\\eclipse-workspace\\Danger\\chromedriver-win64\\chromedriver.exe");

	driver.get("https://www.amazon.in/");
	List<WebElement>links=driver.findElements(By.tagName("a")); //multiple broken link available with a tag on the amazon
	System.out.println("no of links are "+links.size());
	List<String>urllist=new ArrayList<String>();
	for(WebElement e:links)
	{
		String url=e.getAttribute("href"); //href mostly attribute overthere on the amazon
		urllist.add(url);
		checkBrokenLinks(url);
	}
	Long stTime=System.currentTimeMillis();
	urllist.parallelStream().forEach(e->checkBrokenLinks(e));
	Long endTime=System.currentTimeMillis();
	
	System.out.println("total time taken : "+(endTime-stTime));
	driver.quit();
}

public static void checkBrokenLinks(String linkUrl) 
{
	try 
{
	URL url=new URL(linkUrl);
	HttpURLConnection httpUrlConnection=(HttpURLConnection)url.openConnection();
	httpUrlConnection.setConnectTimeout(5000);
	httpUrlConnection.connect();
	
	if(httpUrlConnection.getResponseCode()>=400)
	{
		System.out.println(linkUrl+"------>"+httpUrlConnection.getResponseMessage()+"is broken link");
	}
	else
	{
		System.out.println(linkUrl+"------>"+httpUrlConnection.getResponseMessage());
	}
}
catch(Exception e)
{
	
}
}
}
