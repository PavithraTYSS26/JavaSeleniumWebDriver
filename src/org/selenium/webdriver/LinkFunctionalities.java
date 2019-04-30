package org.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkFunctionalities {			//get all the links from the webpage and click on 1st link

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.urbanladder.com/"); 
		List<WebElement> lst=driver.findElements(By.xpath("//a"));
		
		for (WebElement webElement : lst) {
			System.out.println(webElement.getAttribute("href"));
		}
		//System.out.println(lst.size());
		lst.get(0).click();
		//driver.close();
	}
}
