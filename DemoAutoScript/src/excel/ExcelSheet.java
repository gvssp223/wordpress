package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelSheet {

	public static void main(String args[]) throws Throwable, IOException {
	
	FileInputStream fis=new FileInputStream(".\\data\\prakash.xlsx");
	// creating the space for XL sheet
	Workbook wk = WorkbookFactory.create(fis);
	Sheet sh = wk.getSheet("Dummy");
	Row r = sh.getRow(2);
    Cell cell = r.getCell(2);
	System.out.println(cell.toString());
}
	//or
	
//	@Test
//	public void readXLData() throws EncryptedDocumentException, FileNotFoundException, IOException
//	{
//		Workbook wk = WorkbookFactory.create(new FileInputStream("./data/prakash.xlsx"));
//		System.out.println(wk.getSheet("Dummy").getRow(0).getCell(1).toString());
//	}
//	
	
	
	
	
	
	
	
	
}
