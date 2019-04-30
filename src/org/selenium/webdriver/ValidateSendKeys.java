package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateSendKeys {		//validate the data from input textbox usig getAttribute("value") method 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//input[@name='firstname']"));
		ele.sendKeys("pavithra");
		String s = ele.getAttribute("value");

		Assert.assertEquals(s, "pavithra");
		System.out.println("true " + s);

		Thread.sleep(2000);
		driver.close();

	}
}
