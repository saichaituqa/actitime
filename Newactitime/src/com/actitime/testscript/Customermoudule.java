package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.generic.Filelibclass;
import com.actitime.pom.Homepage;
import com.actitime.pom.Tasklistpage;

// Test method name should be same name of test case name

@Listeners(com.actitime.generic.Listenerimplementation.class)
public class Customermoudule extends Baseclass implements ITestListener{
	
	@Test
	public void CreateCustomer() throws EncryptedDocumentException, IOException {
		
		Reporter.log("Create customer",true);
		
		Homepage p=new Homepage(driver);
		p.setTasktab();
		
		Tasklistpage t=new Tasklistpage(driver);
		t.getAddnew().click();
		t.getNewcusbtn().click();
		t.getCustomernametbx().sendKeys("sheet");
		t.getDiscriptiontbx().sendKeys("cusnamedis");
		t.getSelectdrpdwn().click();
		t.getOurcompanytx().click();
		t.getCreatecustomerbtn().click();
		
		Filelibclass f=new Filelibclass();
		String sheet = f.getExcelData("CreateCustomer", 1, 2);
		String cusnamedis=f.getExcelData("CreateCustomer", 1, 3);
	}
}
