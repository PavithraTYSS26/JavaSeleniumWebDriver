package org.selenium.webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class TakeScreenUrbanLadder {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.urbanladder.com");
		Actions act=new Actions(driver);
		
	   WebElement sale=driver.findElement(By.xpath("//div[@id='topnav_wrapper']/descendant::li/span[contains(.,'Collections')]"));
	   Thread.sleep(2000);
	   act.moveToElement(sale).build().perform();
	   Thread.sleep(5000);
	  
	   TakesScreenshot ts=(TakesScreenshot)driver;
		File sfile=ts.getScreenshotAs(OutputType.FILE);
		File dfile=new File("D:\\TestYantra\\DriverProject\\ScreenShot\\loginshot.png");
		Files.copy(sfile, dfile);
	


	}

}
