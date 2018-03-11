package day2_sun18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddenlink_Count {

	public static void main(String[] args) throws Exception {
	
System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.google.com/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		 List<WebElement> links=d.findElements(By.tagName("a"));
		 System.out.println("Toatl links are--"+links.size());
		 
		 int count=0;
		 int hidden=0;
		 
		 for (int i = 0; i < links.size(); i++) 
		 {
			
			 if ( ! links.get(i).getText().isEmpty()) 
			 {
				count=count+1;
			}
			 
		}
System.out.println("Visible links----"+count);
System.out.println("INVisible links----"+(links.size()-count));
		 
	}

}
