package harsha.assignment.java;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonImgLinksTextbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/index.php");
		
		By by=By.xpath("//input[@type='button']|//img|//a|//input[@type='text']");
		
		List<WebElement> all=bilt(driver,by);
		int link=0,button=0,img=0,text=0;
		
		for(WebElement we:all)
		{
			if(we.getTagName().equals("a")) {
				link++;
			}
			else if(we.getTagName().equals("img"))
			{
				img++;
			}
			else if(we.getTagName().equals("input"))
			{
				if(we.getAttribute("type").equals("text"))
					text++;
				else if(we.getAttribute("type").equals("button"))
					button++;
			}
			
			
		}
		
		System.out.println(" 4 Elements in the webpage "+all);
		
		System.out.println("Links "+link);
		System.out.println("Text  "+text);
		System.out.println("Image "+img);
		System.out.println("Button"+button);
		
	}
	
	
	

	public static List<WebElement> bilt(WebDriver driver,By by)
	{
		return driver.findElements(by);
	}
}
