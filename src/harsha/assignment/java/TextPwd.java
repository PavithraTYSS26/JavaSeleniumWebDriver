package harsha.assignment.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextPwd {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/html%20pages%20new/idpwd.html");
		
		driver.findElement(By.id("txt")).sendKeys("TestYantra");
		
		String str=driver.findElement(By.id("txt")).getAttribute("value");
		
		driver.findElement(By.id("pwd")).sendKeys(str);
  }
}
