package actClassMethods;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicitWait {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com");
		  
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.titleContains("google"));
//		  wait.until(ExpectedConditions.titleContains("prakash"));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))); 	
          WebElement element = driver.findElement(By.xpath(""));
		  wait.until(ExpectedConditions.invisibilityOf(element));
		  element.click();
		  
		  driver.switchTo().activeElement().sendKeys("Selenium");	  
//		  Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
//		            .withTimeouts(30, TimeUnit.SECONDS);
//		            .pollingEvery(5, TimeUnit.SECONDS);
//		            .ignoring(NoSuchElementException.class);
				  

	}

}
