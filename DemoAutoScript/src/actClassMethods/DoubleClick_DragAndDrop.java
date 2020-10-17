package actClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_DragAndDrop {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");
				  WebDriver driver=new ChromeDriver();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  driver.manage().window().maximize();
				  driver.get("https://mail.google.com/mail/u/0/#inbox");
          WebElement dclick = driver.findElement(By.xpath("//img[@class='gb_va']"));
          Actions act=new Actions(driver);
          act.doubleClick(dclick).perform();
          
          driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
          
          WebElement src = driver.findElement(By.xpath("//img[contains(text(),'Drag')]"));
          
          WebElement dest = driver.findElement(By.xpath("//div[contains(text(),'Drop')"));
          
          act.dragAndDrop(src, dest).perform();
          
          
	}

}
