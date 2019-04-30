package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	
		driver.get("file:///C:/Users/Admin/Desktop/WebDriverWait%20Examples/VisibilityOfTextbox.html");
		
		WebElement ele=	driver.findElement(By.id("iamtextbox"));
	
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver)
			{
				return ele.isDisplayed();
			}
		});
		ele.sendKeys("pavi");
		
	
	}

}
