package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebDriverMethods {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.craftsvilla.com");
		//driver.navigate().to("https://www.craftsvilla.com");
		driver.navigate().to("https://www.naukri.com"); 
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getTitle());
		driver.switchTo().activeElement().sendKeys("selenium");
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		

	}

}
