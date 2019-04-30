package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BluestoneGMwithemail_thirteenPOM {
  @FindBy(xpath="//input[@id='amount']")
  private WebElement amount;
  @FindBy(xpath="//input[@name='email']")
  private WebElement email;
  @FindBy(xpath="//div[@class='form-submit text-center auto-filled']/input")
  private WebElement start;
  
  public BluestoneGMwithemail_thirteenPOM(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  public void setAmount(String str)
  {
	  amount.sendKeys(str);
  }
  public void setEmail(String str)
  {
	  email.sendKeys(str);
  }
  public String amount_get()
  {
	return  amount.getAttribute("value");
  }
  public String email_get()
  {
	return  email.getAttribute("value");
  }
  public void start()
  {
	  start.click();
  }
}
