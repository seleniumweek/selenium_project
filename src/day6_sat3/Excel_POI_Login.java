package day6_sat3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_POI_Login {
  @Test
  public void loginApp() throws IOException, Exception {
	  
	  FileInputStream fis=new FileInputStream("E:\\workspace_Week_feb\\Selenium_Project\\TestDAta\\Test.xlsx");
	 XSSFWorkbook wb=new XSSFWorkbook(fis);
	 XSSFSheet ws=wb.getSheet("Sheet1");
	 
	   // launch
	   System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get(ws.getRow(1).getCell(2).getStringCellValue());
		driver.manage().window().maximize();
		
       /* driver.findElement(By.id("txtUsername")).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.id("txtPassword")).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
		driver.findElement(By.name("Submit")).click();
	  */
		Thread .sleep(2000);
	  
		 ws.getRow(1).createCell(5).setCellValue("PASSSSS");
		
		FileOutputStream fos=new FileOutputStream("E:\\workspace_Week_feb\\Selenium_Project\\TestDAta\\TestOutput.xlsx");
		wb.write(fos);
		fos.close();
		
		
		
		
  }
}
