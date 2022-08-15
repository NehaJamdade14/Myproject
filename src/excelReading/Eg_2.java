package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		File myfile=new File("C:\\Users\\PC\\Documents\\Excel_File\\Document.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		Row myRow = mySheet.getRow(0);
		Cell myCell = myRow.getCell(0);
		CellType cellType = myCell.getCellType();
		System.out.println(cellType);
		
		System.out.println(mySheet.getRow(0).getCell(2).getStringCellValue());
		
		
	}

}
