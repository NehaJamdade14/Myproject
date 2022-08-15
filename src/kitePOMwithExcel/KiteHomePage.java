package kitePOMwithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	//1.
		@FindBy(xpath = "//span[@class='user-id']") private WebElement uid;
		@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
		
		//2.
		public KiteHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.
		public void validateUID(String expectedUid)
		{
			String actualuid = uid.getText();
			
			if(expectedUid.equals(actualuid))
			{
				System.out.println("Test Case pass");
			}
			
			else
			{
				System.out.println("Test case fail");
			}
		
		}
		
		public void clicklogOut() throws InterruptedException
		{
			uid.click();
			Thread.sleep(2000);
			logOutButton.click();
		}
		
		
		
		
		
		
		
		
		
		
		

}
