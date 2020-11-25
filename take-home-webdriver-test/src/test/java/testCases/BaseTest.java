package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Utils;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		String baseDir = System.getProperty(Utils.USER_DIR);
		String browserDriver = baseDir + Utils.DRIVER_PATH;
		System.setProperty(Utils.WEB_DRIVER_PATH, browserDriver);
		
		//Only for Download file 
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", System.getProperty("user.dir"));

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
		//
        
		driver = new ChromeDriver(options);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to(Utils.BASE_URLS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Method is passing!");
		
	}
	
	@AfterClass
	public void afterClass(){
		driver.quit();
		
	}
	
	public static void sleepTest(long sleeptime) {
		try {Thread.sleep(sleeptime);
		}catch(Exception e) {
			}
		}
	//For Download 
//	protected File getLatestFilefromDir(String dirPath){
//	    File dir = new File(dirPath);
//	    File[] files = dir.listFiles();
//	    if (files == null || files.length == 0) {
//	        return null;
//	    }
//	
//	    File lastModifiedFile = files[0];
//	    for (int i = 1; i < files.length; i++) {
//	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
//	           lastModifiedFile = files[i];
//	       }
//	    }
//	    return lastModifiedFile;
//	}
	

}
