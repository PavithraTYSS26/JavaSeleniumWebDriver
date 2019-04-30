package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BluestonecountRingWomen_ten {
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
		
		act.moveToElement(driver.findElement(By.xpath("//section[@id='Gender-form']"))).build().perform();
		driver.findElement(By.xpath("//section[@id='Gender-form']/descendant::span[text()=' Women ']")).click();
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		int count=driver.findElements(By.xpath("//ul[@class='product-grid search-box-result']/li")).size();
		
		System.out.println(count);
		driver.close();

  }
}
