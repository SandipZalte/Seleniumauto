package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Location_or_SizeOfElement {
	public static void main(String[] args) {
		 WebDriver driver= Browser.openBrowser("https://www.facebook.com/");

		 // size
		 WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		 //method 1---------> Size
		 System.out.println("size of (x,y):" +logo.getSize());
		System.out.println( "size of x:" +logo.getSize().getWidth());
		System.out.println("size of y:" +logo.getSize().getHeight()); 

		// method ------->2
		 System.out.println("size of (x,y):" +logo.getRect());
		System.out.println("size of y:" +logo.getRect().getWidth());
		System.out.println( "size of x:" +logo.getRect().getHeight());
		
		// location
		
		 	System.out.println("Location  of (x,y):" +logo.getLocation());
			System.out.println( "location of x:" +logo.getLocation().getX());
			System.out.println("location of y:" +logo.getLocation().getY()); 
		
			// location of rectangle
		 	System.out.println("Location  of (x,y):" +logo.getRect());
			System.out.println( "location of x:" +logo.getRect().getX());
			System.out.println("location of y:" +logo.getRect().getY()); 
			
}
}
