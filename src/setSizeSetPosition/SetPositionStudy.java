package setSizeSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		// create object of point class & pass x and y value
		Point p=new Point(100, 80);
		
		// call set position method and pass object of point class
		driver.manage().window().setPosition(p);
		
		System.out.println(driver.manage().window().getPosition());
		
		
		
		
		
	}

}
