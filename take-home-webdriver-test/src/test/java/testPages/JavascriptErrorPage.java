package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavascriptErrorPage extends BasePage{

	public JavascriptErrorPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="#content > div > ul > li:nth-child(1) > button")
	public WebElement jsAlertBtn;	
	
	public WebElement getJsAlertBtn() {
		return jsAlertBtn;
	}

}
