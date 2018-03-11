package day3_sat24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.emirates.com/in/english/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement src=d.findElement(By.xpath("html/body/nav/div[2]/div[2]/ul/li[1]/a"));

		Actions mo=new Actions(d);
		
		Thread.sleep(2000);
		
		mo.moveToElement(src).perform();
		Thread.sleep(2000);
		d.findElement(By.linkText("Book flights")).click();
		
	}

}







