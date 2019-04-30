package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("file:///D:/jsfolder/js.html");
		
		//to send the input for the disabled elements
		js.executeScript("document.getElementById('xyz').value=('pavi')");
		
		
		//driver.findElement(By.xpath("//input[@id='xyz']")).sendKeys("pavi");
		
	}
}
