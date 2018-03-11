package day2_sun18;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Element_Present {

	@Test
	public void ff(){
		
		System.setProperty("webdriver.gecko.driver", 
				             "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com");
		d.manage().window().maximize();
		
		String src=d.getPageSource();
		System.out.println(src);
		
		if (src.contains("gmail"))
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
		
		
		
	}

}
