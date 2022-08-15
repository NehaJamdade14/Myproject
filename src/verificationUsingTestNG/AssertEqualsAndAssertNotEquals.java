package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsAndAssertNotEquals
{
	
  @Test
  public void myMethod()
  {
	  
	  String a="Pune";
	  String b="Pune";
	  String c="Mumbai";
	  
	  // using Assert class--> (Assert), with its static method-->(assert.)  
	  
	  //Assert.assertEquals(a, c,"Test case fail");
	 // Assert.assertEquals(a, b,"Test case fail");
	  
	  //Assert.assertNotEquals(a, b, "Test case is fail");
	  Assert.assertNotEquals(a, c, "Test case is fail");


	  
  }
}
