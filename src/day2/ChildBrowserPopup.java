package day2;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserPopup {
	public static void main (String [] args) throws IOException, InterruptedException {
		
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/");
		WebElement selenium = driver.findElement(By.xpath("//a[text()=\"Start Selenium Practice\"]"));
		selenium.click();
		
		//String current_page =driver.getWindowHandle();		// this handle only main page  or home page only
		//System.out.println(current_page);
		
		Set<String > handles =driver.getWindowHandles();//get window handle will get the browser tab address that are curranty open  		// techniacally its known as Genric 
		Iterator<String >i =handles.iterator();	//Iterator method of set interface
														//the method Interface help us to fetch value from set
													
		
		//i.next();						//next method goest its goes on next tab or page 
		//System.out.println(i.next());
		
		while(i.hasNext())	{	//hasnext will return true if we have next value present in Iterator 			//its bollean form ans show
				
			String address=i.next();
			System.out.println(address);
			
			
			driver.switchTo().window(address);
			
			String title ="Practice Page";
			
			String Current_Title =driver.getTitle();
			System.out.println(Current_Title);

		if(title.equals(Current_Title)) 
		{		
				Screenshot.takescreenshot(driver);
				Thread.sleep(500);
				WebElement suegg_class =driver.findElement(By.xpath("//input [@class='inputs ui-autocomplete-input']"));
				suegg_class.click();
				suegg_class.sendKeys("Please Enter 8 Digit pass");
				
				WebElement redio =driver.findElement(By.xpath("//input[@value='Radio3']"));
				redio.click();
				
				
				
			}
			
				}
			
	}

}
