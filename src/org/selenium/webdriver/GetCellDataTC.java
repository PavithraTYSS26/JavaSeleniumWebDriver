package org.selenium.webdriver;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellDataTC {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException  {
		System.out.println(getCellData("pavi","kavi"));
	}
	public static String getCellData(String testCaseName,String colName) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String excelpath="C:\\Users\\Admin\\Desktop\\pavikavi.xlsx";
		FileInputStream fis=new FileInputStream(excelpath);
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet1");
		Row row=null;
		int rowIndex=-1;
		int colIndex=-1;
	
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			if(testCaseName.equals(sh.getRow(i).getCell(0).getStringCellValue()))
			{
				row=sh.getRow(i);
				rowIndex=i;
				System.out.println(row.getCell(i).getStringCellValue());
				
				for(int j=0;j<sh.getRow(rowIndex).getPhysicalNumberOfCells();j++)
				{
					if(colName.equals(sh.getRow(rowIndex).getCell(j).getStringCellValue()))
					colIndex=j;
				}
			}
				
		}
		System.out.println(sh.getRow(rowIndex).getLastCellNum());
		System.out.println("RowNumber = "+rowIndex);
		System.out.println("ColumnNumber = "+colIndex);
		String data=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
	    return data;
	}
}
