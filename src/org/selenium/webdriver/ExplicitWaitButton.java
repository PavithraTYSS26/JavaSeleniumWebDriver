package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///C:/Users/Admin/Desktop/WebDriverWait%20Examples/ButtonClick.html");
		
		WebElement ele=	driver.findElement(By.xpath("//input[@value='Do something else']"));
		
		//explicit wait
		WebDriverWait wdw=new WebDriverWait(driver,10);
		wdw.until(ExpectedConditions.elementToBeClickable(ele));
		
		
	
}
}
