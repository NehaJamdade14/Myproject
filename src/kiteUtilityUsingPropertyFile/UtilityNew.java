package kiteUtilityUsingPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class UtilityNew
{
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
        FileInputStream myFile=new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\Selenium_Project\\src\\myProperty.properties");
        prop.load(myFile);
	    String value = prop.getProperty(key);
		return value;
	    
	   }
	
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\ScreenShot\\snapshot"+TCID+".png");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		Reporter.log("Screenshot Taken",true);
				
	}

	


}
