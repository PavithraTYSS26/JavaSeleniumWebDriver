package org.selenium.webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {   //to close all the windows from reverse order
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		List<String> browsers=new ArrayList(windows);
		
		for(int i=browsers.size()-1;i>=1;i--)
		{
			driver.switchTo().window(browsers.get(i));
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(2000);
		}
		
	}

}
