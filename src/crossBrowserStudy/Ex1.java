package crossBrowserStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex1
{
	@Parameters("browserName")
	
  @Test
  public void myMethod(String Bname)
  {
	  WebDriver driver = null;
	  
	  if(Bname.equals("chrome"))
	  {
	
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();

	  }
	  
	  else if(Bname.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
  }
}
