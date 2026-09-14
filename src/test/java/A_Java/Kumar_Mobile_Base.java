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
	 private String firstname;
     private String lastname;
     private String rollnumber;
     private String Class2;
     private int DOB;
     private int age;

     public String getfirstname()
     {
       return firstname;
     }
     public void setfirstname(String firstname)
     {
       this.firstname=firstname;
     }
     public String getlastname()
     {
       return lastname;
     }
     public void setlastname(String lastname)
     {
       this.lastname=lastname;
     }
     public String getrollnumber()
     {
       return rollnumber;
     }
     public void setrollnumber(String rollnumber)
     {
       this.rollnumber=rollnumber;
     }
     public String getClass2()
     {
       return Class2;
     }
     public void setClass2(String Class2)
     {
       this.Class2=Class2;
     }
     public int getDOB()
     {
       return DOB;
     }
     public void setDOB(int DOB)
     {
       this.DOB=DOB;
     }
     public int getage()
     {
       return age;
     }
     public void setage(int age)
     {
       this.age=age;
     }
 
}
