package day3_sat24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox12 {

	public static void main(String[] args) throws Exception {
		
       System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://echoecho.com/htmlforms09.htm");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> checks=d.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		System.out.println(checks.size());
		
		for (int i = 0; i < checks.size(); i++) 
		{
			
			
			if ( ! checks.get(i).isSelected()) 
			{
				checks.get(i).click();
			}
			else
			{
				System.out.println(checks.get(i).getAttribute("value"));
			}
		}

	}

}
