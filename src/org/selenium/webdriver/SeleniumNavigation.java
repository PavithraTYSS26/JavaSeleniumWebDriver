package org.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SeleniumNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.seleniumhq.org");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//div/descendant::input[@id='q']"));
		
		act.moveToElement(ele).build().perform();
		ele.sendKeys("sele");
		
		act.sendKeys(Keys.ENTER).build().perform();;
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		ele.clear();
		
		ele.sendKeys("testing");
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		

	}

}
