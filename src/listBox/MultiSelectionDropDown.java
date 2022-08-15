package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		
		// 1. identify & store in reference variable
		     WebElement multiSelect = driver.findElement(By.id("cars"));
		     
		    // create object of select 
		     Select s=new Select(multiSelect);
		     Thread.sleep(400);
		     
				// check if this multi selectable or not
		     System.out.println(s.isMultiple());
		     
		     s.selectByIndex(0);
		     Thread.sleep(400);
		     
		     s.selectByVisibleText("Opel");
		     Thread.sleep(400);

		     s.selectByValue("audi");
		     Thread.sleep(400);
		     
		     
		     // deselect any value
		     
		     s.deselectAll();
		     

		     
		     

		     
	}

}
