package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.pom.JqueryuriSlider_POMtwenty;
import org.testng.annotations.Test;

public class JqueryuiSlider_twenty {
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		JqueryuriSlider_POMtwenty rev = new JqueryuriSlider_POMtwenty(driver);

		int forward = 570;

		for (int i = 0; i < 10; i++) {
			rev.move(act, forward, 0);
			for (int j = 0; j < 20; j++) {
				rev.move(act, -20, 0);
			}
			Thread.sleep(1000);
		System.out.println(i);
		}
		driver.close();

	}
}
