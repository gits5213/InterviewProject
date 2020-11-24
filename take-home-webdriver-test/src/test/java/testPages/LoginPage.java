package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#username")
	public WebElement userName;
	
	@FindBy(css="#password")
	public WebElement password;
	
	@FindBy(css="#login button")
	public WebElement signInBtn;
	
	@FindBy(css="#flash")
	public WebElement loginErrorMessage;	
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignInBtn() {
		return signInBtn;
	}
	public WebElement getLoginErrorMessage() {
		return loginErrorMessage;
	}

}
