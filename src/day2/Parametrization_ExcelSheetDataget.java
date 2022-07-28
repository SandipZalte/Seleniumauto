package day2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization_ExcelSheetDataget {		// for Data fromGEt particular Exell Sheet
public static void main (String []args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream file=new FileInputStream("F:\\TESTING\\AUTOMATION\\Excel Input Data\\Test Data.xlsx");
	String value =WorkbookFactory.create(file).getSheet("Credentials").getRow(2).getCell(1).getStringCellValue();
	System.out.println(value);
	
	
	
	
}
}
