package kiteUserIDUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	//1. Data member should be declared globally with access level private using @findBy Annotation
	
		@FindBy(id = "userid") private WebElement userID;
		@FindBy(id = "password") private WebElement password;
		@FindBy(xpath = "//button[@type='submit']") private WebElement logInButton;
		
		//2. Initialize within a constructor with access level using pagefactory class 
		
		public KiteLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3. Methods
		
		public void sendUserId(String UN)
		{
			userID.sendKeys(UN);	
		}
		
		public void sendPassword(String PWD)
		{
			password.sendKeys(PWD);	
		}

	    public void clickOnLogIn()
	    {
	    	logInButton.click();
	    }
		
		
		
		
		
		
		
		
		

}
