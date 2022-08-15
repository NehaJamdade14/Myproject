package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		// locator using xpath
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
//		//locator using className
//		driver.findElement(By.className("inputs displayed-class"));
//		
//	//locator using id
//		driver.findElement(By.id("displayed-text"));
//		
//		//locator using name
//		driver.findElement(By.name("show-hide"));
	
//		//show button
	WebElement showButton = driver.findElement(By.id("show-textbox"));
		
		//hide button
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		
		hideButton.click();
		Thread.sleep(2000);
		
		if(textBox.isDisplayed())
		{
			System.out.println("text box is displayed");
			textBox.sendKeys("Welcome");
			Thread.sleep(2000);
		}
		
		else
		{
			System.out.println("text box is not displayed, click on show button");
			showButton.click();
			Thread.sleep(1000);
			textBox.sendKeys("Welcome Again");
			
		
	}


	}

}
