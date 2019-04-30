package org.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindFromTable {			//getting the data from table and printing it on the console
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/table.html");
		List<WebElement> tableData=driver.findElement(By.tagName("table")).findElements(By.tagName("tr"));
		for(int i=0;i<tableData.size();i++)
		{
			System.out.println(tableData.get(i).getText());
		}
		Thread.sleep(2000);
		driver.close();
	}
}
