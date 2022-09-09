package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAction {

	public static void main(String[] abc) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium jar file\\Browser Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.xpath("//input[@id='g2599-name']"));

		name.sendKeys("Sandip Ashok Zalte");
		
		WebElement alert = driver.findElement(By.xpath("//button[text()='Alert Box : Click Here']"));

		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//scrollby using Pixcel
		//js.executeScript("window.scrollBy(0,1200)","");
		
//Scroll by using Element
		//js.executeScript("arguments[0].scrollIntoView(true)",alert);	
		js.executeScript("arguments[0].scrollIntoView()",alert);
	
// scroll by using till the bottom
		
		js.executeScript("window.scrollTo(0,documents.body.scrollHight)");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scollIntoView(true)", alert);
//		// js.executeScript("window.scrollby(100,200)");

	
}
