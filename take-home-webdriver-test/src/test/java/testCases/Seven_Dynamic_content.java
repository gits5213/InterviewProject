package testCases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utilities.Utils;

public class Seven_Dynamic_content extends BaseTest {
	
	String returnJqueryReady = "return jQuery.ready";
	String returnDocumentReadyState = "return document.readyState";
	String expectedComplete = "complete";
	
	@Test
	public void dynamic_content(){
		
		//Dynamic_contentPage dc = new Dynamic_contentPage(driver);
		driver.get(Utils.BASE_URLS + "/dynamic_content");
		
		//Test refreshes the page a couple of times.
		//Test asserts that the content changes on each refresh.
		
		driver.navigate().refresh();
		sleepTest(1000);
		driver.navigate().refresh();
		sleepTest(1000);
		((JavascriptExecutor)driver).executeScript(returnJqueryReady); 
		((JavascriptExecutor)driver).executeScript(returnDocumentReadyState).equals(expectedComplete);
	}
}
