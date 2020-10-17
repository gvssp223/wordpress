package examplesofFEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> var = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		for(WebElement we:var)
		{
			System.out.println(we.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
