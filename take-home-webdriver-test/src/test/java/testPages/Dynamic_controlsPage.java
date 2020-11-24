package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dynamic_controlsPage extends BasePage{
	
	public Dynamic_controlsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#content div select#dropdown")
	public WebElement dropDown;	
	
	public WebElement getDropDown() {
		return dropDown;
	}
}
