package org.selenium.webdriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifySortedOrNot {  	//verify elements are sorted order or not  store the retrieved elements in one list and write the expected elements in another list now compare elements of both lists
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		WebElement monthlist=driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(monthlist);
		List<WebElement> monthOptions=s.getOptions();
		List<String> web=new ArrayList();
		
		for(WebElement wb:monthOptions)
		{
			web.add(wb.getText());
		}
		
		System.out.println();
		String[] strings= {"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
		
		List<String> lst=new ArrayList(Arrays.asList(strings));
		System.out.println(lst);
		
		
		System.out.println(web.equals(lst));
		
		Thread.sleep(2000);
		driver.close();
	}
}
