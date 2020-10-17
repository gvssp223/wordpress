package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	//declaration -> @FindBy
	@FindBy(name= "username")
	private WebElement usernameTB;
	@FindBy(name="pwd")
	private WebElement passwordTB;
	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginBtn;
	@FindBy(xpath = "//img[contains(@src,'timer.png')]")
	private WebElement loginpage_logo;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		//PageFactory-> initialize all the elements declared by @FindBy
		PageFactory.initElements(driver, this);
		//initElements( WebDriver Driver , current Object)
	}
	
	//utilization
	public void setCredentials(String un,String pw)
	{
		 usernameTB.sendKeys(un);
		 passwordTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	
	public void verifyLogo()
	{
		Assert.assertTrue(loginpage_logo.isDisplayed());
	}

}
