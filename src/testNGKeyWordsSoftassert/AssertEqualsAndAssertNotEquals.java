package testNGKeyWordsSoftassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsAndAssertNotEquals
{
	
  @Test
  public void myMethod() 
  {
	  
	  String a="Pune";
	  String b="Mumbai";
	  String c="Pune";
	  
	  SoftAssert s=new SoftAssert();
	  
	  s.assertEquals(a, c, "Test case is fail");
	  
	  s.assertNotEquals(a, b, "Test case is fail");
	  
	  s.assertAll();
	  
  }
}
