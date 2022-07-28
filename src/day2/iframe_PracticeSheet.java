package day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframe_PracticeSheet {
	public static void  main(String [] args) throws IOException {
		
	WebDriver driver=	Browser.openBrowser("http://demo.automationtesting.in/Frames.html");
		
	/*WebElement singleframe= driver.findElement(By.xpath("//a[@data-toggle=\"tab\"]"));
		singleframe.click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		WebElement input= driver.findElement(By.xpath("//input[@type='text']"));
		//input.click();
		input.sendKeys("HELO WELECOME TO INDIA ");*/
		
		//____________________________________________________________________________________________
		
		WebElement multiframebutt=driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
		multiframebutt.click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		WebElement input= driver.findElement(By.xpath("//input[@type='text']"));
		input.click();
		
				
		WebElement name= driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("SANDIP");
		//____________________________________________________________________________________________

		driver.switchTo().defaultContent();	//  this defaultContent() method goes direct home page
		WebElement Swtch=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		Swtch.click();
		Screenshot.takescreenshotwithname(driver,"sandip");
		
		

		
		
		
		
	}

}
