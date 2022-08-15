package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
        File myFile=new File("C:\\Users\\PC\\Documents\\Excel_File\\Document.xlsx");
        
        Workbook myWorkBook = WorkbookFactory.create(myFile);
        Sheet mysheet = myWorkBook.getSheet("Sheet2");
        
        //multiple data from single row
        for(int i=0;i<=2;i++)
        {
        String value = mysheet.getRow(0).getCell(i).getStringCellValue();
        System.out.println(value);
        }
        
        System.out.println("=================");
        
        //multiple data from single column
        for(int i=0;i<=1;i++)
        {
        	 String value1=mysheet.getRow(i).getCell(0).getStringCellValue();
             System.out.println(value1);
        }
        
        
	}

}
