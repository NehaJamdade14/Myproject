package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(1000);
		
		      //    FOR SELECTING THE DAY
		//1.object of Actions class
		Actions act=new Actions(driver);
		
		//2. find element n store in ref variable
		WebElement day = driver.findElement(By.id("day"));
		
		//3. actions method
		act.click(day).perform();
		Thread.sleep(1000);
	/*	act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();       */
		
		for(int i=1;i<=4;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		
		          // FOR SELECTING THE MONTH
		//1.object of Actions class
		Actions act1=new Actions(driver);
		
		//2. find element n store in ref variable
		WebElement month = driver.findElement(By.id("month"));
		
		//3. actions method
		act1.click(month).perform();
		Thread.sleep(1000);
		
		for(int i=1;i<=2;i++)
		{
			act1.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		act1.sendKeys(Keys.ENTER).perform();
				
		
		         // FOR SELECTING THE YEAR
		//1.object of Actions class
				Actions act2=new Actions(driver);
				
				//2. find element n store in ref variable
				WebElement year = driver.findElement(By.id("year"));
				
				//3. actions method
				act2.click(year).perform();
				Thread.sleep(1000);
				
				for(int i=1;i<=22;i++)
				{
					act2.sendKeys(Keys.ARROW_DOWN).perform();
					Thread.sleep(1000);
				}
				Thread.sleep(1000);
				act2.sendKeys(Keys.ENTER).perform();
						
	}

}
