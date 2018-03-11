package day4;

import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SaveFile_Robot {

	
	@Test
	public void robo()throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		//d.findElement(By.linkText("3.9.1")).click();
		
		Thread.sleep(50000);
		
		Robot rb=new Robot();
	
	//Dimension	src=Toolkit.getDefaultToolkit().getScreenSize();
		//System.out.println(src);
		
		rb.mouseMove(1020, 300);
		
		Thread.sleep(2000);
		
		//rb.mousePress(InputEvent.BUTTON1_MASK);
		//rb.mouseRelease(InputEvent.BUTTON1_MASK);
		
		rb.mouseWheel(300);
		
		
		
		//rb.mouseWheel(-200);
		
		
		
		
		
		
		
		
		
		
		
		
		/*rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		*/
		
		
		
		
		
		
		
		
		
		

	}

}




