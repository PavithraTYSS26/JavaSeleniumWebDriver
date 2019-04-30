package scenarios.e2e.general;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UrbanladderE2E {
  @Test
  public void f() throws InterruptedException {
	 
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	  Actions act=new Actions(driver);
	  driver.get("https://www.urbanladder.com/");
	  driver.findElement(By.xpath("//div[@class='vert-container']/div/a[contains(.,'Close')]")).click();
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//li/span[contains(.,'Sale')]")).click();
	  driver.findElement(By.xpath("//a/span[text()='TV Units']")).click();
	  driver.findElement(By.xpath("//li[@class='item' and @ data-group='price']")).click();
	//  driver.findElement(By.xpath("//input[@ type='radio' and @id='price_limit_3099-6999']")).click();
	  driver.findElement(By.xpath("//a[@class='product-img']/img")).click();
	 
	  
	  Set<String> win=driver.getWindowHandles();
	  for(String s:win)
	  {
		  driver.switchTo().window(s);
		  driver.findElement(By.xpath("//div[@class='buy_details clearfix  current']/div/button[@id='add-to-cart-button']")).click();
	  }
	 
	  driver.close();
	  
  }
}

