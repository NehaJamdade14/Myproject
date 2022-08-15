package testNGListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC execution is skipped,check dependent TC ",true);
		Reporter.log("skipped TC is "+result.getName(),true);
		ITestListener.super.onTestSkipped(result);
	}
	
	public void onTestFailure(ITestResult result)
	{
		String TCname=result.getName();
		Reporter.log("TC execution is failed ",true);
		ITestListener.super.onTestFailure(result);
	}
	
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC execution is successful ",true);
		ITestListener.super.onTestSuccess(result);
	}
		

}
