package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleNg {

	@FindBy(xpath = "")private WebElement xyz;
	@FindBy(xpath = "")private WebElement xyz1;
	@FindBy(xpath = "")private WebElement xyz2;
	@FindBy(xpath = "")private WebElement xyz3;
	@FindBy(xpath = "")private WebElement xyz4;
//	
//	SampleNg(WebDriver driver){
//	PageFactory.initElements(driver, this);
//		
//	}
	@BeforeClass
	public void Beforeclass() {
		
		System.out.println("start execution Before class ");
	}
	@AfterClass
	public void Afterclass() {
		
		System.out.println("Start  execution after class ");
	}
	
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("Start Execution  Before Method");
	}
	
	@AfterMethod
	public void Aftermethod() {
		
		System.out.println("Start Execution Aftermethod");
	}
	
	
	@Test		// same as main Method
	public void test() {
		System.out.println("This test method");
				
	}
	
	@Test
	void Test1() {
		System.out.println("this Test1 method");
	}
	
	@Test
	public void Test2() {
		System.out.println("test2");
	}
	
	@Test
	public void Demo() {
		System.out.println("this demo method");
	}
	@Test
	public void example() {
		System.out.println("this example method");
	}
	
}
