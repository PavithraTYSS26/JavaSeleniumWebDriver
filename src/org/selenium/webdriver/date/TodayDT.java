package org.selenium.webdriver.date;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TodayDT {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
	    driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		String str=driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='monthTitle']")).getText();
		String currentMonth=str.substring(0, 3);
		
		String nextMonth=LocalDate.now().plusDays(60).getMonth().toString().substring(0, 3);
		
		System.out.println("currentMonth  -->   "+currentMonth);
		System.out.println("nextMonth     -->   "+nextMonth);
		while(!currentMonth.equalsIgnoreCase(nextMonth))
		{
			driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='next']")).click();
			currentMonth=driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='monthTitle']"))
					.getText().substring(0,3);
		}
		System.out.println("newMonth      -->   "+currentMonth); 
		
		int date=LocalDate.now().plusDays(60).getDayOfMonth();
		System.out.println("date       -->   "+date);
		driver.findElement(By.xpath("//td[@class='we day' and contains(.,'"+date+"')]")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
