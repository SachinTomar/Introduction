package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rrrr {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	
WebElement form=driver.findElement(By.xpath("//*[@class='//input[@placeholder='From']']"));
//WebElement form=driver.findElement(By.cssSelector("body.desktop:nth-child(2) div.bgGradient div.minContainer div.widgetSection.appendBottom40 div.fsw.widgetOpen div.fsw_inner:nth-child(1) div.fsw_inputBox.searchCity.inactiveWidget.activeWidget:nth-child(1) div:nth-child(2) div:nth-child(1) div.hsw_autocomplePopup.autoSuggestPlugin div.react-autosuggest__container.react-autosuggest__container--open > input.react-autosuggest__input.react-autosuggest__input--open"));





	form.clear();
	form.sendKeys("MUM");
	form.sendKeys(Keys.ARROW_DOWN);
	form.sendKeys(Keys.ENTER);
}
