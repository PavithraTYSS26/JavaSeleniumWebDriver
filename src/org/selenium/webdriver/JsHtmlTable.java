package org.selenium.webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class JsHtmlTable {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement ele=driver.findElement(By.xpath("//div/h2[text()='HTML Table - Adding Cell Padding']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(ele.getText());
	
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sfile=ts.getScreenshotAs(OutputType.FILE);
	
		
		File dfile=new File("D:\\TestYantra\\DriverProject\\ScrollShot\\htmltable.png");
		Files.copy(sfile, dfile);

		
		driver.close();

	}
}
