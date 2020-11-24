package testCases;

import org.testng.annotations.Test;
import testPages.Dynamic_controlsPage;
import utilities.Utils;

public class Dynamic_controls extends BaseTest {
	
	@Test
	public void userAbleToValidateErrorTextOnSignInpage(){
		
		Dynamic_controlsPage dcp = new Dynamic_controlsPage(driver);
		driver.get(Utils.BASE_URLS + "/dynamic_controls");
		
		//String loginErrorTextMessage = lp.getLoginErrorMessage().getText();
		//System.out.println(loginErrorTextMessage);
		//assertEquals(Utils.LOGIN_EXPECTED_ERROR_MESSAGE, loginErrorTextMessage);		
	}
}
