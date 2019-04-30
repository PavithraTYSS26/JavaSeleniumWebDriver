package org.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JsAssignment {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		
		
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@title='Search']"));
		ele.sendKeys("java");
		Thread.sleep(1000);
		WebElement ele1=driver.findElement(By.xpath("//b[contains(.,'basics')]"));
		
		act.click(ele1).build().perform();
		Thread.sleep(5000);
		driver.close();
	}
}
