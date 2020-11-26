package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FloatingMenuPage extends BasePage{

	public FloatingMenuPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="div#menu")
	public WebElement floatingMenu;
	
	public WebElement getFloatingMenu() {
		return floatingMenu;
	}

}
