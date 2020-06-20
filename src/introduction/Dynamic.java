package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goindigo.in/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//div[@class='col-sm-5 col-5 padd-left']//input[@placeholder='From']
		
	driver.findElement(By.xpath("//input[@class='form-control or-src-city']")).clear();
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//input[@class='form-control or-src-city']")).sendKeys("MUM");
		
		
		//driver.findElement(By.xpath("//input[@name='or-src']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//div[@name='Mumbai']")).click();
	//driver.findElement(By.xpath("(//div[@data-iata='BOM'])[2]")).sendKeys("MUM");
	//driver.findElement(By.xpath("(//div[@data-iata='BOM'])[2]")).sendKeys(Keys.ENTER);
	
	
		//driver.findElement(By.xpath("(//div[@data-iata='BLR'])[2]")).click();

}
}