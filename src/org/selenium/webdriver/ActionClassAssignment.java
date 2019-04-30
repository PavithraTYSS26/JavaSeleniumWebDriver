package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement ele1=driver.findElement(By.xpath("//a[text()='MORE ']"));
		
		act.moveToElement(ele1).build().perform();
		Thread.sleep(2000);
		
		
		act.click(ele1).build().perform();
		Thread.sleep(2000);
		
		WebElement ele2=driver.findElement(By.xpath("//a[text()='Learn HTML']"));
		
		act.contextClick(ele2).build().perform();
		Thread.sleep(2000);
		
		
	//	driver.close();
		
	/*	WebDriver driver1=new ChromeDriver();
		Actions act1=new Actions(driver1);
		driver1.get("http://sandbox.checklist.com/account/");
		
		  WebElement From = driver1.findElement(By.xpath(".//*[@id='userChecklists']/li[1]/a/span"));

		  WebElement To = driver1.findElement(By.xpath(".//*[@id='userChecklists']/li[4]/a/span"));
		  
		  act1.dragAndDrop(From, To).build().perform();*/
		
		
}
}
