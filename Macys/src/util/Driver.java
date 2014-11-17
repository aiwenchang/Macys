package util;
//create this Driver class so we can have compatibility test on different browsers
//Here I only do functonal test against firefox , later can add more IE/Chrom/Safari Drivers here as well
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	public static WebDriver driver = null;
	public static WebDriver browser (String browser){
		try{
			if(browser.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
			}else if (browser.equalsIgnoreCase("ghost"));
			//driver = new;
		}catch (Exception e){
			return null;
		}
		return driver;
	}
}