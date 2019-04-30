package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(id="q")
	private WebElement srchbox;
	@FindBy(id="submit")
	private WebElement gobtn;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void srch_sendKeys(String str)
	{
		srchbox.sendKeys(str);
	}
	
	public void scrh_clear()
	{
		srchbox.clear();
	}
	
	public void go_btn()
	{
		gobtn.click();
	}
	
}
