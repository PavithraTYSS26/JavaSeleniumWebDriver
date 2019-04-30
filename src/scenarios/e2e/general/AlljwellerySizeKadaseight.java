package scenarios.e2e.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlljwellerySizeKadaseight {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		driver.get("https://www.bluestone.com");
		act.moveToElement(driver.findElement(By.xpath("//li[@class='menuparent']/a[@title='Jewellery']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Kadas']")).click();
		driver.findElement(By.xpath("//img[@alt='The Manvik Kada For Him']")).click();
		driver.findElement(By.xpath("//span[@class='select-size']")).click();
		driver.findElement(By.xpath("//span[@class='select-size']")).click();
		Select size=new Select(driver.findElement(By.id("ringselect")));
		size.selectByValue("16");
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		Assert.assertEquals(
				driver.findElement(By.xpath("//div[@class='row line-separator size-row']/div[@class='value col-xs-9']")).getText(),
				 "2-16(2 16/16"+")");
		System.out.println("Size matches..............done");
		driver.close();
	
  }
}
