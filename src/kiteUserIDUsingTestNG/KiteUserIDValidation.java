package kiteUserIDUsingTestNG;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteUserIDValidation
{
	
	WebDriver driver;
	File myFile;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching kite App", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
        myFile=new File("C:\\Users\\PC\\Documents\\Excel_File\\Document.xlsx");
	    mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
	    login=new KiteLoginPage(driver);
	    pin=new KitePinPage(driver);
	    home=new KiteHomePage(driver);
        
	}
	
	@BeforeMethod
	public void loginToKite()
	{
		
		login.sendUserId(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Entering user ID ",true);
		
		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Entering password ",true);
		
		login.clickOnLogIn();
		Reporter.log("clicking on login button ",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Entering pin ",true);
		
		pin.clickOnButton();
		Reporter.log("clicking on continue button ",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}
	
  @Test
  public void validateUserID()
  {
	  
	  String expectedId=mySheet.getRow(0).getCell(0).getStringCellValue();
	  String actualId=home.getActualUserId();
	  Reporter.log("Validating actual user id and expected user id ",true);
	  
	  Assert.assertEquals(actualId, expectedId, "TC is fail");
	  Reporter.log("Validating actual user id and expected user id---> TC is pass ",true);
	  
  }
  
  @AfterMethod
  public void logoutKiteApp() throws InterruptedException
  {
	  
	  home.clicklogOut();
	  Reporter.log("Clicking on logout button",true);
	  
	  Thread.sleep(2000);

  }
  
  @AfterClass
  public void closeBrowser()
  {
	  
	  Reporter.log("Closing Browser",true);
	  driver.close();

  }
  
  
  
}
