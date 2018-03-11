package day6_sat3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Windows_handle {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.online.citibank.co.in/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
	
		String parent_win=d.getWindowHandle();
		System.out.println(parent_win);
		
		
		//click LOGIN NOW button
		d.findElement(By.xpath("html/body/div[10]/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
		
	Set<String>	 strrr=d.getWindowHandles();
	System.out.println(strrr);	
	
		Sleeper.sleepTightInSeconds(2);
		
		// for each loop will take current window id ( child )
		for (String child_win : d.getWindowHandles()) {

			System.out.println("child id---"+child_win);
			
			d.switchTo().window(child_win);
			
		}
		Sleeper.sleepTightInSeconds(2);
		
		// user id text box in child window
		d.findElement(By.id("User_Id")).sendKeys("1212121222");
		
		Sleeper.sleepTightInSeconds(2);
		
		d.close();
		
		d.switchTo().window(parent_win);
		
		Sleeper.sleepTightInSeconds(2);
		
		d.quit();
	  
		
  }
}
