package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFEs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/html%20practice/Demo.html");
		//  driver.findElements(By.xpath("//a"));
//         or
		driver.findElement(By.linkText("Google")).click();
		List<WebElement> fes = driver.findElements(By.tagName("a"));
		int count = fes.size();
	System.out.println("count");
	
//	for(int i=0;i<count;i++)
//	{
//		System.out.println(fes.get(i).getText());
	
//  }
	
    for(WebElement e:fes)
    {
    	System.out.println(e.getText());
    }
	}

}
