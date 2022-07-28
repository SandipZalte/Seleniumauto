package PageObjectModel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static  String getdata(int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("F:\\TESTING\\AUTOMATION\\Excel Input Data\\Test Data.xlsx");
	String value= WorkbookFactory.create(file).getSheet("kite").getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	}

}
