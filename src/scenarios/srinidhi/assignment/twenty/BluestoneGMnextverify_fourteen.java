package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;
import org.testng.annotations.Test;

public class BluestoneGMnextverify_fourteen {
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
	    Assert.assertEquals(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"),"pavithrapec2018@gmail.com");
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='subscription-amount subscribed-amount']")).getText(),"Rs 1,000");
		driver.close();
		

  }
}
