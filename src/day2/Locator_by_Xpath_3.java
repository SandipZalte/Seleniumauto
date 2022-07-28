package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator_by_Xpath_3 {
	public static void main(String[] args) {

		WebDriver driver = Browser.openBrowser("https://vctcpune.com/");
		
		WebElement startsele = driver.findElement(By.xpath("html//body/div/div/header/div/div[2]/nav/ul/li[4]/a[2]"));		
		startsele.click();
												// absolute xpath

		WebElement name = driver.findElement(By.xpath("//html//body//li[6]//a"));
		name.click();
												// relative xpath
	}

}
