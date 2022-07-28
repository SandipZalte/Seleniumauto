package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class locators {



	public static void main(String[] args) {

		WebDriver driver = Browser.openBrowser("https://www.facebook.com/");
	


//		WebElement email = driver.findElement(By.id("email")); // locator by id
//		email.sendKeys("RAJARAM_MOHAN_ROY");				//System.out.println(email);
//
//		WebElement password = driver.findElement(By.name("pass"));
//		password.sendKeys("rajaram@123");					//System.out.println(password);				
//
//		WebElement login = driver.findElement(By.tagName("button"));
//		login.click();

//	
//		WebElement ussername =driver.findElement(By.id("email"));			// locator by id
//		ussername.sendKeys("SITARAM_PANCAL@123Gamil.com");
//		
//		
//		WebElement password =driver.findElement(By.name("pass"));			// locator my name
//		password.sendKeys("setaram12345");
//		
//		
//		WebElement login= driver.findElement(By.tagName("button"));				// locator by tag name
//		login.click();

//		WebElement forget_pass =driver.findElement(By.className("_6ltj"));		// locator by class  --> class name should be parent class name 
//		forget_pass.click();
//		

//		WebElement createacc = driver.findElement(By.cssSelector("a[class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")); 
//																																// locator by css--> tagname["attribute=attribute values"]
//		createacc.click();
		
		
//		WebElement Create_a_Page =driver.findElement(By.linkText("Create a Page"));  		// locator by text
//		Create_a_Page.click();
		
		
	WebElement crtpage =driver.findElement(By.partialLinkText("Forgotten")); 		//locator by the partial  text--> means half text
		crtpage.click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
