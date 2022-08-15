package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndAssertFalse 
{
	
  @Test
  public void myMethod()
  {
	  
	  boolean a=true;
	  boolean b=false;
	  
	//  Assert.assertTrue(a, "Test case is fail");
	 //Assert.assertTrue(b, "Test case is fail");
	  
	 // Assert.assertFalse(b, "Test case is fail");
	  Assert.assertFalse(a, "Test case is fail");


	  
  }
}
