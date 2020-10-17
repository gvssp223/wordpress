package otherInterface;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSnapShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
//	    driver.get("https://www.craftsvilla.com/");
//	    driver.get("https://www.google.com/");
	    driver.get("https://www.instagram.com/");
	    
	    TakesScreenshot ts=(TakesScreenshot) driver;
	    File srcFILE = ts.getScreenshotAs(OutputType.FILE);
//	    File destFile=new File("./snapshot1/craftvilla.png");
//	    File destFile=new File("./snapshot1/google.png");
	    File destFile=new File("./snapshot1/own_name.png");
	    FileUtils.copyFile(srcFILE, destFile);
	    
	    Thread.sleep(5000);
	    driver.close();

	}

}
