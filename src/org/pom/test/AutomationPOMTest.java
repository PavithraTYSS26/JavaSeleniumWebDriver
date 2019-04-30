package org.pom.test;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.Address6;
import org.pom.AutomationPOM1;
import org.pom.DressAutomationPOM2;
import org.pom.EmailPwd5;
import org.pom.HomePage;
import org.pom.PrintDressAdd2Cart3;
import org.pom.ProceedAutomation4;

public class AutomationPOMTest {
	public static void main(String[] args) throws InterruptedException {
		
	        System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://automationpractice.com/index.php");
			
			AutomationPOM1 hp=new AutomationPOM1(driver);
			hp.srch_sendKeys("dresses");
			hp.go_btn();
			
			DressAutomationPOM2 da=new DressAutomationPOM2(driver);
			da.go_btn();
			
			PrintDressAdd2Cart3 cart=new PrintDressAdd2Cart3(driver);
			cart.go_btn();
	        cart.proceed_btn();
	        
	        ProceedAutomation4 proceed=new ProceedAutomation4(driver);
			proceed.go_btn();
			
			EmailPwd5 info=new EmailPwd5(driver);
			info.email("pavithrapec2018@gmail.com");
			info.pwd("pavithrapec2018");
			info.submit();
		
		    Address6 addProceed=new  Address6 (driver);
		    addProceed.addProceed();
		    
		    
		    Thread.sleep(2000);
		    driver.close();
			
		}
}
