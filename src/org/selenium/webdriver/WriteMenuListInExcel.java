package org.selenium.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WriteMenuListInExcel {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("D:\\exceldata\\Book2.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet("Sheet1");
		
	System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.urbanladder.com");
	Actions act=new Actions(driver);
	
   WebElement sale=driver.findElement(By.xpath("//div[@id='topnav_wrapper']/descendant::li/span[contains(.,'Collections')]"));
   Thread.sleep(2000);
   act.moveToElement(sale).build().perform();
   Thread.sleep(5000);
  
    
   System.out.println(sale.getText());
    s.createRow(263).createCell(0).setCellValue(sale.getText());
 
	
	int i=264;
    List<WebElement> menu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::li/span[contains(.,'Collections')]/following-sibling::div/descendant::a"));
    for(WebElement ele:menu)
    {
      Thread.sleep(3000);
	  act.moveToElement(ele).build().perform();
	  Thread.sleep(1000);
	  s.createRow(i++).createCell(0).setCellValue(ele.getText());	  
	}
    System.out.println(menu.size());
	
		
	
	FileOutputStream fos=new FileOutputStream("D:\\exceldata\\Book2.xlsx");
	w.write(fos);
	Thread.sleep(1000);	
	w.close();
	fis.close();
	fos.close();



   
  }
	}