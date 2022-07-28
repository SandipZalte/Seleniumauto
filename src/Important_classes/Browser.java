package Important_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver openBrowser(String URL) {				// this  is static method 

		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar file\\Browser Driver\\chromedriver_win32\\chromedriver.exe");	// key and values
		
		WebDriver driver = new ChromeDriver(); //object & up casting
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		//Dimension d=new Dimension(250, 900) ;
		//driver.manage().window().setSize(d);
		
		
		//Point p= new Point(800, 600);
		//driver.manage().window().setPosition(p);
		   
		
		driver.navigate().to(URL);
		return driver;

	}

}
