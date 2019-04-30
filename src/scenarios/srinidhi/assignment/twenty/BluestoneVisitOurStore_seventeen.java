package scenarios.srinidhi.assignment.twenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BluestoneVisitOurStore_seventeen {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@class='visit-our-stores']/a")).click();
		int stores=driver.findElements(By.xpath("//div[@class='map-wrap']")).size();
		System.out.println("No of bluestone stores      -->>   "+stores);
		driver.close();

  }
}
