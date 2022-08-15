package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Users\\PC\\Documents\\Excel_File\\Document.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.print(value+" || ");
		
		String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.print(value1);
	}

}
