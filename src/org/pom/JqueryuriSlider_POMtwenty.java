package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JqueryuriSlider_POMtwenty {
  @FindBy(xpath="//span[@tabindex='0']")
  private WebElement move;
  
  public JqueryuriSlider_POMtwenty(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  public void move(Actions act,int x,int y)
  {
	  act.dragAndDropBy(move, x, y).build().perform();
  }
 
}
