import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;


public class no_sendkeys {
	
	 
	  public static void setAttribute(WebElement element, String attributeName,String value){	  		
			WrapsDriver wd = (WrapsDriver) element;
			JavascriptExecutor Driver = (JavascriptExecutor)wd.getWrappedDriver();
			Driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])",
			element, attributeName, value); }
			
			public static void main(String[] args){
	    	WebDriver driver=new FirefoxDriver();
	    	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.get("https://www.facebook.com/");   
	    	
	    	 WebElement TypeText=driver.findElement(By.xpath("//*[@id='email']"));
	    	 setAttribute(TypeText,"value","2automationremoteschool@gmail.com"); }	}


