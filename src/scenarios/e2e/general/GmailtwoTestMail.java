package scenarios.e2e.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GmailtwoTestMail {
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='z0']/div")).click();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("pspkjr71016@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test Mail");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hai ... Welcome to selenium automation");
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		driver.close();

	}
}
