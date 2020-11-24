package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#flash")
	public WebElement loginSuccessMessage;	
	
	public WebElement getLoginSuccessMessage() {
		return loginSuccessMessage;
	}

}
