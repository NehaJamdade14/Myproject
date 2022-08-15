package kiteStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserIdExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		File myfile=new File("C:\\Users\\PC\\Documents\\Excel_File\\Document.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		
		String uid = mySheet.getRow(0).getCell(0).getStringCellValue();
		String pwd = mySheet.getRow(0).getCell(1).getStringCellValue();
		  String pin = mySheet.getRow(0).getCell(2).getStringCellValue();
		Thread.sleep(1000);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userID.sendKeys(uid);
		password.sendKeys(pwd);
		logIn.click();
		Thread.sleep(1000);
		
		WebElement myPin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
	    myPin.sendKeys(pin);
	    continueButton.click();
	    Thread.sleep(300);
	    
	    WebElement id = driver.findElement(By.xpath("//span[@class='user-id']"));
	    
	    String expectedUserId = "ELR321";
	    String actualUserId = id.getText();
		
	    if(expectedUserId.equals(actualUserId))
	    {
	    	System.out.println("Test Case Pass");
	    }
	
	    else
	    {
	    	System.out.println("Test Cse Fail");
	    }
	    
	    id.click();
	    Thread.sleep(200);
	    driver.findElement(By.xpath("//a[@target='_self']")).click();
	    Thread.sleep(2000);
	    driver.close();
	    
		


	}

}
