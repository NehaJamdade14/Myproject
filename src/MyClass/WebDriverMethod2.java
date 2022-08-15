package MyClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
        
		Thread.sleep(5000);
		
		     //5. navigate: this method is use to open an application, move forward, backward & refresh the webpage
//        driver.navigate().to("https://www.amazon.in/");
//        
//        Thread.sleep(5000);
//        
//        driver.navigate().back();
//        
//        Thread.sleep(5000);
//        
//        driver.navigate().forward();
//        
//        Thread.sleep(5000);
//        
//        driver.navigate().refresh();
        
        //6. getTitle: this method is use to get title of a webpage. return type of getTitle method is String.
        String title = driver.getTitle();
        System.out.println(title);
        
        System.out.println(driver.getTitle());
        
        
        //7. getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
        
		

	}

}
