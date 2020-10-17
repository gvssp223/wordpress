package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		// driver.get("https://www.yahoo.com");
		//   driver.findElement(By.tagName("input")).sendKeys("Selenium");
		
		// driver .findElement(By.tagName("a")).click();
          // driver.findElement(By.id("i1")).sendKeys("Automation");
		
		//   driver.findElement(By.linkText("Gmail")).click();
		
		//  driver.findElement(By.linkText("Google")).click(); 
		
		//  driver.findElement(By.linkText("Images")).click();
		
		// driver.findElement(By.partialLinkText("How")).click();
		
		// driver.findElement(By.cssSelector("input[data='age']")).sendKeys("22");
		
		// WebElement googleTB = driver.findElement(By.name("s"));
		// googleTB.sendKeys("Selenium");
		// googleTB.sendKeys(Keys.ENTER);
		
	//	googleTB.clear();
 	
	//WebElement var= driver.findElement(By.xpath("//a[@title='google"));
		WebElement var= driver.findElement(By.xpath("//a[contains(text),'Bus')]"));
	// System.out.println(var.getAttribute("title"));
	// driver.get(var.getAttribute("href"));
	
	//System.out.println(var.getText());
	
	//System.out.println(var.getCssValue("font-size"));
	// System.out.println(var.getCssValue("color"));
		
	//	Point loc = var.getLocation();
	//	int x =loc.getX();
	//	int y=loc.getY();
	//	System.out.println("x axis "+x+" y axis "+y);
	
	//	Rectangle dim = var.getRect();
	//	dim.getX();
	//	dim.getY();
	//	int lenght = dim.getHeight();
	//	int Breadth = dim.getWidth();
	//	System.out.println("the area of the web element business is "+lenght*Breadth);
		
	//	Dimension s = var.getSize();
	//	s.getHeight();
	//	s.getWidth();
		
	//	System.out.println(var.getTagName());
		
	//	System.out.println(var.isDisplayed());
		
	//	System.out.println(var.isEnabled());
		
	//	System.out.println(var.isSelected());
		
		var.submit() ;
		Thread.sleep(3000);
	driver.close();
	}
       
}
