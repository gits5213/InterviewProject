package testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import testPages.LoginPage;
import utilities.Utils;

public class LoginFailure extends BaseTest {
	
	@Test
	public void userAbleToValidateErrorTextOnSignInpage(){
		
		LoginPage lp = new LoginPage(driver);
		driver.get(Utils.BASE_URLS + "/login");
		lp.getUserName().sendKeys(Utils.USER_NAME);
		lp.getPassword().sendKeys(Utils.WRONG_PASSWORD);
		lp.getSignInBtn().click();
		String loginErrorTextMessage = lp.getLoginErrorMessage().getText();
		System.out.println(loginErrorTextMessage);
		assertEquals(Utils.LOGIN_EXPECTED_ERROR_MESSAGE, loginErrorTextMessage);		
	}
	
	

}
