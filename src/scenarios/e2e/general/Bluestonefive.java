package scenarios.e2e.general;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bluestonefive {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		driver.get("https://www.bluestone.com");
		act.moveToElement(driver.findElement(By.xpath("//div[@class='container']/nav/ul/li/a[@title='Rings']"))).build()
				.perform();
		driver.findElement(By.xpath("//div[@class='col-inner']/ul/li[2]/a[text()='Diamond']")).click();
		List<WebElement> oldprice = driver.findElements(By.xpath("//span[@class='new-price']"));
		act.moveToElement(driver.findElement(By.xpath("//section[@id='Price-form']/span"))).build().perform();
		driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
		List<WebElement> newprice = driver.findElements(By.xpath("//span[@class='new-price']"));
		System.out.println(oldprice.size());
		System.out.println(newprice.size());
		Assert.assertNotSame(newprice, oldprice);
		System.out.println("done");

	}
}
