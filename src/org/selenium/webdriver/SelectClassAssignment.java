package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/htmlfiles/selecttag.html");
		Select ele1=new Select(driver.findElement(By.xpath("//select[@id='myList']")));
		
		ele1.selectByIndex(0);
		Thread.sleep(3000);
		
		ele1.selectByValue("2");
		Thread.sleep(3000);
		
		ele1.selectByVisibleText("three");
		Thread.sleep(4000);
		
		System.out.println("is multi select tag -->     "+ele1.isMultiple());
		Thread.sleep(3000);
		
		System.out.println("Alloptions = "+ele1.getOptions().size());
		Thread.sleep(1000);
		
		System.out.println("Allselected = "+ele1.getAllSelectedOptions().size());
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
