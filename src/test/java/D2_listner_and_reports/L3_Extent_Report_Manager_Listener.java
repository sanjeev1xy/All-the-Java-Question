package D2_listner_and_reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class L3_Extent_Report_Manager_Listener implements ITestListener 
{
public ExtentSparkReporter sparkReporter;   // UI of the report
public ExtentReports extent; //Popular common info on the report
public ExtentTest test; //creating test case entries in the report and update status of the methods

public void onStart(ITestContext context) 
{
	sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");

	sparkReporter.config().setDocumentTitle("Automation Report"); //Title of the report
	sparkReporter.config().setReportName("Functional Testing"); // Name of the report
	sparkReporter.config().setTheme(Theme.DARK); // theme of the report
	
	extent=new ExtentReports();
	extent.attachReporter(sparkReporter);
	
	extent.setSystemInfo("Computer Name", "localhost");
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("Tester Name", "Sanjeev");
	extent.setSystemInfo("OS", "Windows 10");
	extent.setSystemInfo("Browser Name", "Chrome");
	
}

public void onTestSuccess(ITestResult result) 
{
	test=extent.createTest(result.getName()); // create new entry in the report
	test.log(Status.PASS, "Test case Passed is: "+result.getName()); //update status p/f/s	
}

public void onTestFailure(ITestResult result) 
{
	test=extent.createTest(result.getName()); // create new entry in the report
	test.log(Status.FAIL, "Test case Failed is: "+result.getName());
	test.log(Status.FAIL, "Test case Failed cause is: "+result.getThrowable()); // to capture the exception in the report
}

public void onTestSkipped(ITestResult result)
{
	test=extent.createTest(result.getName()); 
	test.log(Status.SKIP, "Test case Skipped is: "+result.getName());
}

public void onFinish (ITestContext context)
{
	extent.flush(); // to write or update the report
}
}

