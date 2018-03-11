package day3_sat24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider12 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/slider/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		d.switchTo().frame(0);
		
	   WebElement 	src=d.findElement(By.xpath("html/body/div/span"));
	  
	    Actions dd=new Actions(d);
	    
	    Thread.sleep(2000);
	    
	    dd.dragAndDropBy(src, 300, 0).perform();
	    
	    dd.dragAndDropBy(src, -300, 0).perform();
	    

	}

}
