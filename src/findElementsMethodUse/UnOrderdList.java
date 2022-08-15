package findElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderdList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("royal");
		Thread.sleep(1000);
		
	  List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	  
	  System.out.println(result.size());
	  
	  //for each loop
	  for(WebElement r:result)
		{
			System.out.println(r.getText());
		}
	  
	  for(WebElement r:result)
	  {
		  String expectedResult="royal enfield classic 350";
		  String actualText=r.getText();
		  
		  if(actualText.equals(expectedResult))
		  {
			  r.click();
			  break;
		  }
		  
	  }
	  driver.findElement(By.linkText("Images")).click();
		

	}

}
