package otherProjectfile;


	import java.io.IOException;


	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import PageObjectModel.ZerodaTable;
import Test.ZerodaLoginPageTest;
import day2.Browser;



	public class tabletest {
		WebDriver driver;
	
		
		@BeforeMethod
		public void BrowserLaunch() throws EncryptedDocumentException, InterruptedException, IOException {
			driver=Browser.openBrowser("https://kite.zerodha.com/");
			ZerodaLoginPageTest  zerodaLoginPageTest=new ZerodaLoginPageTest();
			zerodaLoginPageTest.loginWithValidCredentials();
			
		}
		
		@Test
		public void WatchListTable() {
			ZerodaTable zt=new ZerodaTable(driver);
			zt.WatchListTable();
			
		

}
	}
