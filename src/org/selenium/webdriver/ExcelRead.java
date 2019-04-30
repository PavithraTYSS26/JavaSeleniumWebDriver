package org.selenium.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	Workbook wb;
	Sheet sheet;
	FileInputStream fis;

	public ExcelRead(String path) throws FileNotFoundException {
		fis = new FileInputStream(path);
	}

	public String readData(int s, int r, int c) throws EncryptedDocumentException, InvalidFormatException, IOException {
		wb = WorkbookFactory.create(fis);
		sheet = wb.getSheetAt(s);
		String data = sheet.getRow(r).getCell(c).toString();
		return data;

	}

	public void closeAll() {
		try {
			fis.close();
			wb.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
