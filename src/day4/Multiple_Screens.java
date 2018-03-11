package day4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Screens {

	public static void main(String[] args) throws InterruptedException, IOException {
		
//System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		 List<WebElement> links=d.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 for (int i = 0; i < links.size(); i++) 
		 {
			 String str=links.get(i).getText();
			 
			 // if link name is not empty (Visible)
			 if ( ! links.get(i).getText().isEmpty())
			 {
				 
				 links.get(i).click();
					
					File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(src, new File("E:\\New Folder (3)\\"+str+".png"));
					
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
