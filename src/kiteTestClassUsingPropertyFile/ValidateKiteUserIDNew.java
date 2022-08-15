package kiteTestClassUsingPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteBaseClassUsingPropertyFile.BaseNew;
import kiteBasePackageStudy.Base;
import kitePOMPackageStudy.KiteHomePage;
import kitePOMPackageStudy.KiteLoginPage;
import kitePOMPackageStudy.KitePinPage;
import kiteUtilityPackageStudy.Utility;
import kiteUtilityUsingPropertyFile.UtilityForFailTC;
import kiteUtilityUsingPropertyFile.UtilityNew;

@Listeners(testNGListener.Listener.class)
public class ValidateKiteUserIDNew extends BaseNew
{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openApp();
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		
	}
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException
	{
		login.sendUserId(UtilityNew.readDataFromPropertyFile("UN"));
		login.sendPassword(UtilityNew.readDataFromPropertyFile("PWD"));
		login.clickOnLogIn();
		
        UtilityForFailTC.implicitWait(driver, 200);		
		pin.sendPin(UtilityNew.readDataFromPropertyFile("PIN"));
		pin.clickOnButton();
        UtilityForFailTC.implicitWait(driver, 200);		

	}
	
  @Test
  public void kiteUserValidation() throws EncryptedDocumentException, IOException 
  {
	  
	  String actualUserID=home.getActualUserID();
	  String expectedUserID=UtilityForFailTC.readDataFromPropertyFile("UN");
	  Assert.assertEquals(actualUserID, expectedUserID,"TC is fail");
	  Reporter.log("TC is pass",true);
	//  Utility.captureScreenShot(driver, TCID);
	  
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
