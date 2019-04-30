package scenarios.srinidhi.assignment.twenty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BluestoneRingBelow10000_six {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		act.moveToElement(driver.findElement(By.xpath("//section[@id='Price-form']"))).build().perform();
		driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		List<WebElement> below10k=driver.findElements(By.xpath("//ul[@id='product_list_ui']/li"));
		
		System.out.println("No of rings below 10k   --->  "+below10k.size());
		driver.close();
  }
}
