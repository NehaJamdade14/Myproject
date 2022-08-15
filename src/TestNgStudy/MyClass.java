package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void mymethod()
  {
	  System.out.println("Printing statement");
	  
	  Reporter.log("Reporter without boolean value");
	  
	  Reporter.log("Reporter with boolean value", true);
  }
}
