package inheritTestng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import page.LoginPage;

public class TestLogin_Param extends BaseClassFinder{
	
	@Test
	@Parameters({"username","password"})
	
	 public void verifyValidLogin(String username, String password) throws InterruptedException 
	  {
			WebDriver driver = null;
			LoginPage lp=new LoginPage(driver);
	        lp.setCredentials("username", "password");
	        lp.clickLogin();
	        Thread.sleep(4000);
	        
 }

}
