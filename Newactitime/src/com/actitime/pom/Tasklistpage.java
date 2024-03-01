package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasklistpage {

	@FindBy (xpath="//div[text()='Add New']")
	private WebElement Addnew;
	
	@FindBy (xpath="//div[text()='+ New Customer']")
	private WebElement Newcusbtn;
	
	@FindBy (id="customerLightBox_nameField")
	private WebElement customernametbx;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement discriptiontbx;
	
	@FindBy(xpath="//button[contains(text(),'active customer')]")
	private WebElement selectdrpdwn;
	
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement ourcompanytx;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createcustomerbtn;
	
	public Tasklistpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddnew() {
		return Addnew;
	}

	public void setAddnew() {
		Addnew.click();
	}

	public WebElement getNewcusbtn() {
		return Newcusbtn; 
	}

	public WebElement getCustomernametbx() {
		return customernametbx;
	}

	public WebElement getDiscriptiontbx() {
		return discriptiontbx;
	}

	public WebElement getSelectdrpdwn() {
		return selectdrpdwn;
	}

	public WebElement getOurcompanytx() {
		return ourcompanytx;
	}

	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}	
}
