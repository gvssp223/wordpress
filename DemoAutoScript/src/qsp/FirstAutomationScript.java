package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstAutomationScript {

	
		// TODO Auto-generated method stub
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
		}
public static void main(String[] args) {
	//to open chrome driver
		ChromeDriver driver = new ChromeDriver();
		//to open firefox driver
		FirefoxDriver driver1 = new FirefoxDriver();
        // open the internet explorer
		InternetExplorerDriver driver2= new InternetExplorerDriver(); 
	}

}
