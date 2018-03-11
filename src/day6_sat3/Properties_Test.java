package day6_sat3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Properties_Test {
  @Test
  public void f() throws IOException {
	
	  // properties 
	  String path=  "E:\\workspace_Week_feb\\Selenium_Project\\test.properties";
	  FileInputStream fisp=new FileInputStream(path);
	  Properties pr=new Properties();
	  pr.load(fisp);
	  
	  // excel
	  FileInputStream fis=new FileInputStream("E:\\workspace_Week_feb\\Selenium_Project\\TestDAta\\Test.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet ws=wb.getSheet("Sheet1");
		 
		   // launch
		   System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			driver.get(ws.getRow(1).getCell(2).getStringCellValue());
			driver.manage().window().maximize();
	  
			// login
			
			driver.findElement(By.id(pr.getProperty("un"))).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
			driver.findElement(By.id(pr.getProperty("psd"))).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("logbtn"))).click();
			
			
	  
  }
}
