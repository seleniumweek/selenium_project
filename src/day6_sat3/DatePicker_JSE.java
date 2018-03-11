package day6_sat3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class DatePicker_JSE {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver;
	  driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);

		//click one way radio
				driver.findElement(By.id("OneWay")).click();
				
				driver.findElement(By.id("FromTag")).sendKeys
			     ("Hyderabad, IN - Rajiv Gandhi International (HYD)");
			
				driver.findElement(By.id("ToTag")).sendKeys
			        ("New Delhi, IN - Indira Gandhi Airport (DEL)");

				Thread.sleep(2000);
				
				JavascriptExecutor obj=(JavascriptExecutor)driver;
				
				obj.executeScript("document.getElementById('DepartDate').value='Mon, 20 May, 2019'");
				
				//obj.executeScript
				// ("document.getElementById('DepartDate').value='Sun, 20 May, 2018'");

	  
  }
}
