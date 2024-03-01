package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.actitime.pom.Homepage;
import com.actitime.pom.Loginpage;

//audio starts at 10:00 minitues
// At 20:00
// At 26:00 about frames works

/*when ever you want to read the data form the property file simply call the method getPropertydata() it will
read the data from property file give it to you.
i want url,username,password
*/

public class  Baseclass{

	public static WebDriver driver;
	
	@BeforeTest
	public void Openbrowser()
	{
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	@AfterTest
	public void Closebrowser()
	{
		Reporter.log("CloseBrowser",true);
		driver.quit();
		
	}
	@BeforeMethod
	public void Login() throws IOException {
		
		Reporter.log("Login",true);
		
		Filelibclass f=new Filelibclass();
		String ur = f.getPropertyData("url");
		String un=f.getPropertyData("username");
		String pw=f.getPropertyData("password");
		
		driver.get(ur);
		Loginpage p=new Loginpage(driver);
		p.setLogin(un, pw);
	}
	@AfterMethod
	public void Logout() throws InterruptedException {
		Reporter.log("Logout",true);
		Homepage h=new Homepage(driver);
		h.setLogout();
	}
}
