package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver openBrowser(String URL) {		// this  is static method 

		System.setProperty("webdriver.chromedriver",
				"C:\\Selenium jar file\\Browser Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // up casting
		
		driver.navigate().to(URL);
		
		driver.manage().window().maximize();
		
		return driver;

	}

}
