package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(id="logoutLink")
	private WebElement lgout;
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement Tasktab;
	
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void setLogout() throws InterruptedException {
		
		lgout.click();
		Thread.sleep(2000);
	}
	public void setTasktab() {
		
		Tasktab.click();
		
	}
	
}
