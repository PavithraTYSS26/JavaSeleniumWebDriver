package org.selenium.webdriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class ActionClassMouseOverAction {
	public static void main(String[] args) throws AWTException {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//to perform movement operation
	
/*	driver.get("https://www.urbanladder.com/");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath("//div[@id='topnav_wrapper']/descendant::span"));
	
	a.moveToElement(ele).build().perform(); //method to perform movement
	
	
*/
	// to perform right click operation
	
/*	Actions act=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath("//div[@id='topnav_wrapper']/descendant::span"));ś
	
	act.contextClick(ele).build().perform();	//method to perform rightclick
*/
	//to perform draganddrop operation
	
/*	driver.get("http://jqueryui.com/slider/");
	driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(ele);
	WebElement slider=driver.findElement(By.id("slider"));
	Actions a=new Actions(driver);
	
	a.dragAndDropBy(slider,1,1).build().perform();			//method to perform draganddriver operation
*/	
	// to perform double click operation
	
/*	driver.get("https://www.urbanladder.com/");
	Actions act=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath("//div[@id='wrapper']/descendant::span[text()='All Furniture']"));
	
	act.doubleClick(ele).build().perform();					//method to perform doubleclick operation
*/
	driver.get("https://www.google.com/");
	WebElement gmail = driver.findElement(By.xpath("//div[@id='gb']/descendant::a[text()='Gmail']"));
	Actions ac = new Actions(driver);
	ac.contextClick(gmail).build().perform();

	
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_W);
	robot.keyRelease(KeyEvent.VK_W);
	/*robot.keyPress(KeyEvent.VK_ALT);
	robot.keyPress(KeyEvent.VK_SPACE);
	robot.keyPress(KeyEvent.VK_M);

	robot.keyPress(KeyEvent.VK_ALT);
	robot.keyPress(KeyEvent.VK_SPACE);
	robot.keyPress(KeyEvent.VK_N);*/
	
	
	}
}
