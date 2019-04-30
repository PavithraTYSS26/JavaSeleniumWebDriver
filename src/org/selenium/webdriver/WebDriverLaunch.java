package org.selenium.webdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
/*		driver.get("https://www.urbanladder.com/")
		
		List<WebElement> lst=driver.findElements(By.xpath("//span/ancestor::nav"));
		for(WebElement we:lst)

    	{
			System.out.println(we.getText());
		}
	String str=driver.getCurrentUrl();
    System.out.println(str+"      url       ");
    System.out.println(driver.getPageSource());
    System.out.println("    title        "+driver.getTitle());
    */
/*driver.navigate().to("https://www.urbanladder.com");
driver.navigate().forward();
driver.navigate().back();
driver.navigate().refresh();
*/

	
	/* driver.get("https://www.paytm.com/");
     List<WebElement> lst=driver.findElements(By.xpath("//div[@class='_2kcr']/a/descendant::span"));
	for(WebElement we:lst)

    {
		System.out.println(we.getText());
	}
	*/
	 driver.get("https://www.jabong.com/?utm_source=cpv_opicle&utm_medium=affiliate&utm_campaign=Homepage&utm_content=7750_20860_0_0_0_27986_0");
  /*   List<WebElement> lst=driver.findElements(By.xpath("//div[@class='_2kcr']/a/descendant::span"));
	for(WebElement we:lst)

    {
		System.out.println(we.getText());
	}
*/
   //toprint all menus
		
   //div[@class='_2kcr']/a/descendant::span
		
		
		
	////ul[@class="topnav bodytext"]/li/span[contains(.,'Living')]/following-sibling::
	//div[@class="subnavlist lt"]/descendant::div[@class="taxontype"]
	///a[contains(.,'Sofa Set')]/parent::div/following-sibling::ul/descendant::a
		
		
	


   

	
   }
}















