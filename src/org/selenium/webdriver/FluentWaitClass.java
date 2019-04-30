package org.selenium.webdriver;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///C:/Users/Admin/Desktop/WebDriverWait%20Examples/sam1.html");
		WebElement ele1=driver.findElement(By.xpath("//input[@name='textA']"));
		ele1.sendKeys("TY");
		WebElement ele2=driver.findElement(By.xpath("//input[@name='textB']"));
		
		//explicitwait
		WebDriverWait wdw=new WebDriverWait(driver,15);
		wdw.until(ExpectedConditions.textToBePresentInElementValue(ele1, "TY"));
	
		
		//fluentwait
		(new FluentWait<WebDriver>(driver)).
		withTimeout(Duration.ofSeconds(1)).pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class).
		until(ExpectedConditions.visibilityOf(ele1));
		
		ele2.sendKeys("Test Yantra");
		
	//	Thread.sleep(2000);
	//	driver.close();
	
	}
	
}
