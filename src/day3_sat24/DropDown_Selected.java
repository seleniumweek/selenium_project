package day3_sat24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown_Selected {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		d.findElement(By.linkText("REGISTER")).click();
		
		 WebElement drop=d.findElement(By.name("country"));
		 
		List<WebElement> items=drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		
		for (int i = 0; i < items.size(); i++) 
		{
			String str=items.get(i).getText();
			items.get(i).click();
		
			if(items.get(i).isSelected())
			{
				System.out.println("element is working---"+str);
			}
			else
			{
				System.out.println("element is not working---"+str);
			}
		}
	}

}
