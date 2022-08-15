package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
        File myFile=new File("C:\\Users\\PC\\Documents\\Excel_File\\Document.xlsx");
        
        Workbook myWorkBook = WorkbookFactory.create(myFile);
        Sheet mySheet = myWorkBook.getSheet("Sheet1");
        
        // reading numeric value
        double numericValue = mySheet.getRow(1).getCell(0).getNumericCellValue();
        System.out.println(numericValue);
        
        // reading boolean value
        boolean booleanValue = mySheet.getRow(1).getCell(2).getBooleanCellValue();
        System.out.println(booleanValue);
        
        // reading String cell value
        Cell myCell = mySheet.getRow(2).getCell(0);
        System.out.println(myCell.getCellType());
        
        System.out.println(myCell.getStringCellValue());


        
        
        
	}

}
