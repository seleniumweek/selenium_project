package day6_sat3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validations_java {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	  String exp="ggoogle";
	  
	   String act=d.getTitle();
	   System.out.println(act);
	   
	   
	   Assert.assertEquals(act, exp);
	  
	   System.out.println("TC PASS");
	   
	   
	   /*if (exp.equals(act)) 
	   {
		   System.out.println("TC PASS");
	   }
	   else
	   {
		   System.out.println("TC FAIL");
	   }*/
	   
		
  }
}
