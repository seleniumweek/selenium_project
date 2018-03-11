package testng_sun25;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_WebdriverWait {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.paytm.com");
		d.manage().window().maximize();
		
		//WebDriverWait wait=new WebDriverWait(d, 50);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='app']/div/div[3]/div/div[4]/div[1]/div[1]/div/div[3]/div/div[4]/a/img"))).click();

		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(d).withTimeout(50, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='app']/div/div[3]/div/div[4]/div[1]/div[1]/div/div[3]/div/div[3]/a/img"))).click();

		
	}

}
