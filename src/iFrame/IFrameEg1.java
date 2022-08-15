package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		// selenium focuses default on main page
		//we need to switch selenium focus from main page to frame
		
		driver.switchTo().frame("iframeResult"); //change focus from main page to iframe
	
		Thread.sleep(2000);
		
		// this element present in iframe
		driver.findElement(By.xpath("//button[contains(text(),' Date and Time.')]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		
		

	}

}
