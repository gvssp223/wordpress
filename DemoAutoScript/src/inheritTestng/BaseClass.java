package inheritTestng;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;

	@BeforeSuite
     public void productInfo()
     {
    	 Reporter.log("This is an employee time sheet manahement tool", true);
     }
     
     @BeforeTest
     public void setPro() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");
     }
     
     @BeforeClass
     public void openApp()
     {
    	 driver = new ChromeDriver();
     	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    	 driver.manage().window().maximize();
    	 driver.get("http://demo.actitime.com/login.do");
    	 Properties prop = new Properties();
//    	 driver.get(prop.getProperty("url"));
//    	 driver.get("file:///E:/html%20practice/CompanyLogin.html");
     }

     @AfterClass
     public void closeApp()
     {
    	 driver.quit();
     }
 
     @AfterSuite
     public void excelReport()
     {
    	 Reporter.log("excel report is generated", true);
     }
     









}
