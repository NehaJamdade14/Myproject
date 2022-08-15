package testNGKeyWordsSoftassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullAndAssertNotNullStudy
{
	
  @Test
  public void myMethod() 
  {
	  
	  String a="Pune";
	  String b=null;
	  
	  //object created of soft assert
	  SoftAssert s=new SoftAssert();
	  
	  s.assertNull(b, "Test case is fail");
	  s.assertNotNull(a, "Test case is fail");

	  s.assertAll();
	  
	 
  }
}
