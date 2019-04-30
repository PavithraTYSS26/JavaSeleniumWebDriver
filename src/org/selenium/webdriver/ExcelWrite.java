package org.selenium.webdriver;

import java.io.*;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	FileInputStream fis=null;
	FileOutputStream fos=null;
	Workbook wb=null;
	Sheet sheet=null;
	public ExcelWrite(String path) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		fis=new FileInputStream(path);
		fos=new FileOutputStream(path);
		wb=WorkbookFactory.create(fis);
		
	}
	public  void writeData(String s,int rowno,int colno,String data) throws IOException 
	{
		sheet=wb.createSheet(s);
		sheet.createRow(rowno).createCell(colno).setCellValue("one");
		
	}

}

