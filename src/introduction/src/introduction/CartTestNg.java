package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTestNg {
public ChromeDriver driver = new ChromeDriver();
	
@BeforeMethod
public void startChrome() {
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com");
}
@Test
public void MyFirstTestNGTestCase() throws InterruptedException {
	String title = driver.getTitle();
	System.out.print("Current page title is : " + title);

	driver.get(
			"https://www.amazon.in/JBL-C100SI-Ear-Headphones-Black/dp/B01DEWVZ2C/ref=sr_1_1?dchild=1&fst=as%3Aoff&qid=1592216586&refinements=p_89%3AJBL&rnid=3837712031&s=electronics&sr=1-1");
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("nitishtomar33@gmail.com");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("loveisfun");
	Thread.sleep(1000);

}


@AfterMethod
public void cleaupProc() {
	System.out.print("\nBrowser close");
	driver.quit();
}
	
}
