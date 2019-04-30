package org.pom.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.HomePage;

public class TestCase1 {
	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.seleniumhq.org");
		HomePage hp=new HomePage(driver);
		
		hp.srch_sendKeys("sele");
		hp.go_btn();
		driver.navigate().back();
		hp.scrh_clear();
		hp.srch_sendKeys("TestNG");
		hp.go_btn();
	}

}
