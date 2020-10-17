package otherInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScrolling {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.craftsvilla.com/");
	    
	    WebElement tillSuits = driver.findElement(By.xpath("(//img[@title='Suits'])[2]"));
	     Point loc = tillSuits.getLocation();
	     int x=loc.getX();
	     int y=loc.getY();
	     JavascriptExecutor js=(JavascriptExecutor) driver;
	    
		js.executeScript("scrollBy("+x+", "+y+")");
        tillSuits.click();
	    
	    Thread.sleep(8000);
	    //driver.close();
         
	}

}
