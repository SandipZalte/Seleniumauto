package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator_by_Xpath_2 {

	
	public static void main (String[] args) {
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/");
		
		//syntax
		// tag_name[contains(@ attribute,'attribute values' )][index number]
		
		
		
		/*WebElement home=driver.findElement(By.xpath("//a[contains(@aria-current,\"page\")][1]")); 	// locator xpath --> xpath by index
		home.click(); 
		
		WebElement aboutus= driver.findElement(By.xpath("//li [@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-545\"][1]"));
		aboutus.click();
		
		WebElement googlemap =driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_1_tb_footer et_pb_bg_layout_light']"));
		googlemap.click();
		
		
		
		
		
		WebElement course =driver.findElement(By.xpath("//a[text()='Courses'][1]"));
		course.click();
		
		WebElement whatsup = driver.findElement(By.xpath("//div[@style=\"display: flex; justify-content: center; align-items: center;  \"]"));
		whatsup.click();
		
		
		WebElement start_selenuium =driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]"));
		start_selenuium.click();
		
		WebElement contactus = driver.findElement(By.xpath("//a[@href='#contact']"));
		contactus.click();*/
		
		
		WebElement  velocity_found=driver.findElement(By.xpath("//a[text()='Velocity Foundation'][1]"));
		
		velocity_found.click();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
