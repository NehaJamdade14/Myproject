package testNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGrouping1
{
	
	@Test(groups = {"sanity"})
	  public void method1()
	  {
		  Reporter.log("Method 1 is running",true);
	  }
	  
	  @Test(groups = {"regression"})
	  public void method2()
	  {
		  Reporter.log("Method 2 is running",true);
	  }
	  
	  @Test
	  public void method3()
	  {
		  Reporter.log("Method 3 is running",true);
	  }
}
