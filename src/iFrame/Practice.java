package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
	driver.switchTo().frame("iframeResult");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
	Thread.sleep(1000);
	
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	
	//driver.switchto.frame(string)----> changing focus from from main page to iframe
	//driver.switchTo().parentFrame()-----> switch focus ftom iframe to immidiate parent
	//driver.switchTo().defaultContent()----> switch focus from iframe to main page
	}

}
