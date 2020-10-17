package handlingPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopHTML {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://retail.starhealth.in/policies/instantpay/renew");
		  
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		  js.executeScript("scrollBy(0,200)");
		  WebElement policyNoTB = driver.findElement(By.id("policyNumber"));
		  policyNoTB.sendKeys("i don't know");
		  
		   WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));
//		   element.click();
		  Thread.sleep(3500);
//		  driver.findElement(By.xpath("//th[text()='May 2020']"));
		  
		  String date="13-04-1997";
		  js.executeScript("arguments[0]set.Attribute('value','"+date+"'),element");
		  
		  driver.close();

	}

}
