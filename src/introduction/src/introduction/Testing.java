package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {

@Test
public void Login() {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 WebElement  email=driver.findElement(By.id("email"));
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 WebElement password = driver.findElement(By.id("pass"));
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 WebElement login = driver.findElement(By.id("Loginbutton"));
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 email.sendKeys("nitishtomar33@gmail.com");
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 password.sendKeys("loveisfun");
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 login.click();
	 String actualUrl="https://www.facebook.com/login/";
	 String expectedUrl=driver.getCurrentUrl();
	 Assert.assertEquals(expectedUrl,actualUrl);
	 
	 
}
	
}
