package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

public class openUrl_In_2Tab {
	WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver=Browser.openBrowser("https://demo.nopcommerce.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);// its open the link in new tab only
		
		//driver.switchTo().newWindow(WindowType.WINDOW);// its open new Window with new tab
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Actions  act= new Actions(driver);
		act.clickAndHold().sendKeys(Keys.CONTROL,Keys.TAB);
		act.build().perform();
		WebElement  gender= driver.findElement(By.id("gender-male"));
		gender.click();
		

}
}
