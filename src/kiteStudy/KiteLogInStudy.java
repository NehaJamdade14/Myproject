package kiteStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLogInStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
	    driver.findElement(By.id("userid")).sendKeys("ELR321");
		Thread.sleep(200);
		driver.findElement(By.id("password")).sendKeys("Dhana1111");
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(200);
		driver.findElement(By.id("pin")).sendKeys("982278");
		Thread.sleep(100);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement UID = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String expectedUID = "ELR321";
		String actualUID = UID.getText();
		
		if(expectedUID.equals(actualUID))
		{
			System.out.println("Test Case is pass");
		}
		
		else
		{
			System.out.println("Test Case is fail");
		}
		
		UID.click();
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();

	}

}
