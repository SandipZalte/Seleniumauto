
package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.OnDefaultValue;

public class WaitsinSelenium {

	private static final Class<? extends Throwable> Exceptiononclass = null;

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar file\\Browser Driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
WebDriverWait wt=new WebDriverWait(driver, Duration.ofMillis(3000));


FluentWait<WebDriver>wait=new <WebDriver>FluentWait(driver);
wait.withTimeout(Duration.ofMillis(3000));
wait.pollingEvery(Duration.ofMillis(100));
wait.ignoring(Exceptiononclass);
wait.until(Exepectedcondition.visibiltyof)



	}

}
