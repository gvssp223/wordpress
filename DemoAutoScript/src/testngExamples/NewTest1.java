package testngExamples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void method1() {
	  Reporter.log("test class1",true);
  }
}
