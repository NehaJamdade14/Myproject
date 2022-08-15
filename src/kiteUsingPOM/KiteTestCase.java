package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestCase {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		KiteLogInPage login=new KiteLogInPage(driver);
		
		login.sendUserId();
		login.sendPassword();
		login.clickOnLogIn();
		
		Thread.sleep(200);
		
		KitePinPage pin=new KitePinPage(driver);
		
		pin.sendPin();
		pin.clickOnButton();
		
		Thread.sleep(200);
		
		KiteHomePage home=new KiteHomePage(driver);
		
		home.validateUID();
		home.clicklogOut();
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
