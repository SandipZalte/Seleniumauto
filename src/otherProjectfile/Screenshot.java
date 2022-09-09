package otherProjectfile;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import day2.DateTime;

public class Screenshot {

	/*-------------1st type of Screenshot method---------------*/

	public static void takescreenshot(WebDriver driver) throws IOException {
		
		String d = DateTime.getdate(); // method of daate and normal time class

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		// File Distination =new File("F:\\TESTING\\AUTOMATION\\Automation Screenshot/\\Screenshot "+d+".png");
		File Distination = new File("F:\\TESTING\\Eclipse IDE\\eclipse-workspace\\Automation\\src\\Screenshot\\Screenshot "+d+".png");
	FileHandler.copy(Source, Distination);
	//FileUtils.copyFile(Source, Distination);
	}

	/*-------------- 2nd type of screenshot----------*/

	public static void takescreenshotwithname(WebDriver driver, String name) throws IOException {
		
		String d = DateTime.datetime(); // method of time class

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 File destination = new File("F:\\TESTING\\AUTOMATION\\Automation\\Screenshot\\"+name+" "+d+".png");
//		File destination = new File("F:\\TESTING\\Eclipse IDE\\eclipse-workspace\\Automation\\src\\Screenshot/" + name + " " + d + ".png");
		FileHandler.copy(source, destination);

	}

	/*-------------3rd type of Screenshot method---------------*/

	public static void snapshot() throws IOException, HeadlessException, AWTException {
		BufferedImage img = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		String d = DateTime.getdate();
		File path = new File(
				"F:\\TESTING\\Eclipse IDE\\eclipse-workspace\\Automation\\src\\Screenshot/screenshot " + d + ".png");
		ImageIO.write(img, "png", path);

	}
	/*-------------4th type of Screenshot method---------------*/

	public static void snapshotwithname(String Name) throws IOException, HeadlessException, AWTException {
		BufferedImage img = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		String d = DateTime.getdate();
		File path = new File(
				"F:\\TESTING\\Eclipse IDE\\eclipse-workspace\\Automation\\src\\Screenshot/" + Name + d + ".png");
		ImageIO.write(img, "png", path);

	}
	
	
//	/*-------------5rd type of Screenshot method---------------*/
//
//	public static void takescreenshotA(WebDriver driver) throws IOException {
//		String d = DateTime.datetime(); // method of daate and normal time class
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File Source = ts.getScreenshotAs(OutputType.FILE);
//		// File Distination =new File("F:\\TESTING\\AUTOMATION\\Automation
//		// Screenshot/\\Screenshot "+d+".png");
//		File Distination = new File(
//				"F:\\TESTING\\Eclipse IDE\\eclipse-workspace\\Automation\\src\\Screenshot/screenshot " + d + ".png");
//
//		FileHandler.copy(Source, Distination);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * public static void main (String[] args) throws IOException { String
	 * d=DateTime.getdate(); // method of time class
	 * 
	 * WebDriver driver=Browser.openBrowser("https://www.facebook.com/"); WebElement
	 * error=driver.findElement(By.
	 * xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	 * error.click();
	 * 
	 * //-------------1st type of Screenshot----------------- TakesScreenshot
	 * ts=(TakesScreenshot)driver; File Source =ts.getScreenshotAs(OutputType.FILE);
	 * File Distination =new
	 * File("F:\\TESTING\\AUTOMATION\\Automation Screenshot/\\Screenshot2 "+d+".png"
	 * ); FileHandler.copy(Source, Distination);
	 * 
	 * 
	 * 
	 * 
	 * // -------------- 2nd type of screenshot----------
	 * 
	 * File Sors= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); File
	 * Disti = new File("\"D:\\DOWNLOAD\\Screenshot\"screenshot "+d+".png");
	 * FileHandler.copy(Sors, Disti);
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
}
