package scenarios.e2e.general;

import java.awt.AWTException;
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

import com.google.common.io.Files;

public class ScreenShotUsingRobotClass {
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
				//take screenshot
				WebElement ele=driver.findElement(By.xpath("//input[@value='Search']"));
				Rectangle ra=new Rectangle(600, 600);
				Robot r=new Robot();
				String path="D:\\TestYantra\\DriverProject\\ScrollShot\\robo.png";
				BufferedImage src=r.createScreenCapture(ra);
				File dest=new File(path);
				ImageIO.write(src, path, dest);
			     
				String path1="D:\\TestYantra\\DriverProject\\ScrollShot\\ele.png";
				File scn=ele.getScreenshotAs(OutputType.FILE);
				File dcn=new File(path1);
				Files.copy(scn, dcn);
				driver.close();
				
				
	 }
}
