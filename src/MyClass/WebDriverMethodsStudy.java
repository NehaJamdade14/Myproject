package MyClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsStudy {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		         //WebDriver Methods
		//1. get- to enter url in browser or to open an application.
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		        //2. close: to close the current tab of the browser opened by Selenium tool.
		//driver.close();
		
		        //3. quit: to close the all the tabs present in browser opened by Selenium tool.
		//driver.quit();
		
		       //4. maximize/ minimize() - used to maximize/ minimize the browser
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		


	}

}
