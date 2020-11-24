package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage{
	
	public DropdownPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#content div select#dropdown")
	public WebElement dropDown;	
	
	public WebElement getDropDown() {
		return dropDown;
	}
}
