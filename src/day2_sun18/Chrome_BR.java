package day2_sun18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chrome_BR {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Demo\\chromedriver.exe");

		System.setProperty("webdriver.ie.driver", "E:\\dummy\\IEDriverServer.exe");
		
		WebDriver d=new InternetExplorerDriver();
		d.get("http://google.com");
		
	}

}
