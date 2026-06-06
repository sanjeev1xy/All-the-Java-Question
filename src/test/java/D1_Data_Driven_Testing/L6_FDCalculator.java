/*package Data_Driven_Testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		
		String filePath=System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
		//File filePath=new File("../Thakur/testdata/caldata.xlsx");
		
		int rows=ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for(int i=1; i<=rows; i++)
		{
			//1) Read data from excel
			String principle=ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rate_of_Intrest=ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String period1=ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String period2=ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String frequency=ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String expected_maturity_value=ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			
			//2} pass above data into application
driver.findElement(By.id("principal")).clear();
driver.findElement(By.id("principal")).sendKeys(principle);

driver.findElement(By.id("interest")).clear();
driver.findElement(By.id("interest")).sendKeys(rate_of_Intrest);

driver.findElement(By.id("tenure")).clear();
driver.findElement(By.id("tenure")).sendKeys(period1);



			//driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
			//driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rate_of_Intrest);
			//driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			
			//Select period2_drop_down=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			//period2_drop_down.selectByVisibleText(period2);
			
Select period2_drop_down=new Select(driver.findElement(By.id("tenurePeriod")));

if(period2.equalsIgnoreCase("Year(s)"))
{
    period2_drop_down.selectByIndex(0);
}
else if(period2.equalsIgnoreCase("month(s)"))
{
    period2_drop_down.selectByIndex(1);
}
else if(period2.equalsIgnoreCase("day(s)"))
{
    period2_drop_down.selectByIndex(2);
}
			
			
			Select frequency_drop_down=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			frequency_drop_down.selectByVisibleText(frequency);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click(); //clicked on calculate
			
			//validation
			String actual_maturity_value=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			 if(Double.parseDouble(expected_maturity_value)==Double.parseDouble(actual_maturity_value))
			 {
				 System.out.println("Test Passed");
				 ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
				 ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
			 }
			 else
			 {
				 System.out.println("Test Failed");
				 ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
				 ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
			 }
			 
			 //Thread.sleep(7000);
			 driver.findElement(By.xpath("//img[@class='PL5']")).click(); //clicked on clear button
			 
		} // ending of for loop
		
		driver.quit();
	}

}*/



              
package D1_Data_Driven_Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L6_FDCalculator
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");

        Thread.sleep(3000); // wait for page to fully load

        // ✅ Excel file path
        String filePath = System.getProperty("user.dir") + "\\testdata\\caldata.xlsx";

        // ✅ Get total data rows (header is row 0, data starts row 1)
        int rows = L5_ExcelUtils.getRowCount(filePath, "Sheet1");

        System.out.println("Total rows to test: " + rows);
        System.out.println("----------------------------------");

        for (int i = 1; i <= rows; i++)
        {
            // ✅ Step 1: Read data from Excel
            String principal          = L5_ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
            String rateOfInterest     = L5_ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
            String period1            = L5_ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
            String period2            = L5_ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
            String frequency          = L5_ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
            String expectedValue      = L5_ExcelUtils.getCellData(filePath, "Sheet1", i, 5);

            // ✅ Step 2: Enter Principal
            WebElement principalField = driver.findElement(By.id("principal"));
            principalField.clear();
            principalField.sendKeys(principal);

            // ✅ Step 3: Enter Rate of Interest
            WebElement interestField = driver.findElement(By.id("interest"));
            interestField.clear();
            interestField.sendKeys(rateOfInterest);

            // ✅ Step 4: Enter Tenure (period number)
            WebElement tenureField = driver.findElement(By.id("tenure"));
            tenureField.clear();
            tenureField.sendKeys(period1);

            // ✅ Step 5: Select Period dropdown (Year/Month/Day) by index
            Select tenureDropdown = new Select(driver.findElement(By.id("tenurePeriod")));

            if (period2.equalsIgnoreCase("Year(s)"))
            {
                tenureDropdown.selectByIndex(0);
            }
            else if (period2.equalsIgnoreCase("Month(s)"))
            {
                tenureDropdown.selectByIndex(1);
            }
            else if (period2.equalsIgnoreCase("Day(s)"))
            {
                tenureDropdown.selectByIndex(2);
            }
            else
            {
                System.out.println("Row " + i + " : Period not matched -> " + period2);
                // ✅ Write Fail to column 6 (Result column)
                L5_ExcelUtils.writeFailResult(filePath, "Sheet1", i, 6);
                System.out.println("Test Failed");
                continue;
            }

            // ✅ Step 6: Select Frequency dropdown by visible text
            Select frequencyDropdown = new Select(driver.findElement(By.id("frequency")));

            boolean freqFound = false;
            for (WebElement option : frequencyDropdown.getOptions())
            {
                if (option.getText().trim().equalsIgnoreCase(frequency.trim()))
                {
                    frequencyDropdown.selectByVisibleText(option.getText().trim());
                    freqFound = true;
                    break;
                }
            }

            if (!freqFound)
            {
                System.out.println("Row " + i + " : Frequency not matched -> " + frequency);
                // ✅ Write Fail to column 6 (Result column)
                L5_ExcelUtils.writeFailResult(filePath, "Sheet1", i, 6);
                System.out.println("Test Failed");
                continue;
            }

            // ✅ Step 7: Click Calculate button
            driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();

            Thread.sleep(2000); // wait for result to appear

            // ✅ Step 8: Read actual maturity value from page
            String actualValue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

            // ✅ Step 9: Clean values — remove commas before parsing
            actualValue   = actualValue.replace(",", "").trim();
            expectedValue = expectedValue.replace(",", "").trim();

            double actual   = Double.parseDouble(actualValue);
            double expected = Double.parseDouble(expectedValue);

            // ✅ Step 10: Compare and write result to Excel column 6
            if (Math.abs(actual - expected) < 1.0) // tolerance of 1 rupee
            {
                System.out.println("Test Passed");                           // ✅ Console output
                L5_ExcelUtils.writePassResult(filePath, "Sheet1", i, 6);       // ✅ Green Pass in Result column
            }
            else
            {
                System.out.println("Test Failed");                           // ✅ Console output
                L5_ExcelUtils.writeFailResult(filePath, "Sheet1", i, 6);       // ✅ Red Fail in Result column
            }

            // ✅ Step 11: Click Clear button for next iteration
            driver.findElement(By.xpath("//img[@class='PL5']")).click();

            Thread.sleep(2000);

        } // end for loop

        driver.quit();

        System.out.println("----------------------------------");
        System.out.println("All Tests Executed Successfully");
    }
}


