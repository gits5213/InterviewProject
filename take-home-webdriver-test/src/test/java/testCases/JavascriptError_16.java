package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Date;

import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.Assert;
import org.testng.annotations.Test;
import testPages.JavascriptErrorPage;
import utilities.Utils;

public class JavascriptError_16 extends BaseTest{
	
	@Test
	public void javascriptError_16(){
		
		driver.get(Utils.BASE_URLS + "/javascript_error");
		sleepTest(1000);
		
		//Test finds the JavaScript error on the page.
	    //Test asserts that the page contains error: Cannot read property
		javascriptConsoleError();
	}
}
