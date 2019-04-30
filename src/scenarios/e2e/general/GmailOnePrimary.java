package scenarios.e2e.general;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailOnePrimary {
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		driver.get("https://www.gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pavithrapec2018@gmail.com");
		driver.findElement(By.xpath("//content/span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pavithrapec2018");
		driver.findElement(By.xpath("//content/span[text()='Next']")).click();

		if (driver.findElement(By.xpath("//div[text()='Primary']")).isSelected() == false)
			driver.findElement(By.xpath("//div[text()='Primary']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Primary']")).isDisplayed());
		List<WebElement> primary = driver
				.findElements(By.xpath("//div[@class='nH ar4 z']/descendant::table[@id=':2r']/tbody/tr"));
		System.out.println(primary.size());
		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//td[@class='yX xY ']/div/span/span")).getText();
		String subject = driver.findElement(By.xpath("//div[@class='xT']/div/span/span")).getText();
		System.out.println("name     : " + name);
		System.out.println("subject  : " + subject);
		driver.close();

	}
}
