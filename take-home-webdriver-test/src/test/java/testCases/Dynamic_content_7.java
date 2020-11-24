package testCases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import testPages.Dynamic_contentPage;
import utilities.Utils;

public class Dynamic_content_7 extends BaseTest {
	
	String returnJqueryReady = "return jQuery.ready";
	String returnDocumentReadyState = "return document.readyState";
	String expectedComplete = "complete";
	
	@Test
	public void dynamic_content(){
		
		Dynamic_contentPage dc = new Dynamic_contentPage(driver);
		driver.get(Utils.BASE_URLS + "/dynamic_content");
		driver.navigate().refresh();
		sleepTest(1000);
		driver.navigate().refresh();
		sleepTest(1000);
		((JavascriptExecutor)driver).executeScript(returnJqueryReady); 
		((JavascriptExecutor)driver).executeScript(returnDocumentReadyState).equals(expectedComplete);
	}
}
