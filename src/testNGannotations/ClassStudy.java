package testNGannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClassStudy
{
	
  @Test
  public void myMethod() 
  {
	  Reporter.log("Test Method is running",true);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Before Method is running",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("After Method is running",true);
  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("Before Class is running",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("After Class is running",true);

  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("Before Test is running",true);
  }

  @AfterTest
  public void afterTest()
  {
	  Reporter.log("After Test is running",true);
  }
  
  @Test
  public void myMethod1() 
  {
	  Reporter.log("Test Method_1 is running",true);
  }

}
