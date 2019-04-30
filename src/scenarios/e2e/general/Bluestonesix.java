package scenarios.e2e.general;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bluestonesix {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		List<String> before = new ArrayList<>();
		List<String> after = new ArrayList<>();
		driver.get("https://www.bluestone.com");
		act.moveToElement(driver.findElement(By.xpath("//div[@class='container']/nav/ul/li/a[@title='Rings']"))).build()
				.perform();
		driver.findElement(By.xpath("//ul[@class='two-col']/li/a[@title='Diamond Rings']")).click();
		List<WebElement> oldprice = driver.findElements(By.xpath("//span[@class='new-price']"));
		for (WebElement o : oldprice) {
			before.add(o.getText());
			// System.out.println(o.getText());
		}
		act.moveToElement(driver.findElement(By.xpath("//section[@id='Price-form']/span"))).build().perform();
		driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
		List<WebElement> newprice = driver.findElements(By.xpath("//span[@class='new-price']"));
		for (WebElement o : newprice) {
			after.add(o.getText());
			// System.out.println(o.getText());
		}
		System.out.println(newprice.toString());
		Assert.assertNotSame(newprice, oldprice);
		System.out.println("done");
		for (int i = 0; i < 24; i++) {
			System.out.print(before.get(i) + "     ");
			System.out.println(after.get(i));
		}

	}
}
