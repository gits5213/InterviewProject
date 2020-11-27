package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificaitonMessagePage extends BasePage{

	public NotificaitonMessagePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="#content > div > p > a")
	public WebElement clickHereToLoadNewMessage;	
	
	public WebElement getClickHereToLoadNewMessage() {
		return clickHereToLoadNewMessage;
	}
	@FindBy(css="#flash")
	public WebElement flashbar;	
	
	public WebElement getFlashbar() {
		return flashbar;
	}

}
