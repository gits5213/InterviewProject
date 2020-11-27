package testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import testPages.NotificaitonMessagePage;
import utilities.Utils;

public class NotificaitonMessage_18 extends BaseTest{
	
	@Test
	public void notificaitonMessage_18(){
		
		NotificaitonMessagePage nm = new NotificaitonMessagePage(driver);
		driver.get(Utils.BASE_URLS + "/notification_message_rendered");
		sleepTest(1000);
		
		//Test clicks on the Click Here link a multiple times.
	    //Test asserts that one of the “Action Successful”, “Action unsuccessful, please try again” and “Action Unsuccessful” messages show on click.
	    nm.getClickHereToLoadNewMessage().click();
	    sleepTest(1000);
	    String flashNotificaiton = nm.getFlashbar().getText();
	    sleepTest(1000);
	    if (flashNotificaiton.equals(Utils.ACTION_SUCCESSFUL)) {
	    	assertEquals(flashNotificaiton, Utils.ACTION_SUCCESSFUL);
	    }else {
	    	assertEquals(flashNotificaiton, Utils.ACTION_UNSUCCESSFUL);
	    }  
	}
}
