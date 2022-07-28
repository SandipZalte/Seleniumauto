package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframe_PracticeSheet1 {
	
	public static void main (String  args[]) {
		
		WebDriver driver=Browser.openBrowser("https://ui.vision/demo/webtest/frames/");
		WebElement f3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(f3);
		WebElement name= driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("SANDIP");
		
		WebElement redo= driver.findElement(By.xpath("//div[@class='vd3tt']"));
		redo.click();
		
		WebElement redoi= driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[3]"));
		redoi.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
