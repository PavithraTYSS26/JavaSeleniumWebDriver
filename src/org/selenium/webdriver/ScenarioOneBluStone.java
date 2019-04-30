package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioOneBluStone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		Actions act=new Actions(driver);
		WebElement aj=driver.findElement(By.xpath("//nav[@class='wh-navbar']/descendant::a[text()='All Jewellery ']"));
		act.moveToElement(aj).build().perform();
		WebElement kadas=driver.findElement(By.xpath("//nav[@class='wh-navbar']/descendant::a[text()='All Jewellery ']/following-sibling::div/descendant::li/a[text()='Kadas']"));
		act.doubleClick(kadas).build().perform();
		WebElement img=driver.findElement(By.xpath("//nav[@class='wh-navbar']/descendant::a[text()='All Jewellery ']/following-sibling::div/descendant::li/a[text()='Kadas']/ancestor::body/descendant::img[@alt=\'The Deven Kada For Him\']"));
		act.moveToElement(img).click().perform();
		WebElement buy=driver.findElement(By.xpath
("//nav[@class='wh-navbar']/descendant::a[text()='All Jewellery ']/following-sibling::div/descendant"
		+ "::li/a[text()='Kadas']/ancestor::body/descendant::img[@alt='The Deven Kada For Him']/ancestor"
		+ "::div[@id='main']/descendant::div[@class='buynow-block col-xs-6']/input[@id='buy-now']"));
		act.moveToElement(buy).click().perform();
		WebElement str=driver.findElement(By.xpath("//div[text()='* This field is required']"));
		System.out.println(str.getText());
	}
}

