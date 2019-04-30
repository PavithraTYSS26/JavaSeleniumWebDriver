package harsha.assignment.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClassAss {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("D:/html%20pages%20new/SigleSelect.html");
		 List<WebElement> ele=driver.findElements(By.tagName("option"));
		
		 for(WebElement s:ele)
		 {
			 System.out.println(s.getText());
		 }
	}

}
