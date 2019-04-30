package scenarios.e2e.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PaytmE2E { // done without using assertions
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		Reporter.log(" paytm Application loaded successfully  ", true);

		WebElement ele1= driver.findElement(By.xpath("//span[text()='Mobile']"));
		ele1.click();
		String ev1=ele1.getText();
		System.out.println(ev1);
		Assert.assertEquals("Mobile", ev1);
		
		Reporter.log("Now on Mobile ",true);
/*
		WebElement ele2=driver.findElement(By.xpath("//input[@type='tel']"));
		String ev2=ele2.getText();
		Assert.assertEquals("Mobile ", ev1);
		ele1.sendKeys("9626722057");
		Reporter.log(" Mobile no  sent from script ",true);

		WebElement ele3=driver.findElement(By.xpath("//input[@maxlength='30']"));
		String ev3=ele3.getText();
		Assert.assertEquals("Mobile ", ev1);
		ele2.sendKeys("10");
		
		Reporter.log("Amount has been sent ",true);

		WebElement ele4=driver.findElement(By.xpath("//i[@class='_1nFl']"));
		String ev4=ele4.getText();
		Assert.assertEquals("Mobile ", ev1);
		ele3.click();
		Reporter.log("Checkbox selected  ",true);

		WebElement ele5=driver.findElement(By.xpath("//button[text()='Recharge Now']"));
		String ev5=ele5.getText();
		Assert.assertEquals("Mobile ", ev1);
		ele5.click();
		Reporter.log(" Recharge now ",true);

		WebDriver frame = driver.switchTo()
				.frame(driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']")));
		
		Reporter.log("Inside sub frame ",true);

		WebElement login= frame.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']"));
		String ev6=login.getText();
		Assert.assertEquals("Mobile ", ev1);
		Reporter.log(" Finding login ",true);

		login.click();
		
		Reporter.log("click on login  ",true);

		WebElement le1= frame.findElement(By.xpath("//input[@name='username']"));
		String ev7=le1.getText();
		Assert.assertEquals("Mobile ", ev1);
		le1.sendKeys("9626722057");
		Reporter.log("Mobile no ",true);

		WebElement le2=frame.findElement(By.xpath("//input[@name='password']"));
		String ev8=le2.getText();
		Assert.assertEquals("Mobile ", ev1);
		le2.sendKeys("jesus123");
		Reporter.log("Set password ",true);

		WebElement le3= frame.findElement(By.xpath("//span[contains(.,'Login Securely')]"));
		String ev9=le3.getText();
		Assert.assertEquals("Mobile ", ev1);
		le3.click();
		Reporter.log("click login ",true);
		
	    String warn=frame.findElement(By.xpath("//span[text()='Please enter valid username and Password']")).getText();

	
		Reporter.log(warn,true); */
	}
}
