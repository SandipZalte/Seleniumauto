package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorbyXPATH {
	public static void main(String[] args) {
		WebDriver driver = Browser.openBrowser("https://www.facebook.com/");			
		
		/*syntax-->
		1) xpath by attribute		 	 // tagname[@attibute='attribute values']
		
		2) vxpath by text-->		 //tagname[text()='partial text values ']
		
		3) xpath by Contains-->	 // tagname [contains(@ Attribute,'attribute values')]
		*/
		
		System.out.println("---------------------------------------------------------------------------");
		/*

		/*WebElement login_id = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]"));			//xpath by attribute
		login_id.sendKeys("pushkrajnate@facebook.in");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));					//xpath by attribute
		password.sendKeys("pushkaraj@123");
		
		WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));				//xpath by attribute
		login.click();
		
		
		WebElement forget=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));							// xpath by text
		forget.click();
		
		
		WebElement create =driver.findElement(By.xpath("//a[contains(@data-testid,\"open-registration-form-button\")]")); 			//xpath by xontains
		create.click();
		*/
		
		
		WebElement createacc =driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]"));					//xpath by xontains
		createacc.click();
		

	}

}
