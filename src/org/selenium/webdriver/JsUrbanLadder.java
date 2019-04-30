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

public class JsUrbanLadder {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
	
	driver.get("https://www.urbanladder.com/");
	WebElement ele=driver.findElement(By.xpath("//a/img[@alt='Download Urban Ladder App from Playstore']"));
	
	js.executeScript("arguments[0].scrollIntoView();", ele);
	System.out.println(ele.getText());

	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File sfile=ts.getScreenshotAs(OutputType.FILE);

	
	File dfile=new File("D:\\TestYantra\\DriverProject\\ScrollShot\\urbanladder.png");
	Files.copy(sfile, dfile);

	
	driver.close();
	
	}

}
