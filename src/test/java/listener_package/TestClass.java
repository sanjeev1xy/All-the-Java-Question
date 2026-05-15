package listener_package;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener_package.ITestlistnerClass.class)  // ✅ Corrected line
public class TestClass 
{
    @Test
    public void testMethod1()
    {
        System.out.println("I am inside testMethod1");
    }

    @Test
    public void testMethod2() 
    {
        System.out.println("I am inside testMethod2");
        //Assert.assertTrue(false);  // will fail → triggers onTestFailure
        Assert.assertTrue(true);
    }

    @Test(timeOut = 3000)
    public void testMethod3() throws InterruptedException 
    {
        Thread.sleep(1000);  // will exceed timeout → triggers onTestFailedWithTimeout
        System.out.println("I am inside testMethod3");
    }

    @Test(dependsOnMethods = "testMethod3")
    public void testMethod4()
    {
        System.out.println("I am inside testMethod4");
    }
}
