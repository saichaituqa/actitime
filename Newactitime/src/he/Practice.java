package he;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://secure.indeed.com/auth?hl=en_IN&service=my&co=IN&continue=https%3A%2F%2Fin.indeed.com%2F%3Fr%3Dus");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-google-button")).click();
		
		driver.findElement(By.id("apple-signin-button")).click();
		
		Thread.sleep(2000);
		
		Set<String> w = driver.getWindowHandles();
		
		for(String all:w) {
			
		driver.switchTo().window(all);
		
		driver.close();
		
		}
	}
}


