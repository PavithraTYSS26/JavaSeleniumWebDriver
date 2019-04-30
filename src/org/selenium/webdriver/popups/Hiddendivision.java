package org.selenium.webdriver.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hiddendivision {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
	   driver.findElement(By.linkText("Login")).click();
	   driver.findElement(By.xpath("//div[@class='popup_menu_icon support_icon']")).click();
	   driver.findElement(By.linkText("About your actiTIME")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.linkText("//span[contains(.,'SYSTEM INFO')]")).click();
	   driver.findElement(By.xpath("//td[@class='close-button']")).click();
		
  }
}
