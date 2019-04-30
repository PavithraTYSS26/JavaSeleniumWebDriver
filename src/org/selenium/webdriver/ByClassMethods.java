package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassMethods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();

	driver.get("https://demo.actitime.com/login.do"); 	             
   
	By b=By.id("username");
	WebElement ele1=driver.findElement(b); 		
	driver.findElement(By.id("loginButtonContainer")).click();      				//find the element using By.id() method
    ele1.sendKeys("admin"); 							           
   
    driver.findElement(By.name("pwd")).sendKeys("manager");							//find the element using By.name() method
   
    driver.findElement(By.linkText("Forgot your password?")).click(); 				//find the element using By.linkText() method
		
    driver.findElement(By.partialLinkText("password?")).click();					//find the element using By.partialLinkText() method
    
    driver.findElement(By.xpath("//input[@type='text']"));							//find the element using By.xpath() method
    
    driver.findElement(By.tagName("input"));										//find the element using By.tagName() method
    
    //driver.findElement(By.className());											//find the element using By.className() method
		
    //driver.findElement(By.cssSelector());											//find the element using By.cssSelector() method
   
    
    /*                       //the element is present or not
		  try //checking the webelement is present or not {
		  driver.findElement(By.id("user")); System.out.println("element is present");
		  } catch(Exception e) { System.out.println("element is not present"); }
		  List<WebElement> ele=driver.findElements(By.id("user"));
		  System.out.println(ele.size());
	*/
}
}
