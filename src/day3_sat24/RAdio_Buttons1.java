package day3_sat24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RAdio_Buttons1 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> radio=d.findElements(By.name("group1"));
		
		for (int i = 0; i < radio.size(); i++) 
		{
			String str=radio.get(i).getAttribute("value");
			
			String str2=radio.get(i).getAttribute("checked");
			
			System.out.println(str+"------"+str2);
			
		}
		
		
		

	}

}
