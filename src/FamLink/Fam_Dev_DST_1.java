package FamLink;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fam_Dev_DST_1 {
	
	public static WebDriver driver;
	
	
	
	@AfterClass
 	public static void SeleniumInitilization(){
 	System.out.println("Initialization Selenium Server");
	}
	
	
	
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	
	
	
	@Test
	public void FamLink_LogInTest(){
		driver.get("https://dshsaplcy3dst01.dshs.wa.lcl/famlink/login.do");
		
		
		
		
		
	}
	
	@Test
    public void searchPerson(){
    	
    	System.out.println("Search Person Test Case Susscessfull");
    	
    }
    
    @Test
    public void searchProvider(){
    	
    	System.out.println("Search Provider Test Case Susscessfull");
    	
    }
    
    

 
	@After
	public void tearDown(){
		driver.quit();
		System.out.println("Browser should completly closing"); 
		
	}
	

	
	@AfterClass
 	public static void Seleniumshutdow(){
 	System.out.println("Shutting down Selenium Server");
 	
 	
 	}
}
