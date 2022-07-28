package day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_Practice {
public static void main(String []args) throws IOException, InterruptedException {
	
	WebDriver driver= Browser.openBrowser("https://www.amazon.in/");
	WebElement login= driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
	Actions actions= new Actions(driver);
	actions.contextClick(login);
	actions.perform();
	
	WebElement account =driver.findElement(By.xpath("//span[text()='Your Account']"));
	Actions  act= new Actions(driver);
	act.moveToElement(account);
	act.perform();
	account.click();
	Thread.sleep(2000);
	Screenshot.takescreenshot(driver);	
	Thread.sleep(2000);

	
	WebElement order=driver.findElement(By.xpath("//div[@class='a-box ya-card--rich']"));
	order.click();
	
	
	
	
	
	
}

}


