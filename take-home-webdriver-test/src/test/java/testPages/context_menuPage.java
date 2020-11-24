package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class context_menuPage extends BasePage{
	
	public context_menuPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="#hot-spot")
	public WebElement contextMenuBox;
	
	public WebElement getContextMenuBox() {
		return contextMenuBox;
	}
}
