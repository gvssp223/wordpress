package testngExamples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(priority = 0)
	public static void testA()
	{
	   	Reporter.log("teamA",true);
	}
	
	@Test(priority = 1)
	public static void testB()
	{
	   	Reporter.log("teamB",true);
	}

	@Test(priority = 2)
	public static void testC()
	{
	   	Reporter.log("teamC",true);
	}

	@Test(priority = 3)
	public static void testD()
	{
	   	Reporter.log("teamD",true);
	}
    
	@Test(priority = 4)
	public static void testE()
	{
	   	Reporter.log("teamE",true);
	}

}
