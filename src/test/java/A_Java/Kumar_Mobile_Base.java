package A_Java;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Kumar_Mobile_Base 
{
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
	public void configureappium() throws MalformedURLException, InterruptedException 
	{
        service=new AppiumServiceBuilder()
				.withAppiumJS(new File("C:\\Users\\sanje\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1")
				.usingPort(4723)
				.build();
		
		service.start();
		
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("emulator-5554");
		options.setPlatformName("Android");
		options.setAutomationName("uiautomator2");
		options.setApp("C:\\Users\\sanje\\eclipse-workspace\\Thakur\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		options.setAutoGrantPermissions(true);
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		
		System.out.println("Mobile app successfuly launch");
	}
	
	public void scrollToEndAction() throws InterruptedException
	{
		boolean canScrollMore;
		do
		{
			canScrollMore=(Boolean)((JavascriptExecutor)driver).executeScript("mobile: scrollGesture",ImmutableMap.of("left",100,"top",100,"width",100,"height",200,"direction","down","percent",3.0));
		}
		while(canScrollMore);
		Thread.sleep(5000);
	}
	
		@AfterClass
		public void teardown()
		{
		driver.quit();
		service.stop();
		}

}
