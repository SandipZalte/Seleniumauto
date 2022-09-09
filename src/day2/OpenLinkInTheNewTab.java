package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

public class OpenLinkInTheNewTab {
	public static void main(String[] args) {
		WebDriver driver=Browser.openBrowser("https://demo.nopcommerce.com/");
		WebElement product=driver.findElement(By.xpath("//a[text()='Register']"));
		
		//Keys.chord(Keys.CONTROL,Keys.RETURN);
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.xpath("//a[text()='Register']")).sendKeys(tab); 
		

	
		
	}
	
}
