package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Web_Element_method {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/radio.html");
		
		System.out.println("------------- is selected method------------------------");

		WebElement redio = driver.findElement(By.xpath("//input[@value='Option 3']"));
		
		boolean x = redio.isSelected();
		System.out.println(x);
		
		redio.click();						
		
		boolean x1 = redio.isSelected();  // redio button (is selected method is used )  o/p is in boolean form
		System.out.println(x1);

	
		System.out.println("------------- checkbox------------------------");

		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
		 boolean tickbox2= checkbox2.isSelected()	;
		 System.out.println(tickbox2);
		 
		 checkbox2.click();
		 boolean chk=checkbox2.isSelected(); 		//checkbox 
		 System.out.println(chk);
		
		
		
		
		
		
		
		
	}

}
