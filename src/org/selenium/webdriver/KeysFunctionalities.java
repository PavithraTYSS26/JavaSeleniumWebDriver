package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionalities { //not working
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///D:/textbox.html");
    WebElement ele1=	driver.findElement(By.xpath("//input[@id='input1']"));
    
	ele1.sendKeys(Keys.CONTROL+"a",Keys.CONTROL+"c");
	
	WebElement ele2=driver.findElement(By.xpath("//input[@id='input2']"));
	ele2.sendKeys(Keys.CONTROL+"v");
			
		//ele.sendKeys(Keys.HOME,Keys.SHIFT,Keys.END,Keys.DELETE);
			// driver.findElement( By.xpath("//input[@name='username']")).sendKeys("admin");
			// String s1=driver.findElement(By.xpath("nobr[.='actiTIME 2019.1
			// Pro']")).getText();
//		String s2=	driver.findElement(By.xpath("//a[.='Forgot your password?']")).getText();
			// System.out.println(" && "+s2);
			// driver.findElement(By.xpath("//a[contains(text(),'password?')]")).click();
		
	//driver.close();
		
		
	/*	driver.get("file:///C:/Users/Admin/Desktop/Page.html"); 
		WebElement wb=driver.findElement(By.xpath("//input[@id='input1']"));
		//wb.sendKeys("pavi");
		wb.sendKeys(Keys.CONTROL+"ac");
		WebElement wbp=driver.findElement(By.xpath("//input[@id='input3']"));
		wbp.sendKeys(Keys.CONTROL+"v");
		System.out.println(wb.getAttribute("id"));
		driver.close();
	*/
	/*	
		 
	*/
	}
}
