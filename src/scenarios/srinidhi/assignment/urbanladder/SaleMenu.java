package scenarios.srinidhi.assignment.urbanladder;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SaleMenu {
  @Test
  public void sale1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.urbanladder.com/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//div[@id='login_dialog']/descendant::div/a")).click();
	  Thread.sleep(2000);
	  
	  WebElement ele=driver.findElement(By.xpath("//ul[@class='topnav bodytext']/li[@class='topnav_item saleunit']/span"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).build().perform();
	  Thread.sleep(2000);
	  
	  act.moveToElement( driver.findElement(By.xpath("//a[text()='Colour Crush Sale']"))).build().perform();
	 
	  driver.findElement(By.xpath("//li[@class='subnav_item 3355']/a/span[text()='Sofas']")).click();
	
	  driver.findElement(By.xpath("//img[@alt='Tribbiani Recliner Sofa Set (Grey) (Grey, 1-seater Custom Set - Sofas, None Standard Set - Sofas, Fabric Sofa Material, Regular Sofa Size, Regular Sofa Type)']")).click();
	
	Set<String> add=driver.getWindowHandles();
	for(String a:add)
	{
		System.out.println(a);
		driver.switchTo().window(a);
	}
	driver.findElement(By.xpath("//button[@data-sku='FNSF51RSGY30311']")).click();
	driver.findElement(By.xpath("//div[@class='large-4 columns btn_wrap']/a[text()='Continue shopping']")).click();
	driver.findElement(By.linkText("Furniture Home")).click();
	
	
	  System.out.println("done");	 
	  

	 
  }
}
