package handlingPopUps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingUploadPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("file:///E:/html%20practice/upload.html");
		 
          WebElement uploadButton = driver.findElement(By.id("i1"));
         //sendkeys("absolute_path")
//          uploadButton.sendKeys("C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\data\\words.xlsx");
	    
         //relative_path
         File f=new File("./data/words.xlsx");
         String abs = f.getAbsolutePath();
         uploadButton.sendKeys(abs); 	
	}

}
