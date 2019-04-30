package org.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWaitA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		Actions act=new Actions(driver);
		driver.get("file:///C:/Users/Admin/Desktop/WebDriverWait%20Examples/sam1.html");
		
		driver.findElement(By.xpath("//input[@name='textA']")).sendKeys("TY");
		
	
		(new WebDriverWait(driver,20)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver)
			{
				String ty=driver.findElement(By.xpath("//input[@name='textA']")).getAttribute("value");
				System.out.println(ty);
				return ty.equals("TY");
			}
		});
		WebElement ele2=driver.findElement(By.xpath("//input[@name='textB']"));
		
		ele2.sendKeys("pavi");
		
	
	}

}
