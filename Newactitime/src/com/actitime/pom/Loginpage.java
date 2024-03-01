package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// when ever any one want to login they can go with this code they will go to the login page directly
public class Loginpage {

	@FindBy (id="username")
	private WebElement untbx;
	
	@FindBy (name="pwd")
	private WebElement pwtbx;
	
	@FindBy (xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	
	
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setLogin(String un,String pw) {
		
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
		
	}
	
}
