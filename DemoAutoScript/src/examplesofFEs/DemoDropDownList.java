package examplesofFEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDownList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishnavi\\eclipse-workspace\\AutomationProject\\DemoAutoScript\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///E:/html%20practice/Demo.html");
    
    //single select drop down list
    WebElement SingleSelectDDL = driver.findElement(By.id("s1"));
    Select ss=new Select(SingleSelectDDL);
//  System.out.println(ss.isMultiple()); 
//  ss.selectByIndex(0);
//  ss.selectByValue("value");
//  ss.selectByVisibleText("AndhraPradesh");

//  ss.deselectByValue("v4");
    
    //Multiple select drop down list
    WebElement MultiSelectDDL = driver.findElement(By.xpath("//select[@title='food']"));
    Select ms=new Select(MultiSelectDDL);
    ms.selectByIndex(2);
    ms.selectByValue("m5");
    ms.selectByVisibleText("Idle");
     
    // to fetch all the selected options from the multi selecct DDL
    List<WebElement> allSelected = ms.getAllSelectedOptions();
    for(WebElement we:allSelected)
    {
    	System.out.println("all selected options"+we.getText());	
    }
    
    // to fetch the first selected option from the top		
    WebElement firstSelected = ms.getFirstSelectedOption();
    System.out.println("first selected option"+firstSelected.getText());
    
    //it is used to fetch all the options of the DDL
    List<WebElement> allOptions = ms.getOptions();
    for(WebElement we:allOptions)
    {
    	System.out.println("all options are"+we.getText());
    }
    
    //its is similar to getOptions -> wraps all the options and return as WebElement
    WebElement wrapEle = ms.getWrappedElement();
    System.out.println("wrapped options are"+wrapEle.getText());
       
//    ms.deselectByIndex(4);
//    ms.deselectByValue("m1");
//    ms.deselectByVisibleText("Dosa");
    
    Thread.sleep(3000);
    driver.close();
	}

}
