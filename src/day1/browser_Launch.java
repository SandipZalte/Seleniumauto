package day1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class browser_Launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar file\\Browser Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		
			//		drive.navigate().refresh();
			//		Thread.sleep(2000);
			//		 drive.navigate().forward();
			//		 Thread.sleep(2000);
			//		 drive.navigate().back();
			//		 Thread.sleep(2000);
		
					 String title=driver.getTitle();
					 System.out.println(title);

		   String URL=driver.getCurrentUrl();
		   System.out.println(URL);
					   
			//		 Options op= drive.manage();	// we use manage method for WebDriver which  is option interface
			//		 Window win= op.window();		// we use Window method for Option interface which is Window interface
			//		 win.maximize();				// we use maximize method for Windows in interface  to maximize a Browser

		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		Dimension d= new Dimension(700, 950); 
		driver.manage().window().setSize(d);
		
	
		Point p= new Point(800, 600);
		driver.manage().window().setPosition(p);
		   
	
		
	}

}
