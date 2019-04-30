package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BluestoneGMwithoutemail_twelve {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		JavascriptExecutor js=(JavascriptExecutor)driver;
		Actions act = new Actions(driver);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Scheme']")).click();;
		driver.findElement(By.xpath("//input[@value='Start Now']")).click();
	   
		Assert.assertEquals(driver.findElement(By.xpath("//ul[@id='Email_error']")).getText(),"Email is required");
	    System.out.println(driver.findElement(By.xpath("//ul[@id='Email_error']")).getText());
	  
	    Assert.assertEquals(driver.findElement(By.xpath("//ul[@id='amount_error']")).getText(),"Amount is required");
	    System.out.println(driver.findElement(By.xpath("//ul[@id='amount_error']")).getText());
	   
	    driver.close();

  }
}
