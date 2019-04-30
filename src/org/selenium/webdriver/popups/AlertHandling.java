package org.selenium.webdriver.popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/index.php");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		Alert a=driver.switchTo().alert();
		
		
		a.accept();
		
		System.out.println(a.getText());
		
		//a.dismiss();
		
  }
}
