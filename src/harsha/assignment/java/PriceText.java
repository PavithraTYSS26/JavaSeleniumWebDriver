package harsha.assignment.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PriceText {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///D:/harshasir.html");
	  
	  int price=Integer.parseInt(driver.findElement(By.id("price")).getAttribute("value"));
	  int tickets=Integer.parseInt(driver.findElement(By.id("tickets")).getAttribute("value"));
	  int total=tickets*price;
	 
	  Assert.assertEquals( price,250);
	  System.out.println("price right");
	  Assert.assertEquals(tickets,3);
	  System.out.println("tickets right");
	  Assert.assertEquals(total,750);
	  System.out.println("total right");
	  
  }
}
