package D_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Class
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanje\\eclipse-workspace\\Danger\\chromedriver-win64\\chromedriver.exe");

    //The Actions class in Selenium is used to perform advanced user interactions
	//that cannot be done with normal click() or sendKeys().
	
    //It is mainly used for:-
	         //1.Mouse Hover(Move to Element)
			//2.Send keys
			//3.Drag and Drop
			//4.Right Click(Context Click)
			//5.Double Click
			//6.Click and Hold / Release
			//7.Keyboard Actions(CTRL+A, CTRL+C, CTRL+V)
			//8.Slider Movement (Using dragAndDropBy)
			//9.Multiple Actions Together (Composite Actions)
/*
//1.Mouse Hover (Move to Element)
//When you want to hover over a menu and open a submenu.
driver.get("https://omayo.blogspot.com/");
Actions ac=new Actions(driver);
WebElement blogsMenuElement=driver.findElement(By.id("blogsmenu"));
ac.moveToElement(blogsMenuElement).perform();
WebElement sbaOptionElement=driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
ac.moveToElement(sbaOptionElement).click().build().perform();
System.out.println("Move to Element is ok");
driver.quit();


//2.Send keys
driver.get("https://loan.oto.com/");
Actions ac1=new Actions(driver);
WebElement mobile_no=driver.findElement(By.name("mobile"));
mobile_no.sendKeys("8699415693");
WebElement Password=driver.findElement(By.name("password"));
Password.sendKeys("7654649482");
ac1.sendKeys(Keys.ENTER).perform();	


//3.Drag and Drop
driver.get("https://demo.guru99.com/test/drag_drop.html");
Actions act = new Actions(driver);
WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
WebElement target = driver.findElement(By.id("bank"));
act.dragAndDrop(source, target).build().perform();
System.out.println("Drag and Drop is successful");
Thread.sleep(3000);
driver.quit();


//4.Right Click (Context Click)
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
Actions act = new Actions(driver);
WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
act.contextClick(rightClickButton).perform();
System.out.println("Right Click is successful");
Thread.sleep(3000);
driver.quit();


//5.Double Click
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
Actions act = new Actions(driver);
WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
act.doubleClick(doubleClickButton).perform();
Alert alert = driver.switchTo().alert();
System.out.println("Alert Message: " + alert.getText());
alert.accept();
System.out.println("Double Click is successful");
Thread.sleep(3000);
driver.quit();	 


//6.Click and Hold / Release
//Used for drag actions, sliders, resizing elements.
driver.get("https://jqueryui.com/slider/");
// Switch to Frame (because slider is inside iframe)
driver.switchTo().frame(0);
// Locate Slider Handle
WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
Actions act = new Actions(driver);
// Perform Click and Hold → Move → Release
    act.clickAndHold(slider)
       .moveByOffset(200, 0)   // Move 200 pixels to right
       .release()
       .build()
       .perform();

    System.out.println("Slider moved successfully using Click and Hold");

    Thread.sleep(3000);
    driver.quit();


//7. Keyboard Actions (CTRL+A, CTRL+C, CTRL+V)
driver.get("https://omayo.blogspot.com/");
WebElement textArea = driver.findElement(By.id("ta1"));
textArea.sendKeys("Selenium Keyboard Actions Example");
Actions act = new Actions(driver);

// CTRL + A (Select All)
act.keyDown(Keys.CONTROL)
   .sendKeys("a")
   .keyUp(Keys.CONTROL)
   .perform();
Thread.sleep(1000);

// CTRL + C (Copy)
act.keyDown(Keys.CONTROL)
   .sendKeys("c")
   .keyUp(Keys.CONTROL)
   .perform();
Thread.sleep(1000);

// Move cursor to another text area
WebElement textArea2 = driver.findElement(By.id("ta2"));
textArea2.click();

// CTRL + V (Paste)
act.keyDown(Keys.CONTROL)
   .sendKeys("v")
   .keyUp(Keys.CONTROL)
   .perform();

System.out.println("Keyboard Actions performed successfully");

Thread.sleep(3000);
driver.quit();


//8.Slider Movement (Using dragAndDropBy)
driver.get("https://jqueryui.com/slider/");
// Switch to iframe (Slider is inside frame)
driver.switchTo().frame(0);
// Locate slider handle
WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
Actions act = new Actions(driver);
// Move slider 150 pixels to right
act.dragAndDropBy(slider, 150, 0).perform();
System.out.println("Slider moved successfully using dragAndDropBy");
Thread.sleep(3000);
driver.quit();*/


//9.Multiple Actions Together (Composite Actions)
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
Actions act = new Actions(driver);
WebElement doubleClickButton = driver.findElement(
By.xpath("//button[text()='Double-Click Me To See Alert']"));
WebElement rightClickButton = driver.findElement(
By.xpath("//span[text()='right click me']"));
// Perform Multiple Actions in Sequence
    act.moveToElement(doubleClickButton)   // Move to element
       .doubleClick()                     // Double click
       .pause(1000)                       // Wait for 1 sec
       .moveToElement(rightClickButton)   // Move to another element
       .contextClick()                    // Right click
       .build()
       .perform();
System.out.println("Composite Actions performed successfully");
Thread.sleep(3000);
driver.quit();
}
}
