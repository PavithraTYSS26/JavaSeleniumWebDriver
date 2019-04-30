package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Yatraadultchild_ninteen {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@class='w225 initial-tab']/descendant::input")).sendKeys("chennai");
		driver.findElement(By.xpath("//li[@class='w225']/div/input")).sendKeys("banglore");
		driver.findElement(By.xpath("//i[@class='font-icon icon-inside icon-calendar blur_class BE_flight_origin_date']")).click();
		driver.findElement(By.xpath("//td[@data-date='31/03/2019']")).click();
		
		driver.findElement(By.xpath("//li[@id='BE_flight_ret_cal']")).click();
		driver.findElement(By.xpath("//div[@id='BE_flight_paxInfoBox']/i")).click();
		driver.findElement(By.xpath("//span[text()='Premium Economy']/parent::li")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
	//	driver.close();
  }
}
