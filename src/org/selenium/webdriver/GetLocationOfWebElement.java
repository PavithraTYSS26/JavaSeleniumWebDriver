package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationOfWebElement {				//find the location of the webelement getLocation().getX()//getLocation().getY()
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file://D:/page2.html");
	
	
	WebDriver wd=driver.switchTo().frame(0);
	WebElement frame= wd.findElement(By.xpath("//input[@id='page1']"));
    
	frame.sendKeys("getLocation");
	
	System.out.println(frame.getAttribute("value"));
	System.out.println(frame.getAttribute("value"));
	
	Point location=frame.getLocation();
	int x=location.getX();
	int y=location.getY();
	
	System.out.println("x  axis = "+x+"           "+"y  axis = "+y);

}
}