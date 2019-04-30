package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/htmlfiles/multiselect.html");
		
		Select ele=new Select(driver.findElement(By.id("b")));
		ele.selectByIndex(0);
		ele.selectByVisibleText("322");
		
		if(ele.isMultiple())
		{
			for (int i = 0; i < driver.findElements(By.id("b")).size(); i++) {
				ele.selectByIndex(i);
			}
		}
		System.out.println(" all selected options  -->   "+ele.getAllSelectedOptions().size());
		
		System.out.println("deselectall  --  >  ");
		
		ele.deselectAll();
		
		System.out.println(" selected options "+ele.getAllSelectedOptions().size());
		
	}
}
