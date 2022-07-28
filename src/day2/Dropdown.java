package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main (String [] args) {
		
//example 1st 	
//		WebDriver driver=Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
//		WebElement dropdown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//		Select s= new Select (dropdown);
//		//s.selectByIndex(1);
//		//s.selectByVisibleText("Option3");
//		
//		s.selectByValue("option2");
		
//example 1st 		
		WebDriver driver=Browser.openBrowser("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement country= driver.findElement(By.tagName("select")) ;
		
		Select se=new Select(country);
		se.selectByValue("BHS");
	

		

	}

}
