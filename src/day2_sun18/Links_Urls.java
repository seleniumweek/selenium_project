package day2_sun18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_Urls {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.google.com/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		 List<WebElement> links=d.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 for (int i = 0; i < links.size(); i++) 
		 {
			 // if link name is not empty (Visible)
			 if ( ! links.get(i).getText().isEmpty())
			 {
				 
				 links.get(i).click();
					
					String urls=d.getCurrentUrl();
					System.out.println(urls);
					
					d.navigate().back();
					
					  links	=d.findElements(By.tagName("a"));
				
			}
			 else
			 {
				 System.out.println("invisible links are" +  i);
			 }
			 
			
			 
		}
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
