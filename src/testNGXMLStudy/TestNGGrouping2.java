package testNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGrouping2
{
	
	@Test(groups = {"sanity","regression"})
	  public void method4()
	  {
		  Reporter.log("Method 4 is running",true);
	  }
	  
	  @Test(groups = {"regression"})
	  public void method5()
	  {
		  Reporter.log("Method 5 is running",true);
	  }
	  
	  @Test
	  public void method6()
	  {
		  Reporter.log("Method 6 is running",true);
	  }
}
