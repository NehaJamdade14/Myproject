package findElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flowers {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("flowers");
		Thread.sleep(1000);
		
		List<WebElement> data = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(data.size());

		//for each loop
		for(WebElement d:data)
		{
			System.out.println(d.getText());
		}
		
		for(WebElement d:data)
		{
			String exptResult="flowers pune";
			String actResult=d.getText();
			
			if(actResult.equals(exptResult))
			{
				d.click();
				break;
			}
		}
        
		driver.findElement(By.linkText("Images")).click();
	}

}
