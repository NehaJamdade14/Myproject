package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
			
		// to set size we need to create object of dimension class & pass width and height as parameters
		
		Dimension d=new Dimension(800, 80);
		
		//call setSize method which will ask you object of dimension class
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());


	}

}
