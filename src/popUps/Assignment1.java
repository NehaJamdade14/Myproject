package popUps;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		//id of main page
		String idMain = driver.getWindowHandle();
		System.out.println(idMain);
		
		//id of both
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		
		//set to array list
		ArrayList<String> a=new ArrayList<String>(allId);
		
		String newMainPage = a.get(0);
		String childId = a.get(1);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\PC\\Documents\\Excel_File\\ss.png");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		//switch from main to child
		driver.switchTo().window(childId);
		Thread.sleep(1000);
		
      File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      
      String random=RandomString.make(3);
		
		File dest1=new File("C:\\Users\\PC\\Documents\\Excel_File\\ss\\ss"+random+".png");
		
		org.openqa.selenium.io.FileHandler.copy(src1, dest1);
		
		driver.switchTo().defaultContent();
		
		
				
				
		
		
	}

}
