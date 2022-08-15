package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		Thread.sleep(2000);
		
		if(checkBox.isSelected())
		{
			System.out.println("Check box is already selected");
			
		}
		
		else
		{
			checkBox.click();
			System.out.println("Check box is selected now");
		}

		
	}

}
