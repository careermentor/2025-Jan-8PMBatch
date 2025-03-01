package firstjavaPkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FileHandling_Excel 
{

	public static void readexcel() throws Exception
	{
		File f = new File("C:\\TestData\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("DataSheet");
		
		int nr = sh.getPhysicalNumberOfRows();  //4
		
		for(int i=0; i<nr; i++)
		{
			XSSFRow row = sh.getRow(i);  //i=0
			
			int nc = row.getPhysicalNumberOfCells(); //2
			
			for(int j=0; j<nc; j++)
			{
				
				XSSFCell col = row.getCell(j);  //j=0
				
				if(col.getCellType()==CellType.STRING)
				{
					
					System.out.print(col.getStringCellValue() + "   ");
					
				}
				
				else if(col.getCellType()==CellType.NUMERIC)
				{
					System.out.println(col.getNumericCellValue() + "  ");
					
					
				}
				
				else if(col.getCellType()==CellType.BOOLEAN)
				{
					System.out.println(col.getBooleanCellValue() + "  ");
					
					
				}
				
				
			}
			
			System.out.println();
			
		}
		
		
		/*
		
		XSSFRow row1 = sh.getRow(0); // first row
		XSSFCell col1 = row1.getCell(0);  //first column
		String rowcol1 = col1.getStringCellValue();
		System.out.print(rowcol1 + "   ");
		
		XSSFCell col2 = row1.getCell(1);  //second column
		String rowcol2 = col2.getStringCellValue();
		System.out.println(rowcol2);
		
		XSSFRow row2 = sh.getRow(1); // second row
		XSSFCell col21 = row2.getCell(0);  //first column
		String rowcol21 = col21.getStringCellValue();
		System.out.print(rowcol21 + "   ");
		
		XSSFCell col22 = row2.getCell(1);  //second column
		String rowcol22 = col22.getStringCellValue();
		System.out.print(rowcol22 + "   ");

		
		XSSFCell col23 = row2.getCell(2);  //third column column
		String rowcol23 = col23.getStringCellValue();
		System.out.println(rowcol23);
		
		*/
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		readexcel();
	}
	
}
