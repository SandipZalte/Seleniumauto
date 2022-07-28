package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Important_classes.Parametrized;
import PageObjectModel.ZerodaLoginPage;
import day2.Browser;

public class ZerodaLoginPageTest_Ng {
	WebDriver driver;

	@BeforeClass
	void beforeclass() {
		System.out.println("THis ths zeroda login page test ng file ");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("see the report");
	}

	@BeforeMethod// ------------>to launch browser with url
	public void openBrowser() {
		driver = Browser.openBrowser("https://kite.zerodha.com/");
	}

	@AfterMethod //-------------------> to  closed  open url browser only
	public void closeBrowser() {
		driver.close(); // -----> to closed the current method browser
		driver.quit();
	}

	//@Test(priority = 0) //------->to set which method run 1st and last that get decide on basis of priority i.e
						// --2 - 1 0 1 2--
	@Test(priority = 0)
	public void loginWithValidCredentials() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodaLoginPage zerodaLoginPage = new ZerodaLoginPage(driver);
		Thread.sleep(3000);

		String id = Parametrized.getdata(1, 0);
		String pass = Parametrized.getdata(1, 1);

		zerodaLoginPage.enteruserid(id);
		zerodaLoginPage.enterpassword(pass);
		zerodaLoginPage.clickonLogin();
	}

	@Test(priority = 1)
	public void LoginWithInvalidCredentials() throws EncryptedDocumentException, IOException {
		ZerodaLoginPage zerodaLoginPage = new ZerodaLoginPage(driver);
		String id = Parametrized.getdata(2, 0);
		String pass = Parametrized.getdata(2, 1);
		zerodaLoginPage.enteruserid(id);
		zerodaLoginPage.enterpassword(pass);
		zerodaLoginPage.clickonLogin();
	}

	@Test(priority = 2)
	public void loginWithValidUserId() throws EncryptedDocumentException, IOException {
		ZerodaLoginPage zerodaLoginPage = new ZerodaLoginPage(driver);
		String id = Parametrized.getdata(3, 0);
		String pass = Parametrized.getdata(3, 1);
		zerodaLoginPage.enteruserid(id);
		zerodaLoginPage.enterpassword(pass);
		zerodaLoginPage.clickonLogin();
	}

	@Test(priority = 3)
	public void loginWithValidPassword() throws EncryptedDocumentException, IOException {
		ZerodaLoginPage zerodaLoginPage = new ZerodaLoginPage(driver);
		String id = Parametrized.getdata(4, 0);
		String pass = Parametrized.getdata(4, 1);
		zerodaLoginPage.enteruserid(id);
		zerodaLoginPage.enterpassword(pass);
		zerodaLoginPage.clickonLogin();
	}

	@Test(priority = 4)
	public void loginWithoutCredentailas() {
		ZerodaLoginPage zerodaLoginPage = new ZerodaLoginPage(driver);
		zerodaLoginPage.clickonLogin();
	}

	@Test(priority = 5)
	public void openForget() {
		ZerodaLoginPage zlp = new ZerodaLoginPage(driver);
		zlp.clickonforget();
	}
	
	@Test(priority = 6)
	public void openSignup() {
		ZerodaLoginPage zlp = new ZerodaLoginPage(driver);
		zlp.clickonsignup();
	}

}
