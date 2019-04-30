package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BluestoneGMpayment_sixteen {
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
			driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("pavithra");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//input[@id='nomineeName']")).sendKeys("pavithra");
			
			Select partner=new Select(driver.findElement(By.id("nomineeRelationship")));
			partner.selectByValue("Mother");
			Select nation=new Select(driver.findElement(By.id("nomineeNationality")));
			nation.selectByValue("Indian");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			System.out.println(driver.getTitle());
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Payment Details']")).isDisplayed());
			driver.close();
			
  }
}
