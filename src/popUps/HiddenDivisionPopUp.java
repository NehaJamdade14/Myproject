package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import webElementsMethod.SendKeysUse;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("I");
		Thread.sleep(200);
		driver.findElement(By.name("q")).sendKeys("_");
		Thread.sleep(200);
		driver.findElement(By.name("q")).sendKeys("p");
		Thread.sleep(200);
		driver.findElement(By.name("q")).sendKeys("h");
		Thread.sleep(200);
		driver.findElement(By.name("q")).sendKeys("o");
		Thread.sleep(200);
		driver.findElement(By.name("q")).sendKeys("n");
		Thread.sleep(200);
		driver.findElement(By.name("q")).sendKeys("e");
		Thread.sleep(200);
		driver.findElement(By.name("q")).sendKeys(" ");
		Thread.sleep(200);
		driver.findElement(By.name("q")).sendKeys("1");
		Thread.sleep(200);
		driver.findElement(By.name("q")).sendKeys("2");
		Thread.sleep(200);
	   
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();


	}

}
