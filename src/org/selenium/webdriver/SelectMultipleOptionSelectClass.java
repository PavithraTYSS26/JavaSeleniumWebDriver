package org.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOptionSelectClass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
	   driver.get("file:///D:/multiselect.html");								//multiple select
	   WebElement ele=driver.findElement(By.xpath("//select[@id='b']"));
	  
	   Point loc=ele.getLocation();					//getLocation of the webElement(Point--class)
	   int x=loc.getX();
	   int y=loc.getY();
	   
	   System.out.println("x axis = "+x+"  y axis = "+y);
	   Select s=new Select(ele);
	   System.out.println(s.isMultiple());
	   
	   if(s.isMultiple())
	   {
		   List<WebElement> options= s.getOptions();
		   System.out.println(options.size());
		    
		//    for(int i=0;i<options.size();i++)        
		//      {
		    	s.selectByIndex(0);
		    	s.selectByIndex(1);
		    	s.selectByIndex(2);
		//    	Thread.sleep(2000);
		    	s.deselectAll();
		 //		s.selectByIndex(i);
		 //   	} 
	   }
	}	
			   
}
