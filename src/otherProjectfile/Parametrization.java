package otherProjectfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {	// get data from xlsx sheet
	
///*-----------------------getData()---------------Method 1st-------------------------------------*/
//	public static String getData(String SheetName, int Row, int Cell) 		// 
//			throws EncryptedDocumentException, IOException {
//
//		FileInputStream file = new FileInputStream("F:\\TESTING\\AUTOMATION\\Excel Input Data\\Test Data.xlsx");
//		String value = WorkbookFactory.create(file).getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
//		return value;
//	}

	/*-----------------------getdata() ------------Method 2nd-------------------------------------*/

	public static String getdata(String SheetName, int Row, int Cell) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("F:\\TESTING\\AUTOMATION\\Excel Input Data\\Test Data.xlsx");
		String value = WorkbookFactory.create(file).getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
		return value;

	}
}
