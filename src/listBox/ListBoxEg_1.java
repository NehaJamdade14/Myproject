package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		// 1. Identify list box to be handled and store it in reference variable
		
		WebElement listBox = driver.findElement(By.id("dropdown-class-example"));
		
		// 2. create an object of select class which will accept WebElement argument
		
		Select s=new Select(listBox);
		
		/*          3. By using one of the select class methods we can select values from list box , Eg;-
		                          1. select ByVisibleText:selectByVisibleText(String arg0)
		                          2. select ByIndex:selectByIndex(int arg0)
		                          3. select ByValue:selectByValue(String arg0)          */


        //  1. select ByVisibleText:selectByVisibleText(String arg0)
		// s.selectByVisibleText("Option2");
		
       //   2. select ByIndex:selectByIndex(int arg0)
       //  s.selectByIndex(2);
        
       //   3. select ByValue:selectByValue(String arg0)          */
         s.selectByIndex(3);

	}

}
