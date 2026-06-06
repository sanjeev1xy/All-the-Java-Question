package A_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kumar
{
	public static void main(String[] args) 
	{
		String s = "ab cd ef  @#$1234  5ab  cj    hSDR0123456321ASD     FGHJDFGH#$%^&*";
		String result="";
		
		for(char c:s.toCharArray())
		{
			if(!Character.isLetterOrDigit(c) && c!=' ')
			{
				if(result.indexOf(c)==-1)
				{
					result=result+c;
				}
			}
		}
		System.out.println(result);
	}
}