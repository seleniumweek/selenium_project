package day3_sat24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert12 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.irctc.co.in");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		d.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(2000);
		String str=d.switchTo().alert().getText();
		System.out.println(str);
		
		Thread.sleep(2000);
		
		d.switchTo().alert().accept();
		

	}

}
