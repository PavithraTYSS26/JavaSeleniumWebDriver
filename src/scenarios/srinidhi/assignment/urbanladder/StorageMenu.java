package scenarios.srinidhi.assignment.urbanladder;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StorageMenu {
  @Test
  public void storageunit5() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.urbanladder.com/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  Actions act=new Actions(driver);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	 
	  WebElement close=driver.findElement(By.xpath("//div[@id='login_dialog']/descendant::div/a"));
	  Assert.assertEquals("Close", close.getText());
	  System.out.println(close.getText());
	  close.click();
	  Thread.sleep(2000);
	  
	  WebElement storage=driver.findElement(By.xpath("//ul[@class='topnav bodytext']/li[@class='topnav_item storageunit']/span"));
	  Assert.assertEquals("Storage", storage.getText());
	  System.out.println(storage.getText());
	  act.moveToElement(storage).build().perform();
	  Thread.sleep(2000);
	  
	 
	  WebElement livstor=driver.findElement(By.xpath("//a[text()='Living Storage']"));
	  Assert.assertEquals("Living Storage", livstor.getText());
	  System.out.println(livstor.getText());
	  act.moveToElement(livstor ).build().perform();
	  
	  WebElement tvunit= driver.findElement(By.xpath("//li[@class='subnav_item 426']/a/span[text()='TV Units']"));
	  Assert.assertEquals("TV Units", tvunit.getText());
	  System.out.println(tvunit.getText());
	  tvunit.click();
	  
	  js.executeScript("window.scrollBy(0,300)");	
	  WebElement lincolntv=driver.findElement(By.xpath("//span[text()='Lincoln Low TV unit ']"));
	//  Assert.assertEquals("Lincoln Low TV unit", lincolntv.getText());
	  System.out.println(lincolntv.getText());
	  lincolntv.click();
	 
	  Set<String> add=driver.getWindowHandles();
	  System.out.println(add);
	  for(String a:add)
	  {
		  System.out.println(a);
		  driver.switchTo().window(a);
		  
	  }
	  WebElement addcart= driver.findElement(By.xpath("//button[@data-id='68823']"));
	//  Assert.assertEquals("Add to Cart", addcart.getText());
	  System.out.println(addcart.getText());
	  addcart.click();
	  
	  WebElement contshop=driver.findElement(By.xpath("//div[@class='large-4 columns btn_wrap']/a[text()='Continue shopping']"));
	  Assert.assertEquals("Continue shopping", contshop.getText());
	  System.out.println(contshop.getText());
	  contshop.click();
	  
	  WebElement home=driver.findElement(By.linkText("Furniture Home"));
	  Assert.assertEquals("Furniture Home", home.getText());
	  System.out.println(home.getText());
	  home.click();
	
  }
}
