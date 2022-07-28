package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
 public void valididpass() {
	 WebDriver driver= Browser.openBrowser("https://www.facebook.com/");
	 WebElement userid=driver.findElement(By.xpath("//input[@id='email']"));
	 userid.sendKeys("SANDIPZALTE");
	 
	 WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	 password.sendKeys("sandip@12345");
	 WebElement loginbutton= driver.findElement(By.xpath("//button[@type='submit']"));
	 loginbutton.click();
 }

 public void invalidId( ) {
	 WebDriver driver= Browser.openBrowser("https://www.facebook.com/");
	 WebElement userid=driver.findElement(By.xpath("//input[@id='email']"));
	 userid.sendKeys("sandipparkhe");
	 WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
	 password.sendKeys("12345@12345");
	 WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	 loginbutton.click();
	 
 }
 public void invalidpass() {
	 WebDriver driver =
			 Browser.openBrowser("https://www.facebook.com/");
	 WebElement userid =driver.findElement(By.xpath("//input[@id='email']"));
	 userid.sendKeys("SANDIP ZALTE");
	 WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
	 password.sendKeys("12345");
	 WebElement loginbutton= driver.findElement(By.xpath("//button[@type='submit']"));
	 loginbutton.click();
	 
	 
 }
 public void withoutIdAndPasswordLogIn() {
	 WebDriver driver= Browser.openBrowser("https://wwww.facebook.com/");
	 WebElement loginbutton= driver.findElement(By.xpath("//button[@type='submit']"));
	 loginbutton.click();
	 
 }
 public void Forgottenpassword() {
	 WebDriver driver= Browser.openBrowser("https://wwww.facebook.com/");
	 WebElement forgetpassword=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	 forgetpassword.click(); 
 }
 public void CreateNewAccount() {
	 WebDriver driver= Browser.openBrowser("https://wwww.facebook.com/");
	 WebElement createnewaccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	 createnewaccount.click(); 
	 
 }
public void CreateaPage() {
	WebDriver driver= Browser.openBrowser("https://wwww.facebook.com/");
	 WebElement createapage=driver.findElement(By.xpath("//a[text()='Create a Page']"));
	 createapage.click(); 
}
public static void main(String[]args) {
	
	FacebookLoginPage flp= new FacebookLoginPage();
	flp.valididpass();
	flp.invalidId();
	flp.invalidpass();
	flp.withoutIdAndPasswordLogIn();
	flp.Forgottenpassword();
	flp.CreateNewAccount();
	flp.CreateaPage();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
