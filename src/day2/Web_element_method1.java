package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Web_element_method1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		System.out.println("------------- isdisplayed method -------------------");
		
		WebElement name = driver.findElement(By.xpath("//input [@class='inputs displayed-class']"));
		name.sendKeys("SandipZalte");

		WebElement hide = driver.findElement(By.xpath("//input [@onclick='hideElement()']"));
		boolean h1 = hide.isDisplayed();
		System.out.println(h1);
		hide.click();
		boolean hi = name.isDisplayed(); // isdisplayed method
		System.out.println(hi);
		
		WebElement show =driver.findElement(By.xpath("//input[@onclick='showElement()']"));
		show.click();


		
		System.out.println("------------- gettext method------------------------");

		WebElement redoname = driver.findElement(By.xpath("//label[@for='Radio3']"));
		redoname.getText();
		String redio3 = redoname.getText(); // gettext method
		System.out.println(redio3);

		WebElement welcome = driver.findElement(By.xpath("//*[@id=\"topheader\"]/section/div/h1"));
		String x = welcome.getText();
		System.out.println(x);
		
		
		System.out.println("------------- clear() method ------------------------");
		
		WebElement text=driver.findElement(By.xpath("//input[@id='displayed-text']"));
		text.clear();
	}

}
