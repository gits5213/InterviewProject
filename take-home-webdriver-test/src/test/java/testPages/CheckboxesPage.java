package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage{
	
	public CheckboxesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#checkboxes input[type=checkbox]:nth-child(1)")
	public WebElement firstCheckbox;	
	
	@FindBy(css="#checkboxes input[type=checkbox]:nth-child(3)")
	public WebElement scondCheckbox;
	
	public WebElement getFirstCheckbox() {
		return firstCheckbox;
	}
	public WebElement getScondCheckbox() {
		return scondCheckbox;
	}

}
