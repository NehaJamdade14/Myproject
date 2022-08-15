package testNGKeyWordsHardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudy 
{
	 @Test
	  public void method1()
	  {
		  Reporter.log("Method 1 is running", true);
	  }
	  
	  @Test
	  public void method2()
	  {
		  Reporter.log("Method 2 is running", true);
	  }
	  
	  @Test
	  public void method3()
	  {
		  //Assert.fail();

		  Reporter.log("Method 3 is running", true);
	  }
	  
	  @Test(timeOut = 7000)   //(timeOut = 3000)
	  public void method4() throws InterruptedException
	  {
		  Thread.sleep(5000);
		  Reporter.log("Method 4 is running", true);
	  }
	  
	  @Test
	  public void method5()
	  {
		 // Assert.fail();
		  
		  Reporter.log("Method 5 is running", true);
	  }
}
