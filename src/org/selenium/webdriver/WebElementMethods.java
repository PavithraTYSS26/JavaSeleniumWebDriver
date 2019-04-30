package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele=	driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
	//	driver.manage().window().maximize();			//maximize the window size webdriver interface methods
		
		
		ele.sendKeys("admin");
		System.out.println(driver.findElement(By.xpath("//input[@name='pwd']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@name='pwd']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//label[@id=\"keepLoggedInLabel\"]")).isEnabled());
		System.err.println(ele.getAttribute("value")+"  userinput in javaprogram");
		ele.clear();
		
		WebElement ele2=driver.findElement(By.xpath("//input[@name='pwd']"));
		 
	}

}
