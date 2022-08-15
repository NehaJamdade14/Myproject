package kitePOMwithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTestWithExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--headless");
		//opt.addArguments("--disable-notifications");
		opt.addArguments("incognito");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		File myfile=new File("C:\\Users\\PC\\Documents\\Excel_File\\Document.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserId(UN);
		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		login.clickOnLogIn();
		
		Thread.sleep(1000);
		
		KitePinPage pin=new KitePinPage(driver);
		pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickOnButton();
		
		Thread.sleep(1000);
		
		KiteHomePage home=new KiteHomePage(driver);
		home.validateUID(mySheet.getRow(0).getCell(0).getStringCellValue());
		home.clicklogOut();
		
		Thread.sleep(400);
		
		driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
