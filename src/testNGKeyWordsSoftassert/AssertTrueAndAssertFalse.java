package testNGKeyWordsSoftassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTrueAndAssertFalse
{
	
  @Test
  public void myMethod() 
  {
	  
	  boolean a=true;
	  boolean b=false;
	  
	  SoftAssert s=new SoftAssert();
	  
	  s.assertTrue(a, "Test case is fail");
	  
	  s.assertFalse(b, "Test case is fail");
	  
	  s.assertAll();
	 
	  
  }
}
