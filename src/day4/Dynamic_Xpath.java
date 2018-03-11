package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://yahoo.com");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		d.findElement(By.id("uh-search-box")).sendKeys("selenium");
		
		List<WebElement> ajax=d.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_1519')]/li"));
		System.out.println(ajax.size());
		
		Thread.sleep(2000);
		
		for (int i = 0; i < ajax.size(); i++)
		{
			if (ajax.get(i).getText().equalsIgnoreCase("selenium webdriver"))
			{
				ajax.get(i).click();
				break;
			}
		}
		
	}

}
