package findElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
				
		// find total number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(1000);
		System.out.println("Total number of links are "+links.size());
		Thread.sleep(1000);
		
		// for each loop
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}
		
		System.out.println("===============================================================");

		// find total number of images
		List<WebElement> image = driver.findElements(By.tagName("img"));
		Thread.sleep(1000);
		System.out.println("Total number of images "+image.size());
		Thread.sleep(1000);
		
		//for each loop
		for(WebElement i:image)
		{
			System.out.println(i.getText());
		}


		

	}

}
