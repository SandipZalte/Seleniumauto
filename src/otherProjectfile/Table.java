package otherProjectfile;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import day2.Browser;
//
//public class Table {
//	WebDriver driver;
//
//	public void TableColumnName() {
//		WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
//		// WebElement
//		// tha=driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]"));
//		// System.out.println(tha.getText());
//
//		List<WebElement> headings = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th"));
//		int size = headings.size();
//
//		for (int i = 0; i < size; i++) {
//			WebElement headname = headings.get(i);
//			System.out.println(headname.getText());
//
//		}
//	}
//
//	public static void MaxmumCurrentPrice() {
//		WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
//
//		List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//td[4]"));
//		int size = currentprice.size();
//		System.out.println("total number of record-->" + size);
//		double maxPrice = 0;
//		int index = 0;
//
//		for (int i = 0; i < size; i++) {
//			WebElement price = currentprice.get(i);
//			String value = price.getText();
//			double amount = Double.parseDouble(value);
//
//			if (amount > maxPrice) {
//				maxPrice = amount;
//				index = i;
//			}
//		}
//		System.out.println("maximum price is-->" + maxPrice);
//
//		List<WebElement> name = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//td[1]"));
//		WebElement stockname = name.get(index);
//		System.out.println(stockname.getText());
//
//	}
//
//	public void minmumCurrentPrice() {
//
//		WebDriver driver = Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
//		List<WebElement> cp = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//td[4]"));
//		int cpsize = cp.size();
//		int index = 0;
//		double maxprice = 0;
//
//		System.out.println("current price number of records" + cpsize);
//		for (int i = 0; i < cpsize; i++) {// 0
//			WebElement value = cp.get(i);
//			String price = value.getText();
//			double Amt = Double.parseDouble(price);
//			if (Amt > maxprice) {
//				maxprice = Amt;
//
//			}
//		}
//		System.out.println("Maxmum price of Current price is-->" + " " + maxprice);
//
//		for (int j = 0; j < cpsize; j++) {
//
//			WebElement value = cp.get(j);
//			String price = value.getText();
//			double Amt = Double.parseDouble(price);
//			if (Amt < maxprice) {
//				maxprice = Amt;
//				index = j;
//			}
//
//		}
//		System.out.println("minmum price of Current priceis-->" + maxprice);
//		List<WebElement> name = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//td[1]"));
//		WebElement stockname = name.get(index);
//		System.out.println(stockname.getText());
//
//	}
//
//	public void fulltable() {
//
//		driver = Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
//		List<WebElement> tableheadname = driver.findElements(By.xpath("//table[@class='dataTable']//tr//th"));
//		List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
//
//		List<WebElement> column = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
//	
//		int col = column.size();
//		int head = tableheadname.size();
//		int rowsize = row.size();
//		for (int i = 0; i < head; i++) {
//			WebElement headname = tableheadname.get(i);
//			System.out.print(headname.getText() + "|");
//		}
//		
//		
//		
//		for (int i = 0; i <= rowsize; i++) {
//			
//			for (int j = 0; j <=col; j++) {	try{
//				WebElement x=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]"));
//				System.out.print( x.getText());
//			}
//				
//				catch(Exception e) {
//					
//				}
//						
////				WebElement name=column.get(j);
////			System.out.print(name.getText()+" ");
//
////				System.out.print(
////						driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]")).getText());
//
//			}
//			System.out.println();
//
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Table obj = new Table();
//		// obj.TableColumnName();
//		// obj.MaxmumCurrentPrice();
//		// obj.minmumCurrentPrice();
//		obj.fulltable();
//
//	}
//}
