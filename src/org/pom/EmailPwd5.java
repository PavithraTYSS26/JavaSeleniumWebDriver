package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPwd5 {

	
	
	@FindBy(xpath=" //input[@id='email']")
	private WebElement email;
	@FindBy(xpath=" //input[@id='passwd']")
	private WebElement pwd;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement submit;
	
	
	public EmailPwd5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void email(String str)
	{
		email.sendKeys(str);
	}
	
	public void pwd(String str)
	{
		pwd.sendKeys(str);
	}
	public void submit()
	{
		submit.click();
	}
}
