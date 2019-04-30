package org.selenium.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadTestData  {
	

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	CreateFile cf=new CreateFile("D:\\frameworkclasses\\ExcelRead.txt");
	cf.cf();
	ExcelRead excel=new ExcelRead("D:\\exceldata\\Book2.xlsx");
	
	System.out.println(excel.readData(0, 0, 0));
	excel.closeAll();
	
	}

}


