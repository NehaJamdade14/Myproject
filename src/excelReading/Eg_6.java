package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File myFile=new File("C:\\Users\\PC\\Documents\\Excel_File\\Document.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet2");
		
		// Dynamic coding to read complete excel sheet
		int rowNum = mySheet.getLastRowNum();
		System.out.println("Total number of row are "+rowNum);
		
		 int cellNum = mySheet.getRow(0).getLastCellNum()-1;
		 System.out.println("Total number of cell are "+cellNum);
		 
		 for(int i=0;i<=rowNum;i++)
		 {
			 for(int j=0;j<=cellNum;j++)
			 {
				 String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(value+"    ||    ");
			 }
			 System.out.println();
		 }
		 
		

	}

}
