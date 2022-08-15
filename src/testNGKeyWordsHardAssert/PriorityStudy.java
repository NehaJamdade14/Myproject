package testNGKeyWordsHardAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy
{
	
  @Test(priority = 2)
  public void method1()
  {
	  Reporter.log("Method 1 is running", true);
  }
  
  @Test(priority = 5)
  public void method2()
  {
	  Reporter.log("Method 2 is running", true);
  }
  
  @Test(priority = -3)
  public void method3()
  {
	  Reporter.log("Method 3 is running", true);
  }
  
  @Test(priority = 0)
  public void method4()
  {
	  Reporter.log("Method 4 is running", true);
  }
  
  @Test(priority = 3)
  public void method5()
  {
	  Reporter.log("Method 5 is running", true);
  }
  
  @Test(priority = -3)
  public void method6()
  {
	  Reporter.log("Method 6 is running", true);
  }
  
  @Test(priority = -5)
  public void method7()
  {
	  Reporter.log("Method 7 is running", true);
  }
  
}
