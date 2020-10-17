package examplesofPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestInvalidLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
           WebDriver driver=new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.manage().window().maximize();
           driver.get("https://localhost/login.do");
        
           LoginPage_POM lp=new LoginPage_POM(driver);
           driver.navigate().refresh();
           PageFactory.initElements(driver, lp);
           lp.setCredentials("admin","manager");
           lp.clickLogin();
           
           Thread.sleep(4000);
           driver.close();
           
           
	}

}
