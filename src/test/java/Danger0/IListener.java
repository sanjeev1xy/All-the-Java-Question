package Danger0;

public interface IListener 
{
	void duringTest();
	
	void afterTest();
	
	void beforeTest();
	
	void generate();

}

/*
In Java Selenium/TestNG, a Listener is used to listen and track 
the execution of test cases automatically.
It helps to:-
-------------
Generate reports
Take screenshots on failure
Log test execution
Customize test behavior

Types of Listeners in TestNG
1. ITestListener:-
------------------
Used to track test case execution.
Common Methods:-
----------------
onTestStart() → When test starts
onTestSuccess() → When test passes
onTestFailure() → When test fails
onTestSkipped() → When test is skipped

Use:-
-----
Screenshot on failure
Logging
Reporting

2. ISuiteListener:-
-------------------
Used to track the entire test suite execution.
Methods:-
---------
onStart() → Before suite starts
onFinish() → After suite finishes

Use:-
-----
Database connection
Start/end report generation

3. IInvokedMethodListener:-
----------------------------
Used before and after every method execution.
Methods:-
---------
beforeInvocation()
afterInvocation()

Use:-
-----
Method-level logging
Custom validation

4. IExecutionListener:-
-----------------------
Used before and after complete TestNG execution.
Methods:-
---------
onExecutionStart()
onExecutionFinish()

Use:-
-----	
Framework initialization
Cleanup activities

5. IReporter:-
--------------
Used to create custom reports after execution.

Use:-
-----
Generate HTML/PDF/Excel reports

6. IAnnotationTransformer:-
---------------------------
Used to modify TestNG annotations at runtime.

Use:-
-----
Change retry logic
Change test configuration dynamically
*/