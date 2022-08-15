package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Users\\PC\\Documents\\Excel_File\\Document.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet3");
		
		int rowNum = mySheet.getLastRowNum();
		System.out.println("Total row number are "+rowNum);
		
		int cellNum = mySheet.getRow(0).getLastCellNum()-1;
		System.out.println("Total cell number are "+cellNum);
		
		// reading all data using dynamic code
		
		for(int i=0;i<=rowNum;i++)
		{
			for(int j=0;j<=cellNum;j++)
			{
				Cell myCell = mySheet.getRow(i).getCell(j);
				CellType myCellType = myCell.getCellType();
				
				if(myCellType==CellType.STRING)
				{
					String value = myCell.getStringCellValue();
					System.out.println(value+" ");
				}
				
				else if (myCellType==CellType.NUMERIC)
				{
					double value = myCell.getNumericCellValue();
					System.out.println(value+" ");
				}
				
				else if (myCellType==CellType.BOOLEAN)
				{
					boolean value = myCell.getBooleanCellValue();
					System.out.println(value+" ");
				}
				
				else if(myCellType==CellType.BLANK)
				{
					
				}
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
