package handlingPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		  
		  driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
		  
		  WebDriverWait wait=new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.alertIsPresent());
		  
		  Alert al = driver.switchTo().alert();
		  Thread.sleep(3000);
		  System.out.println(al.getText());
		  al.dismiss();	
		  Thread.sleep(5000);
		  driver.close();
		  
		  

	}

}
