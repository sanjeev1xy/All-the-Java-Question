package A_Java;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Kumar
{
	public static void main(String[] args) throws MalformedURLException 
	{
		AppiumDriverLocalService service=new AppiumServiceBuilder()
				.withAppiumJS(new File("C:\\Users\\sanje\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1")
				.usingPort(4723)
				.build();
		
		service.start();
		
		UiAutomator2Options op=new UiAutomator2Options();
        op.setDeviceName("emulator-5554");
        op.setPlatformName("Android");
        op.setAutomationName("uiautomator2");
        op.setApp("C:\\Users\\sanje\\eclipse-workspace\\Mobile-Automation_Basics\\src\\test\\java\\resources\\ApiDemos-debug.apk");
        op.setAutoGrantPermissions(true);
        
        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),op);
        
        System.out.println("Mobile App Successful launches");
        
        driver.quit();
        service.stop();
	}
}

