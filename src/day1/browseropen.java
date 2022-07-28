package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseropen {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar file\\Browser Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://kite.zerodha.com/");
	Thread.sleep(2000);

	driver.navigate().back();
	Thread.sleep(2000);

	driver.navigate().forward();
	Thread.sleep(2000);

	driver.navigate().refresh();

	Thread.sleep(2000);
	
}
}
