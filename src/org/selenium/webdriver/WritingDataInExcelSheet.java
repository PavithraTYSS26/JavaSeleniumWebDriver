package org.selenium.webdriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WritingDataInExcelSheet {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:\\exceldata\firstxl.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheet("Sheet1");
			Row row=sheet.createRow(0);
			Cell cell=row.createCell(0);
			cell.setCellValue("javaselenium");
			FileOutputStream fos=new FileOutputStream("D:\\exceldata\firstxl.xlsx");
			wb.write(fos);
			fos.close();
			//fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
