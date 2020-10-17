package demoFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import inheritTestng.BaseClass;

public class HandlingFrames extends BaseClass{

	@Test
	public void testFrame() throws InterruptedException  {
		
		driver.findElement(By.id("username")).sendKeys("prakash");
		  WebElement p = driver.findElement(By.id("password"));
		  p.sendKeys("Okaymacha");
		  
		  WebElement frameElement = driver.findElement(By.xpath("//iframe[@text=''"));
		  driver.switchTo().frame(0);
		  driver.switchTo().frame("i1");
//		  driver.switchTo().frame(WebElement);
//		  driver.switchTo().frame("Id or name Attribute value");
		  driver.switchTo().frame(frameElement);
		  driver.findElement(By.id("deptInfo")).sendKeys("Automation");
 		driver.switchTo().parentFrame();
 		driver.switchTo().defaultContent();
 		
 		p.clear();
 		
 		Thread.sleep(6000);
           
		

		
		
	}

}
