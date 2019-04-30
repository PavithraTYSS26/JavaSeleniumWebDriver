package org.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitHtml {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		Actions act=new Actions(driver);
		driver.get("file:///C:/Users/Admin/Desktop/WebDriverWait%20Examples/VisibilityOfTextbox.html");
	    WebElement ele=	driver.findElement(By.id("iamtextbox"));
		
	    //explicit wait
	    WebDriverWait wdw=new WebDriverWait(driver,1);
		wdw.until(ExpectedConditions.visibilityOf(ele));
		
		ele.sendKeys("pavi");
	
	}

}
