package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BluestoneRingDeliverytime_seven {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		JavascriptExecutor js=(JavascriptExecutor)driver;
		Actions act = new Actions(driver);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.xpath("//a[text()='Next Day Delivery ']")).click();
		WebElement nextday=driver.findElement(By.xpath("//h2[text()=' Jewellery With Next Day Delivery ']"));
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		js.executeScript("arguments[0].scrollIntoView();",nextday);
		int nextdayitems=driver.findElements(By.xpath("//div[@id='grid-view-result']/ul[@class='product-grid ']/li")).size();
		System.out.println("Items will be delivered on next day  ---->   "+nextdayitems);
		driver.close();

  }
}
