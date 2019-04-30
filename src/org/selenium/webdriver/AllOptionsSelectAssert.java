package org.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AllOptionsSelectAssert { 							// select multiple options check whether all options are selected or not using
																// Assert.assertEquals()
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/multiselect.html");							//load the webpage
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));	//inspect the element and find the location of the element
		Select s = new Select(ele);											//create instance to select the options
		
		if (s.isMultiple()) 												//check the select tag has multiple options or single options
		{
			List<WebElement> options = s.getOptions(); 						// get the options from webpage
			System.out.println(options.size());

			for (int i = 0; i < options.size(); i++) 
			{

				s.selectByIndex(i); // select all the options  under select tag
			}
		}
		List<WebElement> selectedOptions = s.getAllSelectedOptions(); 		// get all selected options

		Assert.assertEquals(4,selectedOptions.size() );						//check all the elements are selected or not

		System.out.println("All are selected ");							//if all  the elements are selected means it will be executed
		Thread.sleep(3000);													//enable sleep mode for 2 seconds
		driver.close();														//close the driver
	}
}
