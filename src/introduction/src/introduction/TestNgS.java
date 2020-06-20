package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgS {
	public class SeleniumWebdriverTest {

		WebDriver driver = new ChromeDriver();

		@Test
		public void MyFirstTestNGTestCase2() throws InterruptedException {
			String title = driver.getTitle();
			System.out.print("Current page title is : " + title);

			WebElement user = driver.findElement(By.name("email"));
			user.sendKeys("sachintomar33@gmail.com");
			WebElement pwd = driver.findElement(By.name("pass"));
			pwd.sendKeys("loveisfun");
			WebElement signin = driver.findElement(By.name("login"));
			signin.click();

			Thread.sleep(1000);

			System.out.print("\n'SUCCESSFUL EXECUTION!!!");
		}

		@BeforeMethod
		public void startChrome() {
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login/");
		}

		@AfterMethod
		public void cleaupProc() {
			System.out.print("\nBrowser close");
			driver.quit();
		}

	}
}
