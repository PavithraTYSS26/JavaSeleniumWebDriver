package org.selenium.webdriver.popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadPopup {
  @Test
  public void fileUpload() throws IOException {
	  System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/upload");
		
		Runtime rt=Runtime.getRuntime();
	
		
		driver.findElement(By.xpath("//input[@name='uploadfile_0']")).click();
		rt.exec("D:\\uploade.exe");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		WebElement ele=driver.findElement(By.xpath("//h3/center"));
	
		//	Assert.assertEquals(, ele.getText());
  }
}
