package day3_sat24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_CLick {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		 WebElement src=d.findElement(By.linkText("Gmail"));
		 
		 Actions rc=new Actions(d);
		 
		 rc.contextClick(src).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		 Thread.sleep(2000);
		 
		 d.close();
	}

}
