package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown_example2 {
	public static void main (String[] args) {
		
	WebDriver driver=Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
	WebElement drop=driver.findElement(By.xpath("//input[@placeholder='select your district']"));
	Select se= new Select(drop);
	se.deselectByVisibleText("Beed")	;
	
	}
}
