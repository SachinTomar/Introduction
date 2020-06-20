package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Select s= new Select(driver.findElement(By.id(("ctl00_mainContent_DropDownListCurrency"))));
		//s.selectByValue("AED");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.selectByValue("AED");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.selectByIndex(3);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		//System.out.println(driver.getTitle());
		
		
	driver.close();
	
		//static drop down only work for select class

	}
		

}
