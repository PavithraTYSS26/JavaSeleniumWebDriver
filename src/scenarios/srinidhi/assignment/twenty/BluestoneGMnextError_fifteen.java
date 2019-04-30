package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BluestoneGMnextError_fifteen {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Scheme']")).click();
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pavithrapec2018@gmail.com");
		driver.findElement(By.xpath("//div[@class='form-submit text-center auto-filled']/input")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@id='fullname_error']/li")).isDisplayed());
		driver.close();
  }
}
