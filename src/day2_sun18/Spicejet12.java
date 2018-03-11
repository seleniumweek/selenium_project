package day2_sun18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet12 {

	public static void main(String[] args) throws Exception {
		
       System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://spicejet.com/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// one way
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		// dep
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		// hyd
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		d.findElement(By.linkText("28")).click();
		
		Thread.sleep(2000);
		d.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys("5");
		Thread.sleep(2000);
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("3");
		

	}

}
