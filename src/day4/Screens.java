package day4;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screens {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://google.com");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\New Folder (3)\\screen.jpg"));
		
		

	}

}







