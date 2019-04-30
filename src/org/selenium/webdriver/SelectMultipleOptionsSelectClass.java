package org.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOptionsSelectClass {	//select all the options and print it on the console if the select  tag has multiple options
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
	driver.get("file:///D:/multiselect.html"); // multiple select-----------------getAllSelectedOptions();
	WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));
	
	Select s = new Select(ele);
	System.out.println(s.isMultiple());
	
	if (s.isMultiple()) 										//check whether the select tag has single option or multiple options
	{
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {

			s.selectByIndex(i);
		}
	}
	List<WebElement> selectedOptions = s.getAllSelectedOptions();
	for (int i = 0; i < selectedOptions.size(); i++) {
		System.out.println(selectedOptions.get(i).getText());		//get the text of the selected options
	}		
}
}
