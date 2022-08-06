package pac;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./SdetMe.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		String data = row.getCell(0).getStringCellValue();
		
		Row row3 = sh.getRow(3);
		int data1 = (int) row3.getCell(0).getNumericCellValue();
		
		Row row4 = sh.getRow(3);
		
		/**
		 * to convert any data into string format , 
		 * we use --- toString() method
		 */
		String data2 = row4.getCell(0).toString();
		
		 
		
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2 );
		/**
		 * to convert String data to integer 
		 * we use pa
		 */
		
		String s1 = "123456";
		int a = Integer.parseInt(s1);
		System.out.println(a+5 );
	}
}	
