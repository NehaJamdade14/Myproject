package kiteBasePackageStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base
{
	protected WebDriver driver;
	public void openApp()
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Reporter.log("Launching kite App", true);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
