package day2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice_Login_FB {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=Browser.openBrowser("https://www.facebook.com/login/");
		
		/*WebElement usser=driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println(Parametrization.getdata("FB",4, 0));
		usser.sendKeys(Parametrization.getdata("FB",4,0));
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(Parametrization.getdata("FB", 4,1));
		System.out.println(Parametrization.getdata("FB", 4,1));*/
		
		
		String id=Parametrization.getdata("FB",5, 0);
		WebElement usserid=driver.findElement(By.xpath("//input[@id='email']"));
		usserid.sendKeys(id);
		System.out.println(id);
		
		String pass=Parametrization.getdata("FB", 5,1);
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys(pass);
		System.out.println(pass);
		
		
		
	}

}
