package org.selenium.webdriver;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AllOptionsSortedOrder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		WebElement monthlist=driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(monthlist);
		
		List<WebElement> monthOptions=s.getOptions();
		Set<String> ts=new TreeSet();
		
		for(WebElement wb:monthOptions)
		{
			ts.add(wb.getText());
			
		}
	//	for(String values:ts)
	//	{
	//		System.out.println(values);
	//	}
	//	for (int i = 0; i < monthOptions.size(); i++) 
	//	{
    //
	//			s.selectByIndex(i);								//select all the options
	//	}
		
	//	List<WebElement> selectedOptions = s.getAllSelectedOptions();	//get all selected options
		
	//	Assert.assertEquals(selectedOptions.size(), ts.size());
		Assert.assertEquals(ts.size(), monthOptions.size());
		System.out.println("unique elements");
		
}
}