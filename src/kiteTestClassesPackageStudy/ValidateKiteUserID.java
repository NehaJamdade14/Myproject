package kiteTestClassesPackageStudy;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBasePackageStudy.Base;
import kitePOMPackageStudy.KiteHomePage;
import kitePOMPackageStudy.KiteLoginPage;
import kitePOMPackageStudy.KitePinPage;
import kiteUtilityPackageStudy.Utility;

public class ValidateKiteUserID extends Base
{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser()
	{
		openApp();
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		
	}
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException
	{
		login.sendUserId(Utility.readDataFromExcel(0, 0));
		login.sendPassword(Utility.readDataFromExcel(0, 1));
		login.clickOnLogIn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.readDataFromExcel(0, 2));
		pin.clickOnButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}
	
  @Test
  public void kiteUserValidation() throws EncryptedDocumentException, IOException 
  {
	  
	  String TCID="1234";
	  Assert.assertEquals(home.getActualUserID(), Utility.readDataFromExcel(0, 0),"TC is fail");
	  Utility.captureScreenShot(driver, TCID);
	  
  }
  
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
	  
	  home.clicklogOut();
	  
  }

  @AfterClass
  public void closeBrowser()
  {
	  
	  driver.close();
  }
}
