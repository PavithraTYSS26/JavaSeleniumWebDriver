package org.selenium.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData  {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException  {
		
		
	
		FileInputStream fis=new FileInputStream("D:\\exceldata\\Book2.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet("Sheet1");
		String[] str= {"one","two","three","four","five"};
		
		int j=10;
		for(int i=0;i<str.length;i++)
			{
			s.createRow(j++).createCell(0).setCellValue(str[i]);
			}
			
		
		FileOutputStream fos=new FileOutputStream("D:\\exceldata\\Book2.xlsx");
		w.write(fos);
	Thread.sleep(1000);	
	w.close();
	fis.close();
	fos.close();
	
	
		
		}

}
