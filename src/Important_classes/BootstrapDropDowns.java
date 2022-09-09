package Important_classes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstrapDropDowns {
	public static void main(String[] args) throws Exception {
		WebDriver driver=Browser.openBrowser("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
		
	
	
				
				driver.findElement(By.id("btnDropdownDemo")).click();
				List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]/a"));
				
				for (WebElement option : options) {
					String optionText = option.getText();
					if(optionText.equals("CSS")) {
						option.click();
						break;
					}
					System.out.println(optionText);
				}
				driver.quit();

//		// Multi-selection bootstrap dropdown
//		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
//		WebElement dropdownBtn = driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]"));
//		dropdownBtn.click();
//		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect-container')]/li[not(@class='multiselect-item multiselect-group')]/a/label"));
//		for (WebElement option : options) {
//			WebElement optionChk = option.findElement(By.tagName("input"));
//			String optionText = option.getText();
//			if(optionText.equals("Bootstrap"))
//					option.click();	
//			if(optionText.equals("Java"))
//				optionChk.click();	
//			if(optionText.equals("CSS") && option.findElement(By.tagName("input")).isSelected()) {
//				optionChk.click();
//			}
//		}
//		
//		if(Boolean.valueOf(dropdownBtn.getAttribute("aria-expanded")))
//			dropdownBtn.click();
//		
//		driver.quit();
	}
}