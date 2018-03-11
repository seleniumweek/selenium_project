package testng_sun25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
  @Test
  public void f() {
	  
	  
		WebDriver d=new FirefoxDriver();
		d.get("https://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		d.findElement(By.linkText("3.10.0")).click();
		
  }
}
