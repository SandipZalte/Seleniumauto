package day2;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMultiple {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = Browser.openBrowser("https://www.globalsqa.com/demo%20site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

		List<WebElement> picture = driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content')]"));

		int s = picture.size();
		System.out.println(s);

		WebElement Drop = driver.findElement(By.xpath("(//div[contains(@class,\"ui-widget-content ui\")][1])"));
		Actions actions = new Actions(driver);

		for (int i = 0; i < s; i++) { // 01234
			Thread.sleep(2000);
			Screenshot.takescreenshot(driver);
			Thread.sleep(1000);

			WebElement image = picture.get(i);
			actions.dragAndDrop(image, Drop);
			actions.perform();
		}

		List<WebElement> drag = driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle')]"));
		int b = drag.size();System.out.println(b);

		WebElement drop = driver.findElement(By.xpath("//ul[@class='gallery ui-helper-reset ui-helper-clearfix ui-droppable']"));
		Actions act = new Actions(driver);

		Thread.sleep(2000);Screenshot.takescreenshot(driver);Thread.sleep(1000);

		for (int j = b - 1; j >= 0; j--)

		{
			Thread.sleep(2000);
			Screenshot.takescreenshot(driver);
			Thread.sleep(1000);

			WebElement pict = drag.get(j);
			act.dragAndDrop(pict, drop);
			act.perform();
		}
		Thread.sleep(2000);Screenshot.takescreenshot(driver);Thread.sleep(1000);
		
	}

}
