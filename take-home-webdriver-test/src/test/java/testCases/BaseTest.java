package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Utils;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		String baseDir = System.getProperty(Utils.USER_DIR);
		String browserDriver = baseDir + Utils.DRIVER_PATH;
		System.setProperty(Utils.WEB_DRIVER_PATH, browserDriver);
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to(Utils.BASE_URLS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
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
	

}
