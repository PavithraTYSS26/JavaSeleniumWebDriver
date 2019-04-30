package scenarios.srinidhi.flipkart;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.pom.CSharp4;
import org.pom.Flipkart2_Price_Rate;
import org.pom.Flipkart_Home;
import org.pom.Flipkart_Next3;
import org.testng.annotations.Test;

public class C_Sharp_Flipkart {
	@Test
	public void c_Sharp_Flipkart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Set book = new TreeSet();
		Set rate = new TreeSet();
		Set price = new TreeSet();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		Flipkart_Home fh1 = new Flipkart_Home(driver);
		fh1.fk_close();
		fh1.fk_srch_sendKeys("c#");
		fh1.fk_go_btn();

		Flipkart2_Price_Rate fh2 = new Flipkart2_Price_Rate(driver);
		fh2.fk_priceL2H();
		fh2.fk_scroll(js);
		fh2.fk_rating(act);

		Flipkart_Next3 fh3 = new Flipkart_Next3(driver);
		fh3.fk_five(js);
		fh3.fk_csharp();

		Set<String> wh = driver.getWindowHandles();
		System.out.println(wh.size());
		for (String str : wh) {
			System.out.println(str);
			System.out.println(driver.getWindowHandle());
			driver.switchTo().window(str);
		}

		CSharp4 fh4 = new CSharp4(driver);

		fh4.fk_add2cart(driver);
		System.out.println("cart");

		fh4.fk_placeorder(driver);
		fh4.fk_phn_send("9626722057");
		fh4.fk_continue();
		fh4.fk_pwd_send("jesus@123");
		fh4.fk_login();
		Thread.sleep(3000);
		driver.close();

	}
}
