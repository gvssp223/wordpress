package testngExamples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BestExample {

	@Test
	public static void signUp()
	{
	   	Reporter.log("User sign up",true);
	}
	
	@Test(dependsOnMethods= "signUp")
	public static void login()
	{
	   	Reporter.log("User login",true);
    }
    
	@Test(dependsOnMethods= {"signUp","login"},priority=0)
//	@Test(invocationCount=0)
	public static void performTask()
	{
	   	Reporter.log("user perform task",true);
	}
	
	@Test(dependsOnMethods= "login",priority=1)
//	@Test(enabled = false)
	public static void logout()
	{
	   	Reporter.log("user logout",true);
	}
}