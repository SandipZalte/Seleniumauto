package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main (String [] args) {
	WebDriver driver=	Browser.openBrowser("https://www.globalsqa.com/demo%20site/draganddrop/");
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
	
	WebElement picture=driver.findElement(By.xpath("//li[contains(@class,'ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle')]"));

	WebElement drop=driver.findElement(By.xpath("(//div[@id='trash'])[1]"));
	Actions act=new Actions(driver);
	act.dragAndDrop(picture, drop);
	act.perform();
		
		
		
		
		
		
	}
}
