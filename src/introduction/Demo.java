package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create driver object for chrome browser
		// we will strictly implemets methods of webDriver
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");//hit url on the browser
		
		System.out.println(driver.getTitle());

  System.out.println(driver.getCurrentUrl());
  
  
  
//System.out.println(driver.getPageSource());
  
driver.get("https://www.yahoo.com/");

driver.navigate().back();

driver.close();// it closes the cureent browser

//driver.quit(); // it closes the all the browser that open by selenium

	}

}
