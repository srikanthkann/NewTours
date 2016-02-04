/**
 * 
 */
package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

/**
 * @author KSrikanth
 *
 */
public class BrowserUtil {
	
	static WebDriver driver =null;
	
	private BrowserUtil(){
		
	}
	public static WebDriver getDriver(){
		if(driver==null){
			  ProfilesIni allProfiles = new ProfilesIni();
              FirefoxProfile profile = allProfiles.getProfile("selenium");
              driver=new FirefoxDriver(profile);
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              driver.manage().window().maximize();
		}
		
		return driver;
		
		
	}
	
	public static void closeBrowser(){
        driver.quit();
        driver=null;
	}

}
