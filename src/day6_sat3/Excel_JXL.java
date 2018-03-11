package day6_sat3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_JXL {
  @Test
  public void f() throws BiffException, IOException {
	  
	  
	  FileInputStream fis=new FileInputStream("E:\\workspace_Week_feb\\Selenium_Project\\TestDAta\\Testj.xls");
	  Workbook wb= Workbook.getWorkbook(fis);
	   Sheet ws= wb.getSheet("Sheet2");
	   
	   // launch
	   System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get(ws.getCell(2, 1).getContents());
		driver.manage().window().maximize();
		
        driver.findElement(By.id("txtUsername")).sendKeys(ws.getCell(0, 1).getContents());
		
		driver.findElement(By.id("txtPassword")).sendKeys(ws.getCell(1, 1).getContents());
		
		driver.findElement(By.name("Submit")).click();
	   
	   
	   
	  
	  
	  
  }
}
