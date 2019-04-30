package org.selenium.webdriver.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Notificationpop {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	   
	   WebDriver driver=new ChromeDriver(opt);
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
	
  }
}
