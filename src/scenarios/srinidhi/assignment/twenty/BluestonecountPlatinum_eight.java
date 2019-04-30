package scenarios.srinidhi.assignment.twenty;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class BluestonecountPlatinum_eight {
  @Test
  public void f() throws IOException, AWTException {
	        System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Actions act = new Actions(driver);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			
			
			driver.get("https://www.bluestone.com");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		
			
			
			
			
			
			
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			
		    act.moveToElement(driver.findElement(By.xpath("//section[@id='Metal-form']/span"))).build().perform();
			driver.findElement(By.xpath("//span[@data-displayname='platinum']")).click();
		
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
			int count=driver.findElements(By.xpath("//div[@id='grid-view-result']/ul/li")).size();
			
			System.out.println(count);
			
			driver.close();

  }
}
