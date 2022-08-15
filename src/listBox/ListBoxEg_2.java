package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(2000);
		
		// 1. identify & store in reference variable
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		// 2. create object of select class
		Select s1=new Select(year);
		
		// 3. use any of select method
		    //  s1.selectByVisibleText("2017");
		     
		     //System.out.println(s1.isMultiple());
		     
		     // using for loop : multiple times operation
		     
		     for(int i=0;i<=9;i++)
		     {
		    	 s1.selectByIndex(i);
		    	 Thread.sleep(400);
		    	 
		     }
		     
		     for(int i=9;i>=0;i--)
		     {
		    	 s1.selectByIndex(i);
		    	 Thread.sleep(400);
		    	 
		     }      
		     
		     WebElement month = driver.findElement(By.id("month"));
		     
		     Select s2=new Select(month);
		     System.out.println(s2.isMultiple());
		     
		     s2.selectByIndex(1);
		     
		     for(int i=0;i<=9;i++)
		     {
		    	 s2.selectByIndex(i);
		    	 Thread.sleep(400);
		    	 
		     }
		     
		     for(int i=9;i>=0;i--)
		     {
		    	 s2.selectByIndex(i);
		    	 Thread.sleep(400);
		    	 
	
	    }

	}
}
