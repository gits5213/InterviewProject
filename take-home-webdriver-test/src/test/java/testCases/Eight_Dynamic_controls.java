package testCases;

import org.testng.annotations.Test;
import testPages.Dynamic_controlsPage;
import utilities.Utils;

public class Eight_Dynamic_controls extends BaseTest {
	
	@Test
	public void userAbleToValidateErrorTextOnSignInpage(){
		
		//Dynamic_controlsPage dcp = new Dynamic_controlsPage(driver);
		driver.get(Utils.BASE_URLS + "/dynamic_controls");
		
		//Test clicks on the Remove Button and uses explicit wait.
		//Test asserts that the checkbox is gone.
		//Test clicks on Add Button and uses explicit wait.
		//Test asserts that the checkbox is present.
		//Test clicks on the Enable Button and uses explicit wait.
		//Test asserts that the text box is enabled.
		//Test clicks on the Disable Button and uses explicit wait.
		//Test asserts that the text box is disabled.
		
		
		//String loginErrorTextMessage = lp.getLoginErrorMessage().getText();
		//System.out.println(loginErrorTextMessage);
		//assertEquals(Utils.LOGIN_EXPECTED_ERROR_MESSAGE, loginErrorTextMessage);		
	}
}
