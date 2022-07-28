package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ZerodaTable {
	@FindBy(xpath="//ul[@class='marketwatch-selector list-flat']//li")private  List <WebElement> page1to7;
	@FindBy (xpath="//div[@class='vddl-list list-flat']//div[1]//div[1]")private List <WebElement> row;
	@FindBy (xpath="//body/div[@id='app']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span")private List <WebElement> column;

public ZerodaTable (WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void WatchListTable() {
		int rowsize=row.size();
		
			  
		for (int i = 0; i < rowsize; i++) {
			WebElement currentStock = row.get(i);
			String name = currentStock.getText();
			System.out.println(name);

}
}
}
