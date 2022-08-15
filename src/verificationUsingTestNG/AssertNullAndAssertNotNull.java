package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndAssertNotNull 
{
	
  @Test
  public void myMethod()
  {
	  
	  String a=null;
	  String b="Pune";
	  
	//  Assert.assertNull(a, "Test case is fail");
     // Assert.assertNull(b, "Test case is fail");
	  
     // Assert.assertNotNull(b, "Test case is fail");
	 Assert.assertNotNull(a, "Test case is fail");


	  //Assert.fail();
	  
	  
	  
  }
}
