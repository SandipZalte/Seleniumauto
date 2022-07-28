package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Practiceformfill {
	public static void main(String[] args) {
		WebDriver driver = Browser.openBrowser("https://www.globalsqa.com/samplepagetest/");

WebElement num=driver.findElement(By.xpath("//*[@id=\"g2599-name\"]"));
		num.click();
		num.sendKeys("Sandip");
		WebElement mail = driver.findElement(By.xpath("//*[@id=\"g2599-email\"]"));
		mail.click();
		mail.sendKeys("NANASHS@DHHDD");
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"g2599-experienceinyears\"]"));
	Select a=new Select(drop);
	a.selectByIndex(3);

	}

}
