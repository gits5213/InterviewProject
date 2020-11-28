package testCases;

import org.testng.annotations.Test;
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
