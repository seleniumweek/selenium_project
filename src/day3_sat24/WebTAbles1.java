package day3_sat24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTAbles1 {

	public static void main(String[] args) throws Exception {
		
//System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//table
		WebElement table=d.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println(cols.size());
			
			for (int j = 0; j < cols.size(); j++) 
			{
				System.out.print(cols.get(j).getText()+"    ");
			}
			
		}

	}

}
