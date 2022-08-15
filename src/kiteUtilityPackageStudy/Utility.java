package kiteUtilityPackageStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utility
{
	
	public static String readDataFromExcel(int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		
        File myFile=new File("C:\\Users\\PC\\Documents\\Excel_File\\Document.xlsx");
        Reporter.log("Reading data from excel",true);
	    String value = WorkbookFactory.create(myFile).getSheet("Sheet4").getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	    
	   }
	
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\ScreenShot\\snapshot"+TCID+".png");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		Reporter.log("Screenshot Taken",true);
				
	}

	


}
