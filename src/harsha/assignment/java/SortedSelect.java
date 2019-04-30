package harsha.assignment.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedSelect {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///D:/html%20pages%20new/sortedoptions.html");
		 List<WebElement> ele=driver.findElements(By.tagName("option"));
		 
		 Assert.assertEquals(ele.size(), 6);
		
		 for(WebElement s:ele)
		 {
			 System.out.println(s.getText());
		 }
		 
		 String[] str= {"Andra","Banglore","Karnataka","Kerala","Tamilnadu","Thirupattur"};
		
		
		
		 Set<String> set=new TreeSet<>(Arrays.asList(str));
		 List<String> nl=new ArrayList<>(set);
		
		 for(WebElement w:ele)
		 {
			System.out.println(w.getText().equals(set));
		 }
		 
		 Assert.assertEquals(nl,set);
		 System.out.println("done");
  }
}
