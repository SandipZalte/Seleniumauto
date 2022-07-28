package day2;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeybordAction {

	public static void main(String[] args) throws InterruptedException, HeadlessException, IOException, AWTException {
		WebDriver driver= Browser.openBrowser("https://demoqa.com/text-box");
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		Actions actions= new Actions(driver);
		name.sendKeys("SANDIP ASHOK ZALTE");
		
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("sandip@yahoo.com");
		
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("MANMD NASHIK MH, india ");
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.sendKeys("c");
	
		actions.keyUp(Keys.CONTROL);
		
		actions.sendKeys(Keys.TAB);
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		
		actions.keyUp(Keys.CONTROL);
		actions.sendKeys(Keys.TAB);
	
		actions.sendKeys(Keys.ENTER);
		
		
		
		actions.build().perform();
	JavascriptExecutor js=(( JavascriptExecutor)driver);
	js.executeScript("window.scrollBy(0,1000)","");
	
	
	}

}
