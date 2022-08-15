package kiteBaseClassUsingPropertyFile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import kiteUtilityPackageStudy.Utility;
import kiteUtilityUsingPropertyFile.UtilityNew;

public class BaseNew
{
	protected static WebDriver driver;
	public void openApp() throws IOException
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(UtilityNew.readDataFromPropertyFile("URL"));
			Reporter.log("Launching kite App", true);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	public static void takeScreenshot(String TCName) throws IOException
	{
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\ScreenShot\\snapshot"+TCName+".png");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
				
	}

}
