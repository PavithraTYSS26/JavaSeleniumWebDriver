package harsha.assignment.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Link5assertions {
  @Test
  public void f() {
	     System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///D:/html%20pages%20new/linkspage.html");
		
		 List<WebElement> ele=driver.findElements(By.tagName("a"));
		
		 Assert.assertEquals(ele.size(), 5);
		
		 System.out.println("passed");
		 driver.close();
		
  }
}
