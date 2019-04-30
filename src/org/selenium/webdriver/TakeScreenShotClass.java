package org.selenium.webdriver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotClass {
	public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sfile=ts.getScreenshotAs(OutputType.FILE);
	//  WebElement ele=driver.findElement(By.xpath("//div[@id='whiteBoxWithLogo']"));
	//	WebElement ele=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement ele=driver.findElement(By.xpath("//input[@name='pwd' and @type='password']"));

		
		Point loc=ele.getLocation();
		int xco=loc.getX();
		int yco=loc.getY();
		
		int wimg=ele.getSize().getWidth();
		int himg=ele.getSize().getHeight();
		
		BufferedImage rimg=ImageIO.read(sfile);
		BufferedImage fimg=rimg.getSubimage(xco+50, yco+80, wimg+50, himg+10);
		
		ImageIO.write(fimg, "png", sfile);
		
		File dfile=new File("D:\\TestYantra\\DriverProject\\ScreenShot\\pwd.png");
		Files.copy(sfile, dfile);
		driver.close();
		
		
		
		
		
	}

}
