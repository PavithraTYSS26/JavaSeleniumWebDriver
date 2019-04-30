package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BluestoneRingODA_eighteen {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		act.click(driver.findElement(By.xpath("//img[@alt='The Kara Ring']"))).build().perform();
		String ourprice=driver.findElement(By.xpath("//span[@id='our_price_display']")).getText();
		String discounted=driver.findElement(By.xpath("//span[@id='discountedPriceSpan']")).getText();
	
		System.out.println(ourprice);
		System.out.println(discounted);
	    

  }
}
