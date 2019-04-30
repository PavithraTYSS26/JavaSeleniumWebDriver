package org.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSingleOption {			//SELECTCLASS{single select ,multiple select}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:www.facebook.com");					//single select
    	WebElement ele=driver.findElement(By.xpath("//select[@id='day']"));
     	
    	Select s=new  Select(ele);
        s.selectByIndex(0);
     // s.selectByValue("1");
     // s.selectByVisibleText("10");
   		
        List<WebElement> options= s.getOptions();
   		System.out.println(options.size());
    
        for(int i=0;i<options.size();i++)        
      	{
    	  System.out.println(options.get(i).getText());
      	}


	}
}
