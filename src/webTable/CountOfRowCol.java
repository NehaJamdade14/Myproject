package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfRowCol {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//how to find no of row
		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("No of rows in the table are "+noOfRows.size());
		
		//how to find no of columns
		List<WebElement> noOfColumns = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		System.out.println("No of columns in table are "+noOfColumns.size());
		
		//to print header of table
		for(WebElement c:noOfColumns)
		{
			System.out.print(c.getText()+" || ");
		}
		System.out.println();
		
		//to print row
		for(WebElement r:noOfRows)
		{
			System.out.println(r.getText()+" || ");
		}
		System.out.println();
		
	}

}
