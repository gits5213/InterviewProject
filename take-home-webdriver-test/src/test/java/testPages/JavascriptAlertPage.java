package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavascriptAlertPage extends BasePage{

	public JavascriptAlertPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="#content > div > ul > li:nth-child(1) > button")
	public WebElement jsAlertBtn;	
	
	public WebElement getJsAlertBtn() {
		return jsAlertBtn;
	}
	@FindBy(css="#content > div > ul > li:nth-child(2) > button")
	public WebElement jsAlertConfBtn;	
	
	public WebElement getJsAlertConfBtn() {
		return jsAlertConfBtn;
	}
	@FindBy(css="#content > div > ul > li:nth-child(3) > button")
	public WebElement jsPromptBtn;	
	
	public WebElement getJsPromptBtn() {
		return jsPromptBtn;
	}

}
