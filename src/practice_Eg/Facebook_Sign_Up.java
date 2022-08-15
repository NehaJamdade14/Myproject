package practice_Eg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Sign_Up {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manaswi");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Limkar");
		Thread.sleep(1000);

		
		driver.findElement(By.name("reg_email__")).sendKeys("8647837536");
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("pass1234");
		Thread.sleep(1000);

		
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(1000);

		
		Select s=new Select(day);
		
		for(int i=0;i<=7;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(1000);
		
		Select s1=new Select(month);
		for(int i=7;i<=11;i++)
		{
			s1.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		
		WebElement year = driver.findElement(By.id("year"));
		Thread.sleep(1000);
		
		Select s2=new Select(year);
		for(int i=0;i<=5;i++)
		{
			s2.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		String idOfChildWindow = driver.getWindowHandle();
		System.out.println("Id of child window --->  "+idOfChildWindow);
		
		

		
	}

}
