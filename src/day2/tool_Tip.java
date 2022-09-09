package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tool_Tip {
	
		public void valididpass() {
			 WebDriver driver= Browser.openBrowser("https://jqueryui.com/tooltip/");
			 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")) );
			
			 WebElement yourage= driver.findElement(By.xpath("//input[ @id='age']"));
			 yourage.getAttribute("Title");
			
			 System.out.println( yourage.getAttribute("Title"));
			 
			  // with the help of get attribute we can get the value of attribute and we can print it
			 // tooltip means when mouse Hover over the element then some message showing
			 
		
	}
		public static void main(String[] args) {
			tool_Tip tp=new tool_Tip();
			tp.valididpass();
		}
		}


