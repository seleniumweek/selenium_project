package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames_Paytm {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://paytm.com/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> src=d.findElements(By.tagName("iframe"));
		System.out.println(src.size());
		
		d.switchTo().frame(0);
		
		d.findElement(By.id("input_0")).sendKeys("1234567890");
		
		d.switchTo().defaultContent();
		
		

	}

}
