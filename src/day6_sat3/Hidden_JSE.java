package day6_sat3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Hidden_JSE {
  @Test
  public void f() throws Exception {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("https://www.bing.com/");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//WebElement excel=d.findElement(By.xpath(".//*[@id='officemenu_excel_img']"));
		
		//search box
		WebElement search=d.findElement(By.id("sb_form_q"));
		

		JavascriptExecutor obj=(JavascriptExecutor)d;
		//obj.executeScript("arguments[0].click()", excel);
		
		//obj.executeScript("arguments[0].value='selenium'", search);
		
		//or
		//"document.getElementById('hgh').value='jjj'"
  
      obj.executeScript("window.scrollBy(0,300)");
  
      
      Thread.sleep(3000);
      
      obj.executeScript("window.scrollBy(0,-300)");
      
  
  
  
  
  }
}
