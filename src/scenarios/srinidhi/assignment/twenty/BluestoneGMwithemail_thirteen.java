package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.pom.BluestoneGMwithemail_thirteenPOM;
import org.testng.annotations.Test;

public class BluestoneGMwithemail_thirteen {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Scheme']")).click();
		BluestoneGMwithemail_thirteenPOM get=new BluestoneGMwithemail_thirteenPOM(driver);
		get.setAmount("1000");
		get.setEmail("pavithrapec2018@gmail.com");
		System.out.println(get.amount_get());
		System.out.println(get.email_get());
		get.start();
		driver.close();
  }
}
