package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressAutomationPOM2 {
	@FindBy(xpath="//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']")
	private WebElement printdress;
	
	@FindBy(xpath="//div[@class='box-cart-bottom']/div/p/button")
	private WebElement cart;
	
	
	public DressAutomationPOM2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void go_btn()
	{
	 printdress.click();
	}
	
	public void cart_btn()
	{
	 cart.click();
	}

}
