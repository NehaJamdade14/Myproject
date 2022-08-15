package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickOrRightClick {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//1. create object of Actions class & pass driver object as parameters
		Actions act=new Actions(driver);
		
		//2. find the elements to be worked & store in reference variable
		WebElement rightClickButton = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		//3. take the required action
		//act.contextClick(rightClickButton).perform();
		act.moveToElement(rightClickButton).contextClick().build().perform();
		
	}

}
