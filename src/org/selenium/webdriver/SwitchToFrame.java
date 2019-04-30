package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {		//main frame subframe
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("file:///D:/page2.html");
		driver.switchTo().frame(0).findElement(By.xpath("//input[@id='page1']")).sendKeys("indexA");
		driver.findElement(By.xpath("//input[@id='2id']")).sendKeys("indexB");
	    
	   // driver.switchTo().frame("res").findElement(By.xpath("//input[@id='page1']")).sendKeys("avalue");
	   // driver.switchTo().frame(driver.findElement(By.tagName("iframe"))).findElement(By.xpath("//input[@id='page1']")).sendKeys("webelementA");
		  driver.switchTo().defaultContent().findElement(By.id("take")).sendKeys("defaultcontent");
	  //  driver.switchTo().frame(0).findElement(By.xpath("//input[@id='2id']")).sendKeys("indexB");
	 
		  Thread.sleep(4000);   		
		  driver.close();
	}

}
