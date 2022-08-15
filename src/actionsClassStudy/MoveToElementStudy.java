package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		// 1. to take mouse actions, need to create object of Actions class & pass webDriver object as parameter
		Actions act=new Actions(driver);
		
		//find element to be act
		WebElement abtUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		Thread.sleep(1000);
		
		// now take action and perform
		act.moveToElement(abtUs).perform();
		
		//abtUs.click(); // using web element method
		
		//click method using action class
		//act.click().perform();
		
		//click to click on radio button
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		act.moveToElement(radio1).perform();
		act.click().perform();
		
		act.moveToElement(radio1).click().build().perform();
		act.click(radio1).perform();
	
	}

}
