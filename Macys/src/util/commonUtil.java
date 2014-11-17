package util;


// creat this commom utility as project independent so it can be re-used cross projects
import java.util.concurrent.TimeUnit;

public class commonUtil {
		//Here I would like to give a method implicitWait which allows waiting time for bringing up the browser
	public static boolean implicitWait(long time){
			try{
				Driver.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			}catch (Exception e){
				return false;
			}
			return true;
		}
	public static boolean launchBrowser (String url){
			try{
				Driver.driver.get(url);
				Driver.driver.manage();
				System.out.println("Browser Launched successfully");
			}catch (Exception e){
				return false;
			}
			return true;
		}
	}

