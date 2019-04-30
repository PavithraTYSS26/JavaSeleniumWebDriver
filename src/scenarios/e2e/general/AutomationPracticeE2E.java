package scenarios.e2e.general;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AutomationPracticeE2E {		 //ElementNotVisibleToSeleniumException
  @Test
  public void f() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	  Reporter.log("automationpractice app loaded successfully  ",true);
	  
	  WebElement dress=driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Dresses']"));
	  dress.click();
	  Reporter.log("Now on Dresses ",true);
	  
	  driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg']")).click();
	  Reporter.log(" First dress",true);
	  
	  driver.findElement(By.xpath("//body[@id='product']/descendant::div[@class='pb-right-column col-xs-12 col-sm-4 col-md-3']/descendant::span[text()='Add to cart']")).click();
	  Reporter.log("Add to cart ",true);
	
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File sfile=ts.getScreenshotAs(OutputType.FILE);
	  File dfile=new File("D:\\TestYantra\\DriverProject\\e2escenarios\\automation.png");
	  com.google.common.io.Files.copy(sfile, dfile);
	  Reporter.log(" Screenshot has been taken ",true);
	  
	  //ElementNotVisibleToSeleniumException
	  driver.findElement(By.xpath("//div[@class='clearfix']/descendant::a[@title='Proceed to checkout']")).click();
	  Reporter.log("proceed to checkout ",true);
	  
	  driver.close();
	  Reporter.log("browser has been closed",true);
  }
  
}
