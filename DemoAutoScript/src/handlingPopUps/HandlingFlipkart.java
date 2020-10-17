package handlingPopUps;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com");

		  WebDriverWait wait=new  WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@class='_2AkmmA _29YdH8'])")));
		  
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		  WebElement flipkartSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
		  flipkartSearchBox.sendKeys("samsung mobilies");
		  flipkartSearchBox.sendKeys(Keys.ENTER);
		  
		  driver.findElement(By.xpath("//div[text()='Samsung Galaxy Note 9 (Ocean Blue, 512 GB)']"));
		  Set<String> whs = driver.getWindowHandles();
		  
		  Iterator<String> it = whs.iterator();
		  String homeBrowser = it.next();
		  String newTab1 = it.next();
		  
		  driver.switchTo().window("newtab1");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")));
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		  
		  driver.switchTo().window(homeBrowser);
		  Thread.sleep(4000);
		  flipkartSearchBox.clear();
		  driver.quit();;
		  
	}

}
