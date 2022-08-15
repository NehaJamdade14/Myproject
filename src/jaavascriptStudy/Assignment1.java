package jaavascriptStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
	    Thread.sleep(200);
	    
    	WebElement value = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	    je.executeScript("arguments[0].scrollIntoView();", value);
	    value.sendKeys("Velocity");
	    Thread.sleep(500);
	    
	    WebElement checkBoxButton = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
	    je.executeScript("arguments[0].scrollIntoView();", checkBoxButton);
	    checkBoxButton.click();
	    Thread.sleep(500);

	    WebElement text = driver.findElement(By.xpath("//legend[contains(text(),'Web Table Example')]"));
	    je.executeScript("arguments[0].scrollIntoView();", text);
	    System.out.println(text.getText());
	    Thread.sleep(500);
	    
	    WebElement droplist = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	     Select s=new Select(droplist);
	     je.executeScript("arguments[0].scrollIntoView();", s);
	     s.selectByValue("option2");
	     Thread.sleep(500);
	     
//	     String win = driver.getWindowHandle();
//	     je.executeScript("arguments[0].scrollIntoView();", win);
//	     System.out.println(win);
//	     
	     String url = driver.getCurrentUrl();
	     System.out.println(url);
	     
	}

}
