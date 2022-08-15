package testNGannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class AnnotationsStudy {
  @Test
  public void validateUserId() 
  {
	  Reporter.log("User Id is Validated", true);
  }
  
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Login done", true);
  }

  @AfterMethod
  public void logout() 
  {
	  Reporter.log("Logout done", true);
  }
  
  @Test
  public void testme() 
  {
	  Reporter.log("Heyy", true);
  }
  

}
