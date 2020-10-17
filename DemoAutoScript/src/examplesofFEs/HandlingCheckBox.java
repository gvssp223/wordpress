package examplesofFEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/html%20practice/Demo.html");
		List<WebElement> cBoxes = driver.findElements(By.xpath("//input[@type='checkbox'])"));
		
		//for loop
		
		for(int i=0;i<cBoxes.size();i++)
		{
		//	System.out.println(i+""+cBoxes.get(i).isSelected());
			cBoxes.get(i).click();
			System.out.println(i+""+cBoxes.get(i).isSelected());
		}
		
		// for each loop
		for(WebElement prakash:cBoxes)
		{
			prakash.click();
		}

	}

}
