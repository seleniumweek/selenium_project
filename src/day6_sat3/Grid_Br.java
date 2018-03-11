package day6_sat3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_Br {
  @Test
  public void f() throws MalformedURLException {
	  
	  DesiredCapabilities capb=null;
	
	  capb=  DesiredCapabilities.chrome();
	capb.setBrowserName("chrome");
	capb.setPlatform(Platform.WINDOWS);
	
	RemoteWebDriver dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capb);
	dr.get("http://google.com");
	
  }
}
