package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpthofparentchildtraverserltnshp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//driver.findElement(By.xpath("//div[@class='RNNXgb’]/div/div[2]/div/input")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ayodhya");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
				
		

	}


			

}
