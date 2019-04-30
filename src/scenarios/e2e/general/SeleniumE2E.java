package scenarios.e2e.general;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SeleniumE2E {				//done fine without assertions
  @Test
  public void f() throws InterruptedException,IOException {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Actions act=new Actions(driver);
	  
	  driver.get("https://www.seleniumhq.org/");
	  Thread.sleep(3000);
	  
	  WebElement electronics = driver.findElement(By.xpath("//a[text()='Download']"));
	  System.out.println(electronics.getText());
	  Assert.assertEquals("Download", electronics.getText());
	  act.moveToElement(electronics).build().perform();
	  electronics.click();
	  Thread.sleep(10000);
	  
	  String txt2=driver.findElement(By.xpath("//a[text()='see the wiki page']")).getText();
	  System.out.println(txt2);
	  Assert.assertEquals("see the wiki page", txt2);
	  driver.findElement(By.xpath("//a[text()='see the wiki page']")).click();
	  Thread.sleep(10000);
	  
	  String fin= driver.findElement(By.xpath("//h2[text()='Tips for running with grid']")).getText();
	  Assert.assertEquals("Tips for running with grid",fin );
	  System.out.println(fin);
	  Thread.sleep(10000);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  System.out.println("seleniumhq done");
	 
	  driver.close();
	  
	    }
}
