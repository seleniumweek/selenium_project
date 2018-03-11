package day7_sun4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HRM_Login_DataProvider {
	
	
	
	@DataProvider()
	public Object[][] getData()
	{
		Object data[][]=new Object[2][3];
		
		data[0][0]="Admin";
		data[0][1]="admin";
		data[0][2]="firefox";
		
		data[1][0]="adimmm";
		data[1][1]="qedgetech123";
		data[1][2]="chrome";
		
		return data;
		
	}
	
	
	@Test(dataProvider="getData")
	public void loginTest(String u,String p,String b) throws 
	                                       MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver d=new RemoteWebDriver(new URL
				          ("http://localhost:4444/wd/hub"),cap);
        
		
		d.get("http://opensource.demo.orangehrmlive.com/");
		//d.manage().window().maximize();
		
		// USername
		d.findElement(By.id("txtUsername")).sendKeys(u);
		//password
		d.findElement(By.id("txtPassword")).sendKeys(p);
		
		//login btn
		d.findElement(By.name("Submit")).click();
	}

}



