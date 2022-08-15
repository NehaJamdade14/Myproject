package testNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestXML1
{
	
  @Test
  public void method1()
  {
	  Reporter.log("Method 1 is running",true);
  }
  
  @Test
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
