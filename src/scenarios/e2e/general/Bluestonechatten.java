package scenarios.e2e.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Bluestonechatten {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
	//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='wiz-iframe']")));
	 //   driver.findElement(By.xpath("//a[@class='wzrkClose']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='livechat-full-view']")));
		
	//	driver.findElement(By.xpath("//span[@class='icon-maximize']")).click();
		driver.findElement(By.xpath("//label[@for='name']")).sendKeys("paavitwo");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pavithrapec2018@gmail.com");
		driver.findElement(By.xpath("//input[@name='container_4_4']")).sendKeys("635751");
		driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
		driver.findElement(By.xpath("//span[@class='textarea-font']")).sendKeys("Hellow Paavitwo welcome to bluestone chat ");
		System.out.println("done");
		//String str=driver.findElement(By.xpath(""))
  }
}
