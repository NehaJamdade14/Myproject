package testNGKeyWordsHardAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InnvocationCountStudy
{
	
	// it is working like a for loop by using InvocationCount keyword
	
  @Test (invocationCount = 5)
  public void myMethod()
  {
	  Reporter.log("MyMethod is running",true);
	  
  }
}
