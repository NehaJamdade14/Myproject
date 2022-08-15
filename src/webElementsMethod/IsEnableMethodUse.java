package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(10000);
		
	   driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(9000);
		
		WebElement mobileNumField = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
    	mobileNumField.sendKeys("7768864266");
    	Thread.sleep(1000);
    	mobileNumField.clear();
		Thread.sleep(1000);
		

		WebElement OTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean result = OTPButton.isEnabled();
		System.out.println(result);
		
		if(result)
		{
			OTPButton.click();
			System.out.println("OTP send successfully");
			
		}
		
		
		else
		{
			mobileNumField.sendKeys("8888298821");
			OTPButton.click();
			System.out.println("Log in successfully");
		}
		
		

	}

}
