package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		//locator link text
		driver.findElement(By.linkText("Gmail")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		//locator partial link text
		driver.findElement(By.partialLinkText("Gma")).click();
	}

}
