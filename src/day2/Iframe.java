package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {
	
	public static void main (String [] args) {
		WebDriver driver=Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		
		//driver.switchTo().frame("courses-iframe");		// using by Id
	//	driver.switchTo().frame(0);		//	using by id
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframe-name']")));		//using By Webelement
		
		
		
		/*WebElement iframe=driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
		driver.switchTo().frame(iframe);*/
		
		
		
		WebElement course=driver.findElement(By.xpath("//a[text()='Courses'][1]"));
		course.click();
		
		//a[text()='Start Selenium Practice']
		/*WebElement student=driver.findElement(By.xpath("//a[text()='Student Review']"));
		
		student.click();
		WebElement map=driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_1_tb_footer et_pb_bg_layout_light']"));
		map.click();*/
	}

}
