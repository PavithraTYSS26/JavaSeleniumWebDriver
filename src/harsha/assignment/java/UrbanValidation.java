package harsha.assignment.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UrbanValidation {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  Actions act=new Actions(driver);
	  driver.get("https://www.urbanladder.com/");
	 
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@id='authentication_popup']/div/div/div/a[@class='close-reveal-modal hide-mobile']")).click();
	  act.moveToElement(driver.findElement(By.xpath("//div[@id='topnav_wrapper']/ul/li/span[contains(.,'Living')]"))).build().perform();
	  
	  Thread.sleep(2000);
	  List<WebElement> sub=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li/span[contains(.,'Living')]/parent::li/descendant::div/a"));
	 
	 for(WebElement ele:sub)
	 {
		 System.out.println(ele.getText());
	 }
	 
	driver.close();
  }
}
