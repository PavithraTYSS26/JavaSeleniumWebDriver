package harsha.assignment.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearchCount {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			

			JavascriptExecutor js=(JavascriptExecutor)driver;
			Actions act = new Actions(driver);
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Ambika");
			List<WebElement> sug=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
			System.out.println(sug.size());
			for(WebElement suggestion: sug)
			{
				System.out.println(suggestion.getText());
			}
			driver.findElement(By.xpath("//ul[@class='erkvQe']/li[3]/descendant::span")).click();
			driver.close();
	}
}
