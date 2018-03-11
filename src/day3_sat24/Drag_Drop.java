package day3_sat24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Exception {
		
     System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		d.switchTo().frame(0);
		
	   WebElement 	src=d.findElement(By.id("draggable"));
	    WebElement 	targ=d.findElement(By.id("droppable"));
	    
	    Actions dd=new Actions(d);
	    
	    Thread.sleep(2000);
	    
	    dd.dragAndDrop(src, targ).perform();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
