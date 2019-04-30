package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioBlueStoneRing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		Actions act=new Actions(driver);
		WebElement aj=driver.findElement(By.xpath("//div[@class=\"wh-submenu medium-width\"]/descendant::a[@title='Rings']"));
		act.moveToElement(aj).build().perform();
	}
	
	
}
