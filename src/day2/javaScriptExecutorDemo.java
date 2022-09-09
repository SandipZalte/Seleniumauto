package day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaScriptExecutorDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
	 javaScriptExecutorDemo js= new javaScriptExecutorDemo();
	 js.validatefilds();
	}
	 
	 

	 public void validatefilds() throws IOException, InterruptedException {
	WebDriver driver= Browser.openBrowser("https://www.facebook.com/");
	
	// border and take screenshot of particular element 
	 WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	 //javaScriptExecutorUtils.drawBorder(driver, logo);
	 
	 //change the background colour
	 javaScriptExecutorUtils.changecolour("pink", driver, logo);
	 
	 javaScriptExecutorUtils.flash(driver, logo);
	 
	 WebElement id=driver.findElement(By.className("_6lux"));
	 javaScriptExecutorUtils.drawBorder(driver, id);	 
	 //print the title by using java script
	 javaScriptExecutorUtils.getTitleByJS(driver);  
	 

	
	 //create alert popup
	 javaScriptExecutorUtils.generateAlert(driver, "this is my alert");	 
	TimeUnit.MILLISECONDS.sleep(1000);  // for sleep purpose (Thread .sleep(1000)); both are same
	 javaScriptExecutorUtils.refreshBrowserrByJS(driver);		
	// scolldown up to buttom
	javaScriptExecutorUtils.scrollPageDown(driver);
	Thread.sleep(2000);
	//javaScriptExecutorUtils.scrollPageDown(driver);	
	// zoom the page 
	 javaScriptExecutorUtils.zoomPageByJS(driver,75);
	 
		// click the particular element by using JS
	 WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	 javaScriptExecutorUtils.clickElementByJS(driver, loginbutton);		
	 

	}
	
}