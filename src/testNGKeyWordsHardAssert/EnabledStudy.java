package testNGKeyWordsHardAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledStudy
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
	  
	  @Test(enabled = false)
	  public void method3()
	  {
		  Reporter.log("Method 3 is running", true);
	  }
	  
	  @Test
	  public void method4()
	  {
		  Reporter.log("Method 4 is running", true);
	  }
	  
	  @Test
	  public void method5()
	  {
		  Reporter.log("Method 5 is running", true);
	  }
	  
}
