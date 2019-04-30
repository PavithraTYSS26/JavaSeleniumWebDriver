package scenarios.e2e.general;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CraftVillasMenus {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Actions act = new Actions(driver);
			driver.get("https://www.craftsvilla.com/");
			
			List<WebElement> menus=driver.findElements(By.xpath("//div[@class='container']/ul/li/a[@first-click]"));
			
			for(int i=0;i<menus.size()-1;i++)
			{
				System.out.println(menus.get(i).getText());
				Thread.sleep(2000);
				act.moveToElement(menus.get(i)).build().perform();
				
				List<WebElement> subMenu=driver.findElements(By.xpath("//a[text()='"+menus.get(i).getText()+"']/following-sibling::div/div/ul/li/a"));
				System.out.println(subMenu.size());
				for(WebElement sub:subMenu)
				{   
					
					System.out.println(sub.getText());
				
				}
			}
			driver.close();
	}
	

	
}
