package org.selenium.webdriver.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/PAVI_in/htmldata/BrokenLinks.html");
	
	List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
	for(WebElement a:allLinks) {
		
		HttpURLConnection con=(HttpURLConnection)new URL(a.getAttribute("href")).openConnection();
		int rCode=con.getResponseCode();
		if(rCode==200)
			System.out.println("Link is Working "+rCode+"  "+con.getResponseMessage());
		else
			System.out.println("Link is Broken "+rCode+"  "+con.getResponseMessage());
	}
	
	

	}

}
