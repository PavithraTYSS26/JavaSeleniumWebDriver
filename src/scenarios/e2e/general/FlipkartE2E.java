package scenarios.e2e.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartE2E {				//adding into the cart (NSE)
  @Test																
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Actions act=new Actions(driver);
	  
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(3000);
	  
	  WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
	  act.moveToElement(electronics).build().perform();
	  System.out.println("Now on electronics");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//a[@title='Apple']")).click();
	  System.out.println("Apple");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/50/50/image/2d44b6.jpg?q=50']")).click();
	  System.out.println("Apple image");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/312/312/j7ksia80/mobile/u/z/b/apple-iphone-8-plus-mq8j2hn-a-original-imaexsfmnxjcfc8t.jpeg?q=70']")).click();
	  System.out.println("Version Selected");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//li[@class='col col-6-12']/button")).click();
	  System.out.println("Added into cart");
	  Thread.sleep(3000);
	 
	  /*driver.findElement(By.xpath("//a[@title='Apple']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[@title='Apple']")).click();
	  Thread.sleep(3000);*/
	 
	  driver.close();
	  
  }
}
