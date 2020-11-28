package testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import testPages.LoginPage;
import utilities.Utils;

public class LoginFailure_2 extends BaseTest {
	
	@Test
	public void userAbleToValidateErrorTextOnSignInpage(){
		
		LoginPage lp = new LoginPage(driver);
		driver.get(Utils.BASE_URLS + "/login");
		
		//Page Object Model for the login page should be used.
		//Test is not able to login with wrong credentials.
		//Test uses assertions to check Login failed for incorrect user and password.
		
		lp.getUserName().sendKeys(Utils.USER_NAME);
		lp.getPassword().sendKeys(Utils.WRONG_PASSWORD);
		lp.getSignInBtn().click();
		String loginErrorTextMessage = lp.getLoginErrorMessage().getText();
		System.out.println(loginErrorTextMessage);
		assertEquals(Utils.LOGIN_EXPECTED_ERROR_MESSAGE, loginErrorTextMessage);		
	}
	
	

}
