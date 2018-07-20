package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sampletest {
  @Test
  public void f() {
	  System.out.println("sindhu");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("vangala");
  }

  @AfterTest
  public void afterTest() {
  }

}
