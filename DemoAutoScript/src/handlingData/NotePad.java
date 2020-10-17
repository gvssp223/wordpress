package handlingData;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class NotePad {
	
	@Test
	public void readwriteProperty() throws IOException 
	{
	    FileInputStream fis=new FileInputStream("./data/prakash.xlsx");
	   Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Dummy");
	    Row row=sh.createRow(5);
	    Cell cell=row.createCell(0);
	  cell.setCellValue("Automation");	 
	  
	  FileOutputStream fos=new FileOutputStream("./data/prakash.xlsx");
	  wb.write(fos);
	  System.out.println("completed");
//	    Properties pro=new Properties();
//	    pro.load(fis);
//	    System.out.println(pro.getProperty("username"));
//	    pro.setProperty("tata","selenium");
//	    FileInputStream fos=new FileInputStream("./data/notepad.properties");
//	    pro.store(fos, "new update");
//	    fis.close();
//	    fos.close();
	}
	
	
}

