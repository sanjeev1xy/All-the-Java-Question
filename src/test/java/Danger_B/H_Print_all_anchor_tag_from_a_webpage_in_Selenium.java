package Danger_B;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class H_Print_all_anchor_tag_from_a_webpage_in_Selenium  
	{
	    public static void main(String[] args) 
	    {
	        // Step 1: Launch Browser
	        WebDriver driver = new ChromeDriver();

	        // Step 2: Open Website
	        driver.get("https://www.wikipedia.org/");

	        // Step 3: Maximize Window
	        driver.manage().window().maximize();

	        // Step 4: Find all <a> tags
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        // Step 5: Print total links count
	        System.out.println("Total Links: " + links.size());

	        // Step 6: Loop through each link
	        for(WebElement link : links)
	        {
	            System.out.println("Link Text: " + link.getText());
	            System.out.println("URL: " + link.getAttribute("href"));
	            System.out.println("---------------------------");
	        }

	        // Step 7: Close Browser
	        driver.quit();
	    }
	}

