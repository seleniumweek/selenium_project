package testng_sun25;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest {

	@Test(priority=0)
  public void f() {
		System.out.println("c.psd");
  }
	
	@Test(priority=1)
	  public void a() {
		System.out.println("login");
	  }
  
  @BeforeMethod
  public void beforeTest() {
	  System.out.println("Launch");
  }

  @AfterMethod
  public void afterTest() {
	  System.out.println("close");
  }

}
