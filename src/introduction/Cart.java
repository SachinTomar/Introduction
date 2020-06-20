package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/JBL-C100SI-Ear-Headphones-Black/dp/B01DEWVZ2C/ref=sr_1_1?dchild=1&fst=as%3Aoff&qid=1592216586&refinements=p_89%3AJBL&rnid=3837712031&s=electronics&sr=1-1");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("nitishtomar33@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("loveisfun");

	}

}
