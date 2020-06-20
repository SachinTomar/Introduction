package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginn {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
		driver.findElement(By.id("email")).sendKeys("nitishtomar33@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Loveisfun");
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("nitishtomar33@gmail.com");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("loveisfun");
		//driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		driver.findElement(By.id("loginbutton")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}

}
