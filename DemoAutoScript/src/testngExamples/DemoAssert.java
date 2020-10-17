package testngExamples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssert {
	
	@Test
	public void f()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		
	    Assert.assertEquals(sum, 30); //True
	    Assert.assertNotEquals(sum, 90); //True
	    Assert.assertTrue(sum>30); //true
	    Assert.assertFalse(sum>90); //true
	    
	    Reporter.log("last line is executed", true);
	}
	
	@Test
	public void f1()
	{
	    Reporter.log("Second method	", true);

	}

}
