package testCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import testPages.JavascriptAlertPage;
import utilities.Utils;

public class JavascriptAlert_15 extends BaseTest{
	
	@Test
	public void javascriptAlert_15(){
		
		JavascriptAlertPage ja = new JavascriptAlertPage(driver);
		driver.get(Utils.BASE_URLS + "/javascript_alerts");
		sleepTest(1000);
		
		/* Test Clicks on JS Alert Button.
	    + Test asserts alert message.
	    - Test clicks on JS confirm Button and clicks ok on alert.
	    * Test asserts the alert message.
	    + Test clicks on JS Prompt Button and types a message on Prompt.
	    - Test asserts that the alert message contains the typed message.
	    */
		
		ja.getJsAlertBtn().click();
		Alert alert = driver.switchTo().alert();
		sleepTest(1000);
		String alertText = alert.getText();
		System.out.println(alertText);
		Assert.assertEquals(alertText, "I am a JS Alert");
		alert.accept();
		sleepTest(1000);
		
		ja.getJsAlertConfBtn().click();
		Alert alert1 = driver.switchTo().alert();
		sleepTest(1000);
		String alertConfirmText = alert1.getText();
		System.out.println(alertConfirmText);
		Assert.assertEquals(alertConfirmText, "I am a JS Confirm");
		alert1.accept();
		sleepTest(1000);
		
		ja.getJsPromptBtn().click();
		sleepTest(1000);
		Alert promptAlert = driver.switchTo().alert();
		String alertPromptText = promptAlert.getText();
		System.out.println(alertPromptText);
		Assert.assertEquals(alertPromptText, "I am a JS prompt");
		sleepTest(2000);
		promptAlert.sendKeys("aaaaa");
		sleepTest(2000);
		promptAlert.accept();
		sleepTest(2000);
	}
}
