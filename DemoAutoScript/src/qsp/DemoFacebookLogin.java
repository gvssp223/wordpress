package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacebookLogin {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.get("https://www.facebook.com");
        
      //   driver.get("https://www.instagram.com");
        
        driver.get("https://www.yahoo.com");
        
	//	driver.findElement(By.id("email")).sendKeys("gvssp.cool@gmail.com");
	//	driver.findElement(By.name("pass")).sendKeys("hgdydgydddd");
	//	driver.findElement(By.id("u_0_c")).click();
        
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input[value='Next']")).click();
				
	}

}
