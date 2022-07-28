package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaLoginPage {// POM  means Page Object Model

	@FindBy (xpath="//input[@id='userid']")private WebElement userid;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login ;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forget;
	@FindBy(xpath="//a[@class='text-light']")private WebElement signup;
	
	public ZerodaLoginPage(WebDriver driver) {// User Defin Constrctor
		PageFactory.initElements(driver,this);
		}
		
		public void enteruserid(String enterid) {
		userid.sendKeys(enterid);
		}
		public void enterpassword(String pass) {
			password.sendKeys(pass);
		}
		public void clickonLogin() {
			login.click();
		}
		public void clickonforget() {
		forget.click();
		}
		public void clickonsignup() {
			signup.click();
		}
		
		
	}
