package inheritTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.LoginPage;

public class TestLogin extends BaseClass {

	  @Test(dataProvider="dp")
	  public void verifyValidLogin(String username, String password) throws InterruptedException 
	  {
			LoginPage lp=new LoginPage(driver);
	        lp.setCredentials("username", "password");
	        lp.clickLogin();
	        Thread.sleep(4000);
	        
  }
	  
	  @DataProvider
	  public  void dp()
	  {
//		  return new String[][] {{"ad min","manager"},{"12345","manager"},{"@)(*&","manager"},{"","manager"},
//			  {"ADMIN","manager"},{"A_@3r","manager"}};
	  }
  
  @Test(dependsOnMethods = "verifyValidLogin")
  public void verifyInValidLogin() throws InterruptedException
  {
	        LoginPage lp=new LoginPage(driver);
            lp.setCredentials("java", "selenium");
            lp.clickLogin(); 
            Thread.sleep(2000);
          }
}
