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

public class TsAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Actions act=new Actions(driver);
		//driver.get("https://www.urbanladder.com");
	   //WebElement sale=driver.findElement(By.xpath("//div[@id='topnav_wrapper']/descendant::li/span[contains(.,'Sale')]"));
	   //act.moveToElement(sale).build().perform();
	  
	//	driver.get("https://www.bluestone.com/jewellery/pendants.html?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQjwsZ3kBRCnARIsAIuAV_QkycCS7sfZBsM7RVsvoDAy2vkucRIYqxRLVND4Ph_ejM-RdXrD2L4aAujIEALw_wcB");
	//	WebElement sale=driver.findElement(By.xpath("//img[@alt='Trust Factors']"));
	//	act.moveToElement(sale).build().perform();
		  
		driver.get("https://paytm.com/");
		WebElement sale=driver.findElement(By.xpath("//a[@data-reactid='510']"));
		act.moveToElement(sale).build().perform();
		act.click(sale).build().perform();
		  
	//	driver.get("https://www.urbanladder.com");
		//WebElement sale=driver.findElement(By.xpath("//div[@id='topnav_wrapper']/descendant::li/span[contains(.,'Sale')]"));
		   //act.moveToElement(sale).build().perform();
		  
	//	driver.get("https://www.urbanladder.com");
		//WebElement sale=driver.findElement(By.xpath("//div[@id='topnav_wrapper']/descendant::li/span[contains(.,'Sale')]"));
		   //act.moveToElement(sale).build().perform();
		  
	  
		Thread.sleep(2000);
	   
	   TakesScreenshot ts=(TakesScreenshot)driver;
		File sfile=ts.getScreenshotAs(OutputType.FILE);
	//	File dfile=new File("D:\\TestYantra\\DriverProject\\TSassignment\\urbanladder.png");
	//	File dfile=new File("D:\\TestYantra\\DriverProject\\TSassignment\\bluestone.png");
		File dfile=new File("D:\\TestYantra\\DriverProject\\TSassignment\\paytm.png");
	//	File dfile=new File("D:\\TestYantra\\DriverProject\\TSassignment\\urbanladder.png");
	//	File dfile=new File("D:\\TestYantra\\DriverProject\\TSassignment\\urbanladder.png");
		
		Files.copy(sfile, dfile);
		Thread.sleep(2000);
		driver.close();
	}
	
}
