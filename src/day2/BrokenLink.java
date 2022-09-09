package day2;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLink {
	public static void main(String[] args) {
		
	
	WebDriver driver= Browser.openBrowser("https://www.zlti.com/");
	List<WebElement> anchortag=driver.findElements(By.tagName("a"));
	int a=anchortag.size();
	System.out.println(a);
	for (int i=0;i<a;i++) {
		
		WebElement link=anchortag.get(i);
	String url=	link.getAttribute("href");
		System.out.println(url);
		if(url==null || url.isEmpty()) {
			System.out.println("url is empty");
			continue;
		}
		try {
			HttpURLConnection huc= (HttpURLConnection) (new URL(url).openConnection());
			huc.setRequestMethod("GET");
			huc.connect();
			int responsecode =huc.getResponseCode();
			if(responsecode<400)
			{
				System.out.println("It is valid Link" +url);
			}
			else {
				System.out.println("it's Broken Link"+url);
			}
		
		}
			
		 catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
	
			
		


		
		
	}}}	
		
	
	
	


