package Important_classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaScriptExecutorUtils {
	
	//Drawing Border and take screenshot
	//flash
	//get title of te page
	// click action
	// genrate alert
	// refreshig page
	// scrolling action
	// scrolling up
	 // zoom in and out the page
	public static void drawborder(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].style.border='3px solid red'", element );
		
		
	}
	

}
