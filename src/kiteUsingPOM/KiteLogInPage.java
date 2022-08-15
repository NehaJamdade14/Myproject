package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage
{
	
	//1. Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement logInButton;
	
	//2. Initialize within a constructor with access level using pagefactory class 
	
	public KiteLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. utilize within a method with access level public
	
	public void sendUserId()
	{
		userID.sendKeys("ELR321");	
	}
	
	public void sendPassword()
	{
		password.sendKeys("Dhana1111");	
	}

    public void clickOnLogIn()
    {
    	logInButton.click();
    }
	
	
}
