package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingPage extends BasePage{
	
	public DynamicLoadingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#start > button")
	public WebElement startBtn;	
	
	@FindBy(css="#finish > h4")
	public WebElement helloWorld;
	
	public WebElement getStartBtn() {
		return startBtn;
	}
	
	public WebElement getHelloWorld() {
		return helloWorld;
	}
}