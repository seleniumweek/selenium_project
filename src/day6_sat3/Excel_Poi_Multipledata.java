package day6_sat3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel_Poi_Multipledata {
  @Test
  public void f() throws IOException {
	  
	  String input="E:\\workspace_Week_feb\\Selenium_Project\\TestDAta\\links.xlsx";
	  
	  String output="E:\\workspace_Week_feb\\Selenium_Project\\TestDAta\\output_multiple.xlsx";
	  
	  
	  FileInputStream fis=new FileInputStream(input);         
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet ws=  wb.getSheet("Sheet1");
     
     WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		
		int rc= ws.getLastRowNum();
		
		for (int i = 1; i <= rc; i++) 
		{
			
			d.findElement(By.linkText(ws.getRow(i).getCell(0).getStringCellValue())).click();
			
       String acturl=d .getCurrentUrl();
       // store data into sheet
			ws.getRow(i).createCell(2).setCellValue(acturl);
			
			//fetch data from sheet
			String exp= ws.getRow(i).getCell(1).getStringCellValue();
			
			if(exp.equals(acturl))
			{
				ws.getRow(i).createCell(3).setCellValue("PASS");
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("FAIL");
			}
			
			d.navigate().back();
		}
		
		
		
		// stores data into excel
		FileOutputStream fos=new FileOutputStream(output);
		
		wb.write(fos);
		wb.close();
	  
  }
}
