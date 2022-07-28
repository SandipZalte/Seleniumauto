package Test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import PageObjectModel.ExcelData;
import PageObjectModel.ZerodaLoginPage;
import day2.Browser;

public class ZerodaLoginPageTest {
	WebDriver driver;
	
	public void loginWithValidCredentials() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver=Browser.openBrowser("https://kite.zerodha.com/");
		ZerodaLoginPage zerodaLoginPage=new ZerodaLoginPage(driver);
		
		String id=ExcelData.getdata( 1, 0);
		String pass=ExcelData.getdata( 1,1);	
	
		zerodaLoginPage.enteruserid(id);
		zerodaLoginPage.enterpassword(pass);
		zerodaLoginPage.clickonLogin();
	}
	public void LoginWithInvalidCredentials() throws EncryptedDocumentException, IOException {
		driver=Browser.openBrowser("https://kite.zerodha.com/");
		ZerodaLoginPage zerodaLoginPage=new ZerodaLoginPage(driver);
		String id=ExcelData.getdata(2, 0);
		String pass= ExcelData.getdata(2, 1);
		
		zerodaLoginPage.enteruserid(id);
		zerodaLoginPage.enterpassword(pass);
		zerodaLoginPage.clickonLogin();
	}

	
	public void loginWithValidUserId() throws EncryptedDocumentException, IOException {
		driver=Browser.openBrowser("https://kite.zerodha.com/");

		ZerodaLoginPage zerodaLoginPage=new ZerodaLoginPage(driver);
		String id=ExcelData.getdata(3, 0);
		String pass= ExcelData.getdata(3, 1);
		
		zerodaLoginPage.enteruserid(id);
		zerodaLoginPage.enterpassword(pass);
		zerodaLoginPage.clickonLogin();
	}

	public void loginWithValidPassword() throws EncryptedDocumentException, IOException {
		driver=Browser.openBrowser("https://kite.zerodha.com/");

		ZerodaLoginPage zerodaLoginPage=new ZerodaLoginPage(driver);
		String id=ExcelData.getdata(4, 0);
		String pass= ExcelData.getdata(4, 1);
		
		zerodaLoginPage.enteruserid(id);
		zerodaLoginPage.enterpassword(pass);	
		zerodaLoginPage.clickonLogin();
	}

	public void loginWithoutCredentailas() {
		driver=Browser.openBrowser("https://kite.zerodha.com/");

		ZerodaLoginPage zerodaLoginPage= new ZerodaLoginPage(driver);
		zerodaLoginPage.clickonLogin();
	}
	
	public void openForget() {
		driver=Browser.openBrowser("https://kite.zerodha.com/");

		ZerodaLoginPage  zlp=new ZerodaLoginPage(driver);
		zlp.clickonforget();
	}
	
	public void openSignup() {
		driver=Browser.openBrowser("https://kite.zerodha.com/");

		ZerodaLoginPage zlp =new ZerodaLoginPage(driver);
		zlp.clickonsignup();
	}
	
	public static void main (String [] args) throws EncryptedDocumentException, IOException, InterruptedException   {
		ZerodaLoginPageTest  zerodaLoginPageTest=new ZerodaLoginPageTest();
	zerodaLoginPageTest.loginWithValidCredentials();
	zerodaLoginPageTest.LoginWithInvalidCredentials();
	zerodaLoginPageTest.loginWithValidUserId();
	zerodaLoginPageTest.loginWithValidPassword();
	zerodaLoginPageTest.loginWithoutCredentailas();
	zerodaLoginPageTest.openForget();
	zerodaLoginPageTest.openSignup();

	}
	
	

}
