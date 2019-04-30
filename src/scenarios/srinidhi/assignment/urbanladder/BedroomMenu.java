package scenarios.srinidhi.assignment.urbanladder;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class  BedroomMenu{
  @Test
  public void bedroom3() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.urbanladder.com/");
	 
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//div[@id='login_dialog']/descendant::div/a")).click();
	  Thread.sleep(2000);
	  
	  WebElement ele=driver.findElement(By.xpath("//ul[@class='topnav bodytext']/li[@class='topnav_item bedroomunit']/span"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).build().perform();
	  
	  
	//  act.moveToElement( driver.findElement(By.xpath("//a[text()='Beds']"))).build().perform();
	  Thread.sleep(2000);
	 
	  driver.findElement(By.xpath("//div[@id='topnav_wrapper']/ul/li[3]/span/following-sibling::div/descendant::span[text()='Single Beds']")).click();
	
	  driver.findElement(By.xpath("//img[@title='Mou Bed With Mattress (Gardenia)']")).click();
	 
	  Set<String> add=driver.getWindowHandles();
	  for(String a:add)
	  {
		  driver.switchTo().window(a);
	  }
	  driver.findElement(By.xpath("//button[@data-id='33958']")).click();
	  driver.findElement(By.xpath("//div[@class='large-4 columns btn_wrap']/a[text()='Continue shopping']")).click();
	  driver.findElement(By.linkText("Furniture Home")).click();
	  driver.close();
	
  }
}
