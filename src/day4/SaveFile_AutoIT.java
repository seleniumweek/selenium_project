package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SaveFile_AutoIT {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		d.findElement(By.linkText("3.9.1")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("E:\\workspace_Week_feb\\Selenium_Project\\AutoIT\\savefile.exe");
		
		

	}

}
