package org.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
	    
		driver.get("https://www.facebook.com");
	
	}

}
