package MyClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my1stClass {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php");
		//driver.get("https://www.amazon.in/");
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.findElement(By.id("dropdown-class-example")).sendKeys("option3");
	    //driver.findElement(By.id("autocomplete")).sendKeys("Neha");
	    
	    
	    // xpath by attribute
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("15/6/2022");
	    
	    // xpath by text
	    driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	    
	    // xpath by contains with attribute
	    driver.findElement(By.xpath("//input[contains(@id,'autocomplete')]")).sendKeys("Hello");
	    
	    // xpath by contains with text
	    driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate Training Center')]")).click();
	    
	    
	    
	    
	    
	    
	
	    
	    

	}

}
