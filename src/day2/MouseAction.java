package day2;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws IOException, InterruptedException, HeadlessException, AWTException {
		
		WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions actions = new Actions(driver);
		actions.contextClick(rightClick);
		actions.perform();

		WebElement edit = driver.findElement(By.xpath("//li[contains(@class,'icon context-menu-icon-edit')]"));

		Actions actions1 = new Actions(driver);
		actions1.contextClick(edit);
		actions1.perform();

		
		Alert a = driver.switchTo().alert();

		Thread.sleep(1000);
		//Screenshot.snapshot();
		Screenshot.takescreenshot(driver);
		Thread.sleep(2000);
		
		a.accept();
		Thread.sleep(2000);

		Screenshot.takescreenshot(driver);
		Thread.sleep(2000);

	}



	
	
	
	
	}
