package crossBrowserStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxStudy 
{
	
  @Test
  public void f() 
  {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  
  }
}
