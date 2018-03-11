package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;
	
	@BeforeMethod
	  public void beforeTest() {
		
        System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test()
	  public void f() {
	
		driver.findElement(By.id("un")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.name("Submit")).click();
	}
	
	@AfterMethod
	  public void afterTest() {
		  driver.close();
	  }


}
