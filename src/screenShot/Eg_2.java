package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Eg_2 {

	public static void main(String[] args) throws IOException
	{																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random= RandomString.make(4);
	//	System.out.println(random);
		File destination= new File("C:\\ScreenShot\\snapshot"+random+".png");
		org.openqa.selenium.io.FileHandler.copy(source, destination);


	}

}