package handlingPopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.selenium.dev/downloads/");
		  
		  driver.findElement(By.linkText("3.141.59")).click();
		  
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_LEFT);
		  r.keyPress(KeyEvent.VK_LEFT);
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyPress(KeyEvent.VK_ENTER);

		  Thread.sleep(4000);
		  driver.close();

	}

}
