package org.selenium.webdriver.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksInGoogle {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java",Keys.ENTER);
	
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		List<String> lst1=new ArrayList<>();
		List<String> lst2=new ArrayList<>();
		
		for(WebElement a:allLinks) {
			    String str=null;
				str=a.getAttribute("href");
				if(str!=null)
				{
					lst1.add(a.getAttribute("href"));
				}
				else if(str==null)
				{
					lst2.add(a.getAttribute("href"));
				}
			}
		for(String s1:lst1)
		{
			HttpURLConnection con=(HttpURLConnection)new URL(s1).openConnection();
			int rCode=con.getResponseCode();
			if(rCode==200)
				System.out.println("Link is Working "+rCode+"  "+con.getResponseMessage());
			else
				System.out.println("Link is Broken "+rCode+"  "+con.getResponseMessage());
		}
		System.out.println("Total Number of Links..."+allLinks.size());
		System.out.println("Active Links--> "+lst1.size());
		System.out.println("Dummy Links--> "+lst2.size());
		driver.close();
	}

}
