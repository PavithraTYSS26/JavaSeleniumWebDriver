package scenarios.e2e.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import javafx.scene.control.Alert;

public class FaceBookE2E {
  @Test
  public void facebook() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	  WebDriver driver=new ChromeDriver(opt);
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("email")).sendKeys("9626722057");
	  driver.findElement(By.id("pass")).sendKeys("pavi@9626722057");
	  driver.findElement(By.xpath("//input[@value='Log In']")).click();
	  
	  driver.findElement(By.xpath("//input[@data-testid='search_input']")).sendKeys("mythri chandramohan");
	  driver.findElement(By.xpath("//div[@role='search']/form/button[@type='submit']")).click();
	  driver.findElement(By.xpath("//a[text()='Mythri Chandramohan']")).click();
	  driver.findElement(By.xpath("//span[@class='fsl fcg']/span")).click();
	  driver.findElement(By.xpath("//div[@class='_20-']/textarea")).sendKeys("Mythri i am pavithra i can't send u d request can u send me...");
	  driver.findElement(By.xpath("//div[@class='_5lnf uiOverlayFooter _5a8u _59db']/button[@type='submit']")).click();
	 driver.close();
	  
	
	  
  }
}
